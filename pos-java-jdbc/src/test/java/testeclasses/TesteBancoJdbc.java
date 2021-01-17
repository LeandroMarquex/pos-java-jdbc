/**
 * 
 */
package testeclasses;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDao;
import model.Userposjava;

/**
 * @author JAVA - LEANDRO MARQUES
 *
 */
public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
	//	SingleConnection.getConnection();
		UserPosDao userPosDAO = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
	//	userposjava.setId(5L); criado a sequencia
		userposjava.setNome("Matues teste");
		userposjava.setEmail("mateus@gmail");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-----------------------------------");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void initBuscar() {
		
		UserPosDao dao = new UserPosDao();
		
		try {
			
			Userposjava userposjava = dao.buscar(1L);
			System.out.println(userposjava);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void intiAtualizar() {
		try {
			UserPosDao dao = new UserPosDao();
			
			Userposjava objetoBanco = dao.buscar(3L);
			
			 objetoBanco.setNome("Nome mudado com o metodo atualizar");
			 
			 dao.atualizar(objetoBanco);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	
	
	
	
	@Test
	public void initDeletar() {
		try {
			UserPosDao dao = new UserPosDao();
			dao.deletar(8L);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
