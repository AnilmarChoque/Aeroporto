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
@Table(name="check_in")
public class CheckIn {
	
	@Column(name="dt_chi")
	private Date dataCheckIn;
	
	@Id
	@GeneratedValue
	@Column(name="cd_chi")
	private int codCheckIn;
	
	@Column(name="hr_chi")
	private String horaCheckIn;
	
	@Column(name="terminal_chi")
	private int terminalCheckIn;
	
	@JoinColumn(name="cpf_psg")
	@ManyToOne
	private Passageiro cpfPassageiro;
	
	@JoinColumn(name="cod_funci")
	@ManyToOne
	private Funcionario codigoFuncionario;
	
}

