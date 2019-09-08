package mms.services;

import mms.mapper.DoctorMapper;
import mms.pojo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        int rows=mapper.savaDoctor(doctor);
        if (rows>0){
            return "保存成功!";
        }
        else {
            return "保存失败!";
        }
    }
}
