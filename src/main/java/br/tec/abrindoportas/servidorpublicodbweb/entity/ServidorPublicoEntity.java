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
    private String cargo;
    private String lotacao;
    private String email;
    private String telefone;
    private String endereco;
    private String naturalidade;
    private String exercicio;
    private String vinculo;
    private String orgao;

    public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	// Getter for cargo
    public String getCargo() {
        return cargo;
    }

    // Setter for cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter for lotacao
    public String getLotacao() {
        return lotacao;
    }

    // Setter for lotacao
    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter for telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter for endereco
    public String getEndereco() {
        return endereco;
    }

    // Setter for endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private String celular;

    // Getter for celular
    public String getCelular() {
        return celular;
    }

    // Setter for celular
    public void setCelular(String celular) {
        this.celular = celular;
    }
    private String cpf;

    // Getter for cpf
    public String getCpf() {
        return cpf;
    }

    // Setter for cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
