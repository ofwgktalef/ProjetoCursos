package entidades;
// Generated 09/09/2019 16:32:54 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Pagamento generated by hbm2java
 */
@Entity
@Table(name = "pagamento", schema = "public")
public class Pagamento implements java.io.Serializable {

	private PagamentoId id;
	private String datainscricao;

	public Pagamento() {
	}

	public Pagamento(PagamentoId id) {
		this.id = id;
	}

	public Pagamento(PagamentoId id, String datainscricao) {
		this.id = id;
		this.datainscricao = datainscricao;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "cdcurso", column = @Column(name = "cdcurso", nullable = false)),
			@AttributeOverride(name = "cpf", column = @Column(name = "cpf", nullable = false)) })
	public PagamentoId getId() {
		return this.id;
	}

	public void setId(PagamentoId id) {
		this.id = id;
	}

	@Column(name = "datainscricao", length = 20)
	public String getDatainscricao() {
		return this.datainscricao;
	}

	public void setDatainscricao(String datainscricao) {
		this.datainscricao = datainscricao;
	}

	@Override
	public String toString() {
		return "Pagamento [Curso=" + id.getCdcurso()  + ", datainscricao=" + datainscricao + ", cpf"+ id.getCpf()+"]";
	}
	
	
}
