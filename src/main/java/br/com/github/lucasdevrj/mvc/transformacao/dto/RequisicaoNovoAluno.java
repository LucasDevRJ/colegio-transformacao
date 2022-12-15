package br.com.github.lucasdevrj.mvc.transformacao.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Situacao;


public class RequisicaoNovoAluno {

	@NotBlank
	private String nome;
	
	@NotBlank
	private String sobrenome;
	
	@NotBlank
	@Size(min = 1, max = 9)
	private Integer serie;
	
	@NotBlank
	@Size(min = 5, max = 5)
	private String matricula;
	
	@NotBlank
	@DecimalMin("0.0")
	@DecimalMax("10.0")
	private Double primeiraNota;
	
	@NotBlank
	@DecimalMin("0.0")
	@DecimalMax("10.0")
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

	public Aluno toAluno() {
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setSobrenome(sobrenome);
		aluno.setSerie(serie);
		aluno.setMatricula(matricula);
		aluno.setPrimeiraNota(primeiraNota);
		aluno.setSegundaNota(segundaNota);
		
		double media = (this.primeiraNota + this.segundaNota) / 2;
		aluno.setMedia(media);
		
		if (media >= 6.0) {
			aluno.setSituacao(Situacao.APROVADO);
		} else if (media >= 4.0) {
			aluno.setSituacao(Situacao.RECUPERACAO);
		} else {
			aluno.setSituacao(Situacao.REPROVADO);
		}
		
		return aluno;
	}
}
