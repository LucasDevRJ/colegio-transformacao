package br.com.github.lucasdevrj.mvc.transformacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String sobrenome;
	private Integer serie;
	private String matricula;
	private Double primeiraNota;
	private Double segundaNota;
	private Double media;
	private Situacao situacao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Integer getSerie() {
		return serie;
	}
	
	public void setSerie(Integer ano) {
		this.serie = ano;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Double getPrimeiraNota() {
		return primeiraNota;
	}
	
	public void setPrimeiraNota(Double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	
	public Double getSegundaNota() {
		return segundaNota;
	}
	
	public void setSegundaNota(Double segundaNota) {
		this.segundaNota = segundaNota;
	}
	
	public Double getMedia() {
		return media;
	}
	
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public Situacao getSituacao() {
		return situacao;
	}
	
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
