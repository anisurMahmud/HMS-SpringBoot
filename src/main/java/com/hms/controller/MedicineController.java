package com.hms.controller;

import com.hms.model.Medicine;
import com.hms.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/meds")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping(path = "/add")
    public @ResponseBody Medicine addMedicine(@RequestBody Medicine medicine) {
        return medicineService.save(medicine);
    }

    @GetMapping(path = "/allmeds")
    public @ResponseBody Iterable<Medicine> getAllMedicines() {
        return medicineService.findAll();
    }
}
