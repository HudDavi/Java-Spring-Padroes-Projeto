package padroes.projeto.app.model.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import padroes.projeto.app.model.endereco.EnderecoModelGet;

@Entity
public class ClienteModelGet{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private EnderecoModelGet endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnderecoModelGet getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoModelGet endereco) {
		this.endereco = endereco;
	}

}