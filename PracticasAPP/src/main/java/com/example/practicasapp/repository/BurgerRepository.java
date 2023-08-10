package com.example.practicasapp.repository;

import com.example.practicasapp.models.Burger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends JpaRepository<Burger, Long>{

}
