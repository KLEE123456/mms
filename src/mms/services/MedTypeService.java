package mms.services;

import mms.mapper.MedTypeMapper;
import mms.pojo.MedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedTypeService {
    @Autowired
    private MedTypeMapper medTypeMapper;

    public MedType queryMedicineTypeByMno(String mdo){
        return medTypeMapper.queryMedicineTypeByMno(mdo);
    }
}
