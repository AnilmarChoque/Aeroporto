package br.com.etechoracio.aeroporto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.etechoracio.aeroporto.enums.TipoPassagemEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="passagem")
public class Passagem {
	
	@Column(name="preco_pass")
	private String precoPassagem;
	
	@Column(name="dest_pass")
	private String destinoPassagem;
	
	@Id
	@GeneratedValue
	@Column(name="cd_pass")
	private int codigoPassagem;
	
	@Column(name="local_acento")
	private int assentoPassagem;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_pass")
	private TipoPassagemEnum passagem;
	
	@JoinColumn(name="cpf_psg")
	@ManyToOne
	private Passageiro cpfPassageiro;
	
	@JoinColumn(name="cnpj_cpa")
	@ManyToOne
	private CompanhiaAerea cnpjCpa;
	
}
