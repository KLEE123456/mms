package mms.controller;

import mms.pojo.Doctor;
import mms.pojo.EasyUIResult;
import mms.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    @ResponseBody
    @RequestMapping(value = "queryDoctorByDoto")
    public Doctor queryDoctorByDoto(String doto){
        Doctor doctor=doctorService.queryDoctorByDoto(doto);
        System.out.println(doctor);
        System.out.println(doctor);
        return doctor;
    }

    //医生添加
    @RequestMapping(value = "saveDoctor",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String saveDoctor(Doctor doctor){
        return doctorService.savaDoctor(doctor);
    }

    // easyui返回json
    @RequestMapping("GetMessage")
    @ResponseBody
    public EasyUIResult queryAllMedicine(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                         @RequestParam(value = "rows", defaultValue = "5") Integer rows) {
        return doctorService.queryAllDoctor(page, rows);
    }

    @RequestMapping(value = "findAllDoctor")
    @ResponseBody
    public List<Doctor> findAllDoctor(){
       List<Doctor> doctorList=doctorService.findAllDoctor();
       return doctorList;
    }
    // 批量删除
    @RequestMapping(value = "DeleteRows", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteDoctorByRows(@RequestParam(value = "array[]") String[] array) {
        try {

            return doctorService.deleteDoctorByRows(array);

        } catch (Exception e) {
            // TODO: handle exception
            return "操作异常，可能某些病人正在被该医生治疗，" + "无法删该医生，请重新选择";
        }
    }

    //医生信息修改
    @ResponseBody
    @RequestMapping(value = "modifyDoctor",produces = "text/html;charset=UTF-8")
    public String modifyDoctor(Doctor doctor){
        return doctorService.modifyDoctor(doctor);
    }

}
