package com.hms.controller;

import com.hms.model.Medicine;
import com.hms.service.MedicineService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/meds")
public class MedicineController {

    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping(path = "/add")
    public @ResponseBody Medicine addMedicine(@RequestBody Medicine medicine) {
        // Call the service layer to save the medicine and return the saved object
        return medicineService.save(medicine);
    }

    @GetMapping(path = "/allmeds")
    public @ResponseBody Iterable<Medicine> getAllMedicines() {
        return medicineService.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Medicine getMedicineById(@PathVariable long id) {
        return medicineService.findMedicineById(id);
    }

    @PutMapping(path = "/modify/{id}")
    public @ResponseBody Medicine updateMedicineById(@PathVariable long id, @RequestBody Medicine medicine) {
        return medicineService.updateMedicineById(id, medicine);
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteMedicineById(@PathVariable long id) {
        medicineService.deleteMedicineById(id);
        return "Record Deleted";
    }
}
