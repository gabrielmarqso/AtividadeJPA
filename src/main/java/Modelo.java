import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Modelo implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idmodelo;
	
	@Column (name = "descricao", nullable = false)
	private String descricao;
	
	@Column (name = "potencia", nullable = false)
	private Integer potencia;
	
	
	
	@OneToOne(mappedBy = "modelo")
	private Automovel auto;
	
	@OneToMany
	@JoinColumn(name="modelo_id")
	private List<Automovel> automoveis;
	
}
