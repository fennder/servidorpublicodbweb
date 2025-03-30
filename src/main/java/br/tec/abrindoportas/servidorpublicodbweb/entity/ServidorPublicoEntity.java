package br.tec.abrindoportas.servidorpublicodbweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servidor_publico")
public class ServidorPublicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricula; // Add this field
    private String nome;

    // Getter for matricula
    public String getMatricula() {
        return matricula;
    }

    // Setter for matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
