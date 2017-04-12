package mz.co.tfsolucoes.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import mz.co.tfsolucoes.model.CategoriaType;
import mz.co.tfsolucoes.model.Ganho;
import mz.co.tfsolucoes.model.Gasto;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class CriarLancamentos {

	public static void main(String[] args) {

		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		LocalDate data = DateTime.now().toLocalDate();
		
		Ganho ganho = new Ganho(CategoriaType.SALARIO, data, 110000.00, "Salario da ONG");
		Gasto gasto = new Gasto(CategoriaType.COMIDA, data, 700.00, "KingPie");
		
		manager.persist(ganho);
		manager.persist(gasto);
		
		trx.commit();
		manager.close();
		

	}

}
