package mms.mapper;


import mms.pojo.MedType;

public interface MedTypeMapper {
    MedType queryMedicineTypeByMno(String mdo);
}
