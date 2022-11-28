package br.com.etechoracio.aeroporto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="aeronave")
public class Aeronave {
	
	@Column(name="fabricante_aero")
	private String fabricante;
	
	@Id
	@GeneratedValue
	@Column(name="num_aeronave")
	private int numeroAeronave;
	
	@Column(name="mod_aero")
	private String modeloAeronave;
	
	@Column(name="data_fabriacao_aero")
	private Date dataFabricacao;
	
	@JoinColumn(name="cpnj_cpa")
	@ManyToOne
	private CompanhiaAerea cnpjCpa;
	
}
