package br.com.etechoracio.aeroporto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="aeronauta")
public class Aeronauta {
	
	@Column(name="nome_aerona")
	private String nomeAeronauta;
	
	@Id
	@GeneratedValue
	@Column(name="cd_aerona")
	private int codigoAeronauta;
	
	@Column(name="contato_aerona")
	private int contatoAeronauta;
	
	@Column(name="cargo_aerona")
	private String cargoAeronauta;
	
	@JoinColumn(name="cnpj_cpa")
	@ManyToOne
	private CompanhiaAerea cnpjcpa;
	
	@JoinColumn(name="num_aero")
	@OneToMany
	private Aeronave numeroAeronave;
	
}
