package com.myGameCollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myGameCollection.dao.JuegoDao;
import com.myGameCollection.dao.OfertaDao;

@SpringBootApplication
public class MyGameCollectionApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MyGameCollectionApplication.class, args);
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		JuegoDao juegoDao = acac.getBean(JuegoDao.class);
		OfertaDao ofertaDao =acac.getBean(OfertaDao.class);
		
		
//		System.out.println(juegoDao.findAll().get(0).getOfertas().get(0)); 
		System.out.println(ofertaDao.findAll());
		
	}

}
