package br.com.etechoracio.aeroporto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.etechoracio.aeroporto.enums.TipoPassaporteEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="passaporte")
public class Passsaporte {
	
	@Column(name="validade_passp")
	private Date dataValidade;
	
	@Column(name="nacionalidade_passp")
	private String nacionalpassap;
	
	@Id
	@GeneratedValue
	@Column(name="num_pass")
	private int numeroPassap;
	
	@Column(name="portador_pas")
	private String portadorPassap;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_passaporte")
	private TipoPassaporteEnum tipo;
	
	@JoinColumn(name="cpf_psg")
	@ManyToOne
	private Passageiro cpfPassageiro;
	
}
