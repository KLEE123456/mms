package mms.mapper;

import mms.pojo.Doctor;

import java.util.List;

public interface DoctorMapper {
    Doctor queryDoctorByDoto(String doto);
    void savaDoctor(Doctor doctor);
    List<Doctor> queryAllDoctor();
    int deleteDoctorByDoto(String doto);
    int modifyDoctor(Doctor doctor);
}
