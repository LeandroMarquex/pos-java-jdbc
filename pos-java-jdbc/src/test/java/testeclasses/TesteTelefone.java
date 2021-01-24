/**
 * 
 */
package testeclasses;

import java.util.List;

import org.junit.Test;

import dao.TelefoneDao;
import dao.UserPosDao;
import model.BeanUserFone;
import model.Telefone;

/**
 * @author JAVA - LEANDRO MARQUES
 *
 */
public class TesteTelefone {

	@Test
	public void testeInsertTelefone() {
		
		TelefoneDao dao = new TelefoneDao();
		Telefone telefone = new Telefone();
		
		telefone.setNumeroTelefone("(47) 4030-5888");
		telefone.setTipoTelefone("casa");
		telefone.setUsuarioTelefone(33L);
		
		
		dao.salvarTelefone(telefone);
		
	}
	
	@Test
	public void testeCarregarFoneuser() {
		UserPosDao dao = new UserPosDao();
		
		List<BeanUserFone> beanUserFones = dao.listaUserFone(1L);
		
		for (BeanUserFone beanUserFone : beanUserFones) {
			System.out.println(beanUserFone);
			System.out.println("-------------------------------------");
			
		}
	}
	@Test
	public void testeDeleteUserFone( ) {
		
		TelefoneDao dao = new TelefoneDao();
		dao.deleteFonesPorUser(2L);
		
	}
	
}
