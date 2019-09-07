package mms.controller;

import mms.pojo.MedType;
import mms.services.MedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "MedType")
public class MedTypeController {
    @Autowired
    private MedTypeService medTypeService;

    @RequestMapping(value = "queryMedicineTypeByMno")
    @ResponseBody
    public MedType queryMedicineTypeByMno(String  mdo){
        MedType medType1=medTypeService.queryMedicineTypeByMno(mdo);
        return medType1;
    }
}
