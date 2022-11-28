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
@Table(name="passageiro")
public class Passageiro {
	
	@Column(name="idade")
	private int idadePassageiro;
	
	@Column(name="nom_psg")
	private String nomePassageiro;
	
	@Id
	@GeneratedValue
	@Column(name="cpf_psg")
	private int cpfPassageiro;
	
	@Column(name="fone_psg")
	private int telefonePassageiro;
	
	@Column(name="bagabem_psg")
	private int bagagemPassageiro;
	
}
