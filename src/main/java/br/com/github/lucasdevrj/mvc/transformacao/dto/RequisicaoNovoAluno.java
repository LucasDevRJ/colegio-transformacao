package br.com.github.lucasdevrj.mvc.transformacao.dto;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Situacao;

public class RequisicaoNovoAluno {

	private String nome;
	private String sobrenome;
	private Integer serie;
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
	
	public Integer getSerie() {
		return serie;
	}
	
	public void setSerie(Integer serie) {
		this.serie = serie;
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

	public Aluno toAluno() {
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setSobrenome(sobrenome);
		aluno.setSerie(serie);
		aluno.setMatricula(matricula);
		aluno.setPrimeiraNota(primeiraNota);
		aluno.setSegundaNota(segundaNota);
		calculaMedia();
		
		return aluno;
	}
	
	public Double calculaMedia() {
		Aluno aluno = new Aluno();
		
		double media = (this.primeiraNota + this.segundaNota) / 2;
		
		if (media >= 6.0) {
			aluno.setSituacao(Situacao.APROVADO);
		} else if (media >= 4.0) {
			aluno.setSituacao(Situacao.RECUPERACAO);
		} else {
			aluno.setSituacao(Situacao.REPROVADO);
		}
		
		return media;
	}
}
