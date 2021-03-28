package com.myGameCollection.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="juegos")
public class Juego {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_juego")
	private Integer idJuego;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="plataforma")
	private String plataforma;
	
	@Column(name="lenguaje")
	private String lenguaje;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="caratula_url")
	private String caratulaUrl;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="trailer_url")
	private String trailerUrl;
	
	@Column(name="gameplay_url")
	private String gameplayUrl;
	
	@Column(name="screeshot_url")
	private String screeshotUrl;
	
	@Column(name="puntuacion")
	private Integer	puntuacion;
	
	@Column(name="prioridad")
	private String prioridad;
	
	@Column(name="descarga_url")
	private String descargaUrl;
	
	@Column(name="adquirido")
	private Boolean adquirido;
	
	@Column(name="descargado")
	private Boolean descargado;
	
	@Column(name="terminado")
	private Boolean terminado;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_juego")
	private List<Oferta> ofertas;

	@Override
	public String toString() {
		return "Juego [idJuego=" + idJuego + ", nombre=" + nombre + ", plataforma=" + plataforma + ", lenguaje="
				+ lenguaje + ", genero=" + genero + ", caratulaUrl=" + caratulaUrl + ", descripcion=" + descripcion
				+ ", trailerUrl=" + trailerUrl + ", gameplayUrl=" + gameplayUrl + ", screeshotUrl=" + screeshotUrl
				+ ", puntuacion=" + puntuacion + ", prioridad=" + prioridad + ", descargaUrl=" + descargaUrl
				+ ", adquirido=" + adquirido + ", descargado=" + descargado + ", terminado=" + terminado + "]";
	}
		
}
