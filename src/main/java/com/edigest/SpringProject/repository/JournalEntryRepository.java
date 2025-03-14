package com.edigest.SpringProject.repository;

import com.edigest.SpringProject.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry,String> {
}
