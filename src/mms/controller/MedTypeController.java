package mms.controller;

import mms.pojo.EasyUIResult;
import mms.pojo.MedType;
import mms.services.MedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping(value = "saveMedType",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String  saveMedType(MedType medType){
        return medTypeService.saveMedType(medType);
    }

    // easyui返回json
    @RequestMapping("GetMessage")
    @ResponseBody
    public EasyUIResult queryAllMedicine(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                         @RequestParam(value = "rows", defaultValue = "5") Integer rows) {
        return medTypeService.queryAllMedType(page, rows);
    }

    //药品类别的删除
    @RequestMapping(value = "DeleteRows", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deleteMedTyperByRows(@RequestParam(value = "array[]") String[] array){
        try {
            return medTypeService.deleteMedTypeByRows(array);
        }catch (Exception e){
            return "操作异常，该药品类别下有药品,不能删除!";
        }
    }

    @RequestMapping(value = "findAllMedType")
    @ResponseBody
    public List<MedType> findAllMedType(){
        List<MedType> medTypes=medTypeService.findAllMedType();
        return medTypes;
    }

    //药品类别的修改
    @ResponseBody
    @RequestMapping(value = "modifyMedType",produces = "text/html;charset=UTF-8")
    public String modifyMedType(MedType medType){
        return medTypeService.modifyMedTyep(medType);
    }
}
