package com.hms.controller;

import com.hms.dto.MedicineResponseDTO;
import com.hms.model.Medicine;
import com.hms.service.MedicineService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/meds")
public class MedicineController {

    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    /**
     * Adds a new Medicine object.
     *
     * @param medicine The Medicine object to be added, received from the request body.
     * @return The saved Medicine object.
     */

    @PostMapping(path = "/add")
    public @ResponseBody Medicine addMedicine(@RequestBody Medicine medicine) {
        // Call the service layer to save the medicine and return the saved object
        return medicineService.save(medicine);
    }

    /**
     * Retrieves all Medicine objects.
     *
     * @return An iterable collection of all Medicine objects.
     */

    @GetMapping(path = "/allmeds")
    public @ResponseBody List<MedicineResponseDTO> getAllMedicines() {
        // Call the service layer to fetch all medicines
        return medicineService.findAll();
    }

    /**
     * Retrieves a specific Medicine object by its ID.
     *
     * @param id The ID of the Medicine to be retrieved.
     * @return The Medicine object with the specified ID.
     */

    @GetMapping(path = "/{id}")
    public @ResponseBody MedicineResponseDTO getMedicineById(@PathVariable long id) {
        // Call the service layer to find a medicine by its ID
        return medicineService.findMedicineById(id);
    }

    /**
     * Updates an existing Medicine object by its ID.
     *
     * @param id The ID of the Medicine to be updated.
     * @param medicine The Medicine object containing updated values.
     * @return The updated Medicine object.
     */

    @PutMapping(path = "/modify/{id}")
    public @ResponseBody Medicine updateMedicineById(@PathVariable long id, @RequestBody Medicine medicine) {
        // Call the service layer to update the medicine by ID and return the updated object
        return medicineService.updateMedicineById(id, medicine);
    }

    /**
     * Deletes an existing Medicine object by its ID.
     *
     * @param id The ID of the Medicine to be deleted.
     * @return Record Deleted.
     */

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteMedicineById(@PathVariable long id) {
        // Call the service layer to delete the medicine by ID
        medicineService.deleteMedicineById(id);
        return "Record Deleted";
    }
}
