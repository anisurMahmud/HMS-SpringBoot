package com.hms.controller;

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
    public @ResponseBody List<VisitHistory> getAllVisitHistory() {
        return visitHistoryService.getAllVisitHistory();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody VisitHistory getVisitHistoryById(@PathVariable int id) {
        return visitHistoryService.getVisitHistoryById(id);
    }
}
