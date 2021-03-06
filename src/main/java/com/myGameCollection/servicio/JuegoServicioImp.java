package com.myGameCollection.servicio;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myGameCollection.dao.JuegoDao;
import com.myGameCollection.modelo.Juego;
import com.myGameCollection.vo.JuegoVo;

@Service
public class JuegoServicioImp implements IJuego {

	@Autowired
	JuegoDao juegoDao;
	
	private static final Logger log = LoggerFactory.getLogger(JuegoServicioImp.class);
	
	@Override
	public JuegoVo findAll() {
		JuegoVo juegoVo = new JuegoVo(new ArrayList<Juego>(), "Ha habido un error", "101");
		try {
			juegoVo.setJuegos(juegoDao.findAll());
			juegoVo.setMensaje(String.format("Se han encontrado %d juegos", juegoVo.getJuegos().size()));
			juegoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en JuegoServicioImp : findAll -> " + e );
		}
		return juegoVo;
	}

	@Override
	public JuegoVo findByName(String name) {
		JuegoVo juegoVo = new JuegoVo(new ArrayList<Juego>(), "Ha habido un error", "102");
		try {
			juegoVo.setJuegos(juegoDao.findByNombreLike(name));
			juegoVo.setMensaje(String.format("Se han encontrado %d juegos", juegoVo.getJuegos().size()));
			juegoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en JuegoServicioImp : findByName -> " + e );
		}
		return juegoVo;
	}

	@Override
	public JuegoVo update(Juego juego) {
		JuegoVo juegoVo = new JuegoVo(new ArrayList<Juego>(), "Ha habido un error", "103");
		try {
			Juego juegoActualizado = juegoDao.save(juego);
			juegoVo.getJuegos().add(juegoActualizado);
			juegoVo.setMensaje(String.format("Se han actualizado %s correctamente", juegoActualizado.getNombre()));
			juegoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en JuegoServicioImp : update -> " + e );
		}
		return juegoVo;
	}

	@Override
	public JuegoVo save(Juego juego) {
		JuegoVo juegoVo = new JuegoVo(new ArrayList<Juego>(), "Ha habido un error", "104");
		try {
			Juego juegoGuardado = juegoDao.save(juego);
			juegoVo.getJuegos().add(juegoGuardado);
			juegoVo.setMensaje(String.format("Se han guardado %s correctamente", juegoGuardado.getNombre()));
			juegoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en JuegoServicioImp : save -> " + e );
		}
		return juegoVo;
	}

	@Override
	public JuegoVo delete(Integer id) {
		JuegoVo juegoVo = new JuegoVo(new ArrayList<Juego>(), "Ha habido un error", "105");
		try {
			Juego juegoBorrado = juegoDao.findById(id).get();
			juegoDao.deleteById(id);
			juegoVo.getJuegos().add(juegoBorrado);
			juegoVo.setMensaje(String.format("Se han borrado %s correctamente", juegoBorrado.getNombre()));
			juegoVo.setCodigo("0");
		} catch (Exception e) {
			log.info("Se ha encontrado un error en JuegoServicioImp : delete -> " + e );
		}
		return juegoVo;
	}

}
