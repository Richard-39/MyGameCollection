package com.myGameCollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myGameCollection.dao.JuegoDao;
import com.myGameCollection.dao.OfertaDao;
import com.myGameCollection.modelo.Juego;
import com.myGameCollection.modelo.Oferta;

@SpringBootApplication
public class MyGameCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyGameCollectionApplication.class, args);
		
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
//		JuegoDao juegoDao = acac.getBean(JuegoDao.class);
//		OfertaDao ofertaDao =acac.getBean(OfertaDao.class);
		
		
//		System.out.println(juegoDao.findAll().get(0).getOfertas().get(0)); 
//		System.out.println(ofertaDao.findAll());
		
//		Juego nuevoJuego = new Juego();
//		nuevoJuego.setAdquirido(false);
//		nuevoJuego.setCaratulaUrl("https://www.covercaratulas.com/ode2/xbox360/Catherine_-_Dvd_por_SergioFalcuan_[xbox360]_80.jpg");
//		nuevoJuego.setDescargado(false);
//		nuevoJuego.setDescargaUrl("https://dlxbgame.net/catherine-jtag-rgh/");
//		nuevoJuego.setDescripcion("Vincent likes his girlfriend. Katherine’s pretty, smart, and successful. Trouble is, she’s starting to talk about long-term commitment, something Vincent’s spent his entire life avoiding. Since romantic complications are the last thing he wants to deal with, Vincent meets his friends for their regular night of drinks. Little does he know that he’s about to be blindsided by a beautiful, seductive, irresistible freight train named Catherine. Suddenly, he’s hung over in bed next to the most beautiful woman he’s ever seen, unsure about the previous night’s events. Was it just making out, he wonders, or did something more serious happen between them? Should he tell Katherine? Will he ever see Catherine again? Vincent’s about to find that a stumble on the staircase of love can turn into a horrific, fatal plummet…");
//		nuevoJuego.setGameplayUrl("https://www.youtube.com/watch?v=n-NL2cImnFs");
//		nuevoJuego.setGenero("Puzzle");
//		nuevoJuego.setLenguaje("ESP");
//		nuevoJuego.setNombre("Catherine");
//		nuevoJuego.setPlataforma("Xbox 360");
//		nuevoJuego.setPrioridad("Media");
//		nuevoJuego.setPuntuacion(7);
//		nuevoJuego.setScreeshotUrl("https://i1.wp.com/todasgamers.com/wp-content/uploads/2017/02/catherine_screens_30-e1523144774174.jpg?resize=1000%2C563&ssl=1");
//		nuevoJuego.setTerminado(false);
//		nuevoJuego.setTrailerUrl("https://www.youtube.com/watch?v=D-Fuf4RCRmQ");
//		juegoDao.save(nuevoJuego);
		
//		juegoDao.deleteById(3);
		
//		Oferta nuevaOferta = new Oferta();
//		nuevaOferta.setEnlaceVenta("https://www.facebook.com/marketplace/item/901174263982418/?ref=search&referral_code=marketplace_search");
//		nuevaOferta.setJuego(nuevoJuego);
//		nuevaOferta.setNombreVendedor("oliver valenzuela");
//		nuevaOferta.setPrecio(13000);
//		ofertaDao.save(nuevaOferta);
		
	}

}
