package mms.services;

import mms.mapper.MedTypeMapper;
import mms.pojo.MedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MedTypeService {
    @Autowired
    private MedTypeMapper medTypeMapper;

    public MedType queryMedicineTypeByMno(String mdo){
        return medTypeMapper.queryMedicineTypeByMno(mdo);
    }

    public String  saveMedType(MedType medType){
        int rows=medTypeMapper.saveMedType(medType);
        if (rows>0){
            return "保存成功!";
        }
        else {
            return "保存失败！";
        }
    }
}
