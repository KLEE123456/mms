package mms.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mms.mapper.MedTypeMapper;
import mms.pojo.EasyUIResult;
import mms.pojo.MedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class MedTypeService {
    @Autowired
    private MedTypeMapper medTypeMapper;

    public MedType queryMedicineTypeByMno(String mdo){
        return medTypeMapper.queryMedicineTypeByMno(mdo);
    }

    public String  saveMedType(MedType medType){
        MedType medType1=medTypeMapper.queryMedicineTypeByMno(medType.getMdo());
        try {
            if (medType1!=null){
                return "操作失败，编号重复!";
            }
            medTypeMapper.saveMedType(medType);
            return "操作成功!";

        }catch (Exception e){
            return "操作异常!";
        }

    }

    //查询所有药品类别
    public EasyUIResult queryAllMedType(Integer page, Integer rows) {
        // TODO Auto-generated method stub
        PageHelper.startPage(page, rows);
        List<MedType> medTypes=medTypeMapper.queryAllMedType();
        PageInfo<MedType> pageInfo = new PageInfo<MedType>(medTypes);
        return new EasyUIResult(pageInfo.getTotal(), medTypes);
    }

    //药品类别的删除
    public String deleteMedTypeByRows(String[] array) {
        // TODO Auto-generated method stub
        try {
            for (String mdo : array) {
                medTypeMapper.deleteMedTypeByMno(mdo);
        }
        } catch (Exception e) {
            // TODO: handle exception
            // 抛出异常让spring捕获，进行事务回滚
            throw new RuntimeException();

        }
        return "删除成功";
    }

    //药品类别信息的修改
    public String modifyMedTyep(MedType medType){
        MedType medType1=medTypeMapper.queryMedicineTypeByMno(medType.getMdo());
        if (medType1!=null){
            if (medType.getMdtypeid()!=medType1.getMdtypeid()){
                return "编号重复,请修改!";
            }
        }
        medTypeMapper.modifyMedType(medType);
        return "修改成功!";
    }

    public  List<MedType> findAllMedType(){
        return medTypeMapper.queryAllMedType();
    }

}
