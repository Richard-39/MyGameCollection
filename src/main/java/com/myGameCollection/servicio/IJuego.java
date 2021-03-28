package com.myGameCollection.servicio;

import com.myGameCollection.modelo.Juego;
import com.myGameCollection.vo.JuegoVo;

public interface IJuego {

	public JuegoVo findAll();
	public JuegoVo findByName(String name);
	public JuegoVo update(Juego juego);
	public JuegoVo save(Juego juego);
	public JuegoVo delete(Integer id);
	
}
