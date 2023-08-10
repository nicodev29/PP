package com.example.practicasapp.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "burgers")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column (name = "nombre", length = 80)
    private String name;
    @Column (name = "descripcion", length = 80)
    private String description;
    @Column (name = "imageUrl", length = 80)
    private String image;
    @Column (name = "precio")
    private Double price;

}
