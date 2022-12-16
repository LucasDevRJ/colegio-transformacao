package br.com.github.lucasdevrj.mvc.transformacao.dto;


import org.hibernate.validator.constraints.NotBlank;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Situacao;
import jakarta.validation.UnexpectedTypeException;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class RequisicaoEditaAluno {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String sobrenome;
	
	@NotNull
	@Digits(integer = 1, fraction = 9)
	private Integer serie;
	
	@NotBlank
	@Size(min = 5, max = 5)
	private String matricula;
	
	@NotNull
	@DecimalMin("0.0")
	@DecimalMax("10.0")
	private Double primeiraNota;
	
	@NotNull
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
		
		try {
			calculaMedia(aluno);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		return aluno;
	}
	
	public Double calculaMedia(Aluno aluno) {
		double media = (primeiraNota + segundaNota) / 2;
		aluno.setMedia(media);
		
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
