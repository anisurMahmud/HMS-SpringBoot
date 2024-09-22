package com.hms.controller;

import com.hms.model.Medicine;
import com.hms.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/meds")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping(path = "/add")
    public @ResponseBody Medicine addMedicine(@RequestBody Medicine medicine) {
        return medicineService.save(medicine);
    }
}
