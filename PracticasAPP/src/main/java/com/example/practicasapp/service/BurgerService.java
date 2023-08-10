package com.example.practicasapp.service;

import com.example.practicasapp.models.Burger;

import java.util.List;

public interface BurgerService {

    List<Burger> findAll();
    Burger findById(Long id);
    Burger save(Burger Burger);
    void deleteById(Long id);

}
