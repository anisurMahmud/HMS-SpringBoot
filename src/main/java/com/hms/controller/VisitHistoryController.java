package com.hms.controller;

import com.hms.dto.VisitHistoryResponseDTO;
import com.hms.model.VisitHistory;
import com.hms.service.VisitHistoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/visits")
public class VisitHistoryController {

    private final VisitHistoryService visitHistoryService;

    public VisitHistoryController(VisitHistoryService visitHistoryService) {
        this.visitHistoryService = visitHistoryService;
    }

    @PostMapping(path = "/")
    public @ResponseBody VisitHistory addVisitHistory(@RequestBody VisitHistory visitHistory) {
        return visitHistoryService.addVisitHistory(visitHistory);
    }

    @GetMapping(path = "/allrecs")
    public @ResponseBody List<VisitHistoryResponseDTO> getAllVisitHistory() {
        return visitHistoryService.getAllVisitHistory();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody VisitHistoryResponseDTO getVisitHistoryById(@PathVariable int id) {
        return visitHistoryService.getVisitHistoryById(id);
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteVisitHistoryById(@PathVariable int id) {
        visitHistoryService.deleteVisitHistoryById(id);
        return "Record Deleted";
    }
}
