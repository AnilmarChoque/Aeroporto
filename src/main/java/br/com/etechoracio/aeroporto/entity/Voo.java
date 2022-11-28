package br.com.etechoracio.aeroporto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="voo")
public class Voo {
	
	@Column(name="data_voo")
	private Date dataVoo;
	
	@Column(name="rota_voo")
	private String rotaVoo;
	
	@Column(name="qtnd_psg_voo")
	private int qtdPassag;
	
	@Id
	@GeneratedValue
	@Column(name="num_voo")
	private int numeroVoo;
	
	@Column(name="qtnd_escala_voo")
	private int qtdEscala;
	
	@JoinColumn(name="num_aero")
	@OneToMany
	private Aeronave numeroAeronave;
	
	
	
}
