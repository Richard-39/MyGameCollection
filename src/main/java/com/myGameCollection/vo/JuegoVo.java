package com.myGameCollection.vo;

import java.util.List;

import com.myGameCollection.modelo.Juego;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JuegoVo {
	
	private List<Juego> juegos;
	private String mensaje;
	private String codigo;

}
