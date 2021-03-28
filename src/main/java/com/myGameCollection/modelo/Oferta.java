package com.myGameCollection.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="ofertas")
public class Oferta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_oferta")
	private Integer idOferta;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_juego")
	private Juego juego;
	
	@Column(name="precio")
	private Integer precio;
	
	@Column(name="nombre_vendedor")
	private String nombreVendedor;
	
	@Column(name="enlace_venta")
	private String enlaceVenta;

	@Override
	public String toString() {
		return "Oferta [idOferta=" + idOferta + ", precio=" + precio + ", nombreVendedor=" + nombreVendedor
				+ ", enlaceVenta=" + enlaceVenta + ", juego=" + juego.getNombre() +"]";
	}

}
