package mms.controller;

import mms.pojo.Doctor;
import mms.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value ="Doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "queryDoctorByDoto")
    @ResponseBody
    public Doctor queryDoctorByDoto(String doto){
        Doctor doctor=doctorService.queryDoctorByDoto(doto);
        return doctor;
    }

}
