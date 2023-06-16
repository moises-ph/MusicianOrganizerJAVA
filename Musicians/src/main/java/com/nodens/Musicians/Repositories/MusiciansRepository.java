package com.nodens.Musicians.Repositories;

import com.nodens.Musicians.Documents.Musician;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusiciansRepository extends MongoRepository<Musician, String> {
}
