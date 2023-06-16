package com.nodens.Musicians.Services;

import com.nodens.Musicians.Documents.Musician;

import java.util.List;

public interface MusicianService {
    List<Musician> getAllMusicians();
    Musician createAMusician(Musician newMusician);
    void DeleteAMusician(String id);
    Musician getMusicianById(String id);
    Musician updateMusician(Musician updatedMusician);
}
