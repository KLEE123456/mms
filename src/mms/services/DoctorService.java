package mms.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mms.mapper.DoctorMapper;
import mms.pojo.Client;
import mms.pojo.Doctor;
import mms.pojo.EasyUIResult;
import mms.pojo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class DoctorService {
    @Autowired
    private DoctorMapper mapper;

    /**
     * 医生信息查询
     * @param doto
     * @return
     */
    public Doctor queryDoctorByDoto(String doto){
        return mapper.queryDoctorByDoto(doto);
    }

    /**
     * 添加医生
     * @param doctor
     * @return
     */
    public String savaDoctor(Doctor doctor){
        Doctor doctor1=mapper.queryDoctorByDoto(doctor.getDoto());
        try {
            if (doctor1!=null){
                return "保存失败,编号重复！";
            }
            mapper.savaDoctor(doctor);
            return "操作成功!";
        }catch (Exception e){
            return "操作异常!";
        }



    }


    //查询所有的医生信息
    public EasyUIResult queryAllDoctor(Integer page, Integer rows) {
        // TODO Auto-generated method stub
        PageHelper.startPage(page, rows);
        List<Doctor> doctors=mapper.queryAllDoctor();
        PageInfo<Doctor> pageInfo = new PageInfo<Doctor>(doctors);
        return new EasyUIResult(pageInfo.getTotal(), doctors);
    }

    //删除医生信息
    public String deleteDoctorByRows(String[] array) {
        // TODO Auto-generated method stub
        try {
            for (String doto : array) {
                mapper.deleteDoctorByDoto(doto);
            }
        } catch (Exception e) {
            // TODO: handle exception
            // 抛出异常让spring捕获，进行事务回滚
            throw new RuntimeException();

        }
        return "删除成功";
    }

    public String modifyDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        Doctor doctor1=mapper.queryDoctorByDoto(doctor.getDoto());
        if (doctor1!=null){
            if (doctor.getDotid() != doctor1.getDotid()){
                return "编号与他人重复,请修改";
            }
        }
        mapper.modifyDoctor(doctor);
        return "修改成功";
    }

    public List<Doctor> findAllDoctor(){
       return mapper.queryAllDoctor();
    }

}
