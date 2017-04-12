package mz.co.tfsolucoes.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Lancamento {

	@Id
	@GeneratedValue
	protected Long id;
	
	@Enumerated(EnumType.STRING)
	protected CategoriaType categoria;
	
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	protected LocalDate data;
	
	protected double valor;
	protected String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CategoriaType getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaType categoria) {
		this.categoria = categoria;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
