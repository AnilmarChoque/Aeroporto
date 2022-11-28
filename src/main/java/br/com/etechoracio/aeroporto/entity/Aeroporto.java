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
@Table(name="aeroporto")
public class Aeroporto {
	
	@Column(name="midiaWEB_aerop")
	private String linkWeb;
	
	@Column(name="tele_aerop")
	private int telefoneAeroporto;
	
	@Column(name="local_aerop")
	private String nomeAeroporto;
	
	@Column(name="nom_aerop")
	private String localEndereco;
	
	@Id
	@GeneratedValue
	@Column(name="cred_aerop")
	private String credencialAeroporto;

}
