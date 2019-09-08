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

    /**
     * 医生信息查询
     * @param doto
     * @return
     */
    @RequestMapping(value = "queryDoctorByDoto",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public Doctor queryDoctorByDoto(String doto){
        Doctor doctor=doctorService.queryDoctorByDoto(doto);
        return doctor;
    }

    //医生添加
    @RequestMapping(value = "saveDoctor",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String saveDoctor(Doctor doctor){
        return doctorService.savaDoctor(doctor);
    }

}
