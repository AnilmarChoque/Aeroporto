package br.com.etechoracio.aeroporto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="companhia_aerea")
public class CompanhiaAerea {
	
	@Id
	@GeneratedValue
	@Column(name="cnpj_cpa")
	private int cnpjCpa;
	
	@Column(name="qtnd_aeronave")
	private double qtdAeronaves;	
	
	@Column(name="nome_cpa")
	private String nomeCpa;
	
	@Column(name="nac_cpa")
	private String nacionalidadeCpa;
	

}
