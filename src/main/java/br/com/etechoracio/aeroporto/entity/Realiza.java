package br.com.etechoracio.aeroporto.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="realiza_psg_voo")
public class Realiza {
	
	@JoinColumn(name="num_voo")
	@ManyToMany
	private Voo numeroVoo;
	
	@JoinColumn(name="cpf_psg")
	@ManyToMany
	private Passageiro cpfPassageiro;

}
