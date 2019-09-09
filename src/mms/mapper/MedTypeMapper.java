package mms.mapper;


import mms.pojo.MedType;

import java.util.List;

public interface MedTypeMapper {
    MedType queryMedicineTypeByMno(String mdo);
    void saveMedType(MedType medType);
    List<MedType> queryAllMedType();
    int deleteMedTypeByMno(String mdo);
    int modifyMedType(MedType medType);
}
