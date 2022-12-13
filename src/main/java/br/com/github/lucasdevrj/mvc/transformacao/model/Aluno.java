package br.com.github.lucasdevrj.mvc.transformacao.model;

public class Aluno {

	private String nome;
	private String sobrenome;
	private Integer ano;
	private String matricula;
	private Double primeiraNota;
	private Double segundaNota;
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
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
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
	
	public Situacao getSituacao() {
		return situacao;
	}
	
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
