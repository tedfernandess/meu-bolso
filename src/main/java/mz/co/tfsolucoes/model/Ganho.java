package mz.co.tfsolucoes.model;

import javax.persistence.Entity;

import org.joda.time.LocalDate;

@Entity
public class Ganho extends Lancamento implements ILancamento {

	public Ganho() {

	}

	public Ganho(CategoriaType categoria, LocalDate data, double valor,
			String descricao) {
		this.categoria=categoria;
		this.data=data;
		this.valor=valor;
		this.descricao=descricao;
	}

	public void criarLancamento(Lancamento l) {
		// TODO Auto-generated method stub

	}

	public void actualizarLancamento(Lancamento l) {
		// TODO Auto-generated method stub

	}

	public void apagarLancamento(Lancamento l) {
		// TODO Auto-generated method stub

	}

}
