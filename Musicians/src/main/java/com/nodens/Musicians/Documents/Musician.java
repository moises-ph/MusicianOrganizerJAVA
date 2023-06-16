package com.nodens.Musicians.Documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Musicians_test")
@Data
@AllArgsConstructor
public class Musician {
    @Id
    private String _id;
    private int IdAuth;
    private String Name;
    private String Lastname;
    private String fecha_nacimiento;
    private List<Instruments> instrumentos;
    private String genero;
    private String descripcion;
    private List<String> generosMusicales;
    private String pais;
    private String ciudad;
    private String experiencia;
    private List<Educacion> educacion;
    private String url_foto_perfil;
    private List<String> url_video_presentacion;
    private List<RedesSociales> redes_sociales;
    private List<String> telefono;
}
