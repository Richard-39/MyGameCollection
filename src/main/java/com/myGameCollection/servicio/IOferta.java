package com.myGameCollection.servicio;

import com.myGameCollection.modelo.Oferta;
import com.myGameCollection.vo.OfertaVo;

public interface IOferta {

	public OfertaVo findAll();
	public OfertaVo findByGame(String name);
	public OfertaVo update(Oferta oferta);
	public OfertaVo save(Oferta oferta);
	public OfertaVo delete(Integer id);
	
}
