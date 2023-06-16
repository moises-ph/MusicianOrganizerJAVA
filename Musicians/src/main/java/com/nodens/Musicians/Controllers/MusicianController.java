package com.nodens.Musicians.Controllers;

import com.nodens.Musicians.Documents.Musician;
import com.nodens.Musicians.Services.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/musician")
@CrossOrigin
public class MusicianController {

    private MusicianService service;

    @Autowired
    public MusicianController(MusicianService musicianService){ this.service = musicianService; }

    @GetMapping("/all")
    public ResponseEntity<List<Musician>> GetAllMusicians(){
        return ResponseEntity.ok(this.service.getAllMusicians());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musician> GetMusicianById(@PathVariable String id){
        return ResponseEntity.ok(this.service.getMusicianById(id));
    }

    @PostMapping("/")
    public ResponseEntity<?> PostNewMusician(@RequestBody Musician newMusician){
        Musician created = this.service.createAMusician(newMusician);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Información del músico creada correctamente");
        response.put("newMusician", created);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/")
    public ResponseEntity<?> PutMusician(@RequestBody Musician newMusician){
        Musician created = this.service.updateMusician(newMusician);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Información del músico actualizada Correctamente");
        response.put("newMusician", created);
        return ResponseEntity.ok(response);
    }

}
