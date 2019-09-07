package mms.services;

import mms.mapper.DoctorMapper;
import mms.pojo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorMapper mapper;

    public Doctor queryDoctorByDoto(String doto){
        return mapper.queryDoctorByDoto(doto);
    }


}
