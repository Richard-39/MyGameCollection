package com.myGameCollection.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myGameCollection.modelo.Juego;

public interface JuegoDao extends JpaRepository<Juego, Integer>{
	
	public List<Juego> findByNombreLike(String nombre);

}
