package com.myGameCollection.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myGameCollection.dao.OfertaDao;
import com.myGameCollection.modelo.Oferta;
import com.myGameCollection.vo.OfertaVo;

@Service
public class OfertaServicioImp implements IOferta {
	
	@Autowired
	OfertaDao ofertaDao;
	
	private static final Logger log = LoggerFactory.getLogger(OfertaServicioImp.class);

	@Override
	public OfertaVo findAll() {
		OfertaVo ofertaVo = new OfertaVo(new ArrayList<Oferta>(), "Ha habido un error", "101");
		try {
			ofertaVo.setOfertas(ofertaDao.findAll());
			ofertaVo.setMensaje(String.format("Se han encontrado %d ofertas", ofertaVo.getOfertas().size()));
			ofertaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en OfertaServicioImp : findAll -> " + e );
		}
		return ofertaVo;
	}

	@Override
	public OfertaVo findByGame(String name) {
		OfertaVo ofertaVo = new OfertaVo(new ArrayList<Oferta>(), "Ha habido un error", "102");
		try {
			ofertaVo.setOfertas(ofertaDao.findAll());
			ofertaVo.setMensaje(String.format("Se han encontrado %d ofertas", ofertaVo.getOfertas().size()));
			ofertaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en OfertaServicioImp : findByGame -> " + e );
		}
		return ofertaVo;
	}

	@Override
	public OfertaVo update(Oferta oferta) {
		OfertaVo ofertaVo = new OfertaVo(new ArrayList<Oferta>(), "Ha habido un error", "103");
		try {
			Oferta ofertaActualizada = ofertaDao.save(oferta);
			ofertaVo.getOfertas().add(ofertaActualizada);
			ofertaVo.setMensaje("Se ha actualizado la oferta");
			ofertaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en OfertaServicioImp : update -> " + e );
		}
		return ofertaVo;
	}

	@Override
	public OfertaVo save(Oferta oferta) {
		OfertaVo ofertaVo = new OfertaVo(new ArrayList<Oferta>(), "Ha habido un error", "104");
		try {
			Oferta ofertaGuardada = ofertaDao.save(oferta);
			ofertaVo.getOfertas().add(ofertaGuardada);
			ofertaVo.setMensaje("Se ha guardado la oferta");
			ofertaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en OfertaServicioImp : save -> " + e );
		}
		return ofertaVo;
	}

	@Override
	public OfertaVo delete(Integer id) {
		OfertaVo ofertaVo = new OfertaVo(new ArrayList<Oferta>(), "Ha habido un error", "105");
		try {
			Oferta ofertaBorrada = ofertaDao.findById(id).get();
			ofertaDao.deleteById(id);
			ofertaVo.setMensaje("Se ha borrado la oferta");
			ofertaVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en OfertaServicioImp : delete -> " + e );
		}
		return ofertaVo;
	}

}
