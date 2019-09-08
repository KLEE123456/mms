package mms.mapper;

import mms.pojo.Doctor;

public interface DoctorMapper {
    Doctor queryDoctorByDoto(String doto);
    int savaDoctor(Doctor doctor);
}
