package com.nodens.Musicians.Services;

import com.nodens.Musicians.Documents.Musician;
import com.nodens.Musicians.Repositories.MusiciansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicianServiceIMPL implements MusicianService{
    private final MusiciansRepository repo;

    @Autowired
    public MusicianServiceIMPL(MusiciansRepository repository){ this.repo = repository; }

    @Override
    public List<Musician> getAllMusicians() {
        return this.repo.findAll();
    }

    @Override
    public Musician createAMusician(Musician newMusician) {
        return this.repo.save(newMusician);
    }

    @Override
    public void DeleteAMusician(String id) {
        this.repo.deleteById(id);
    }

    @Override
    public Musician getMusicianById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Musician updateMusician(Musician updatedMusician) {
        return this.repo.save(updatedMusician);
    }
}
