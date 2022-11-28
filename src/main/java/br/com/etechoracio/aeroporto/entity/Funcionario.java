package br.com.etechoracio.aeroporto.entity;

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
@Table(name="funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue
	@Column(name="cod_funci")
	private int codFuncionario;
	
	@Column(name="cargo_funci")
	private String cargoFuncionario;
	
	@Column(name="nome_funci")
	private String nomeFuncionario;
	
	@Column(name="fone_funci")
	private int telefoneFuncionario;
	
	@Column(name="horario_servico_funci")
	private String hrServFuncionario;
	
	@JoinColumn(name="cred_aerop")
	@ManyToOne
	private Aeroporto credencialAeroporto;
	
}
