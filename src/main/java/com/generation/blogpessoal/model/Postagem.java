package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;// int, Integer, Long -> BigInt
	
	@NotBlank(message="O atributo Título é Obrigatório")
	@Size(min = 5, max = 100, message = "Tamanho minimo: 5, maximo: 100")
	private String titulo;
	
	@NotBlank(message="O atributo Texto é Obrigatório")
	@Size(min = 10, max = 1000, message = "Tamanho minimo: 10, maximo: 1000")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne	
	@JsonIgnoreProperties
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}	

}
