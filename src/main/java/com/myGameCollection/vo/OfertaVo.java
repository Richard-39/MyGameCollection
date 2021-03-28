package com.myGameCollection.vo;

import java.util.List;

import com.myGameCollection.modelo.Oferta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfertaVo {
	
		private List<Oferta> ofertas;
		private String mensaje;
		private String codigo;
	
}
