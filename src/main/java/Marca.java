import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marca implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idmarca;
	
	@Column (name = "idmarca", nullable = false)
	private String nome;
	
	
}
