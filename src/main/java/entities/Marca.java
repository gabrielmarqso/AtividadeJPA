package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Marca implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idmarca;
	
	@Column (name = "idmarca", nullable = false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name="marca_id")
	private List<Modelo> modelos;

	public Marca(Integer idmarca, String nome) {
		super();
		this.idmarca = idmarca;
		this.nome = nome;
	}
