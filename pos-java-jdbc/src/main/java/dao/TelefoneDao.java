/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaojdbc.SingleConnection;
import model.Telefone;

/**
 * @author JAVA - LEANDRO MARQUES
 *
 */
public class TelefoneDao {

	private Connection connection;

	public TelefoneDao() {
		connection = SingleConnection.getConnection();
	}

	public void salvarTelefone(Telefone telefone) {
		try {
			String sql = "insert into telefoneuser(numero, tipo, usuariopessoa) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, telefone.getNumeroTelefone());
			statement.setString(2, telefone.getTipoTelefone());
			statement.setLong(3, telefone.getUsuarioTelefone());
			statement.execute();
			connection.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public void deleteFonesPorUser(Long idUser) {

		try {
			
			String sqlFone = "delete from telefoneuser where usuariopessoa =" + idUser;
			String sqlUser = "delete from userposjava where id =" + idUser;

			PreparedStatement  preparedStatement = connection.prepareStatement(sqlFone);
			preparedStatement.executeUpdate();
			connection.commit();
			
			preparedStatement = connection.prepareStatement(sqlUser);
			preparedStatement.executeUpdate();
			connection.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		

	}

}
