/**
 * 
 */
package conexaojdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author LEANDRO MARQUES
 *
 */
public class SingleConnection {
	private static String url = "jdbc:postgresql://localhost:5432/posjava";
	private static String password = "123";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {
			if (connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.err.println("Efetuado conex�o com sucesso");
				
			}
			
		} catch (Exception e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
