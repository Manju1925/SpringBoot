package com.edigest.SpringProject.Controller;

import com.edigest.SpringProject.Entity.JournalEntry;
import com.edigest.SpringProject.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getAll(){

        return null;

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getById(@PathVariable long myId){
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteById(@PathVariable long myId){
        return null;
    }

    @PutMapping
    public boolean updateJournalById(@RequestBody JournalEntry myEntry){

        return true;
    }
}
