package com.myGameCollection.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myGameCollection.modelo.Juego;

public interface JuegoDao extends JpaRepository<Juego, Integer>{

}
