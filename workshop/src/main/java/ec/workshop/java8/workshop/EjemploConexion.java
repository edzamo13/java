/**
 * EJEMPLO DE CONEXI�N CON UNA BASE DE DATOS EN UN SERVIDOR MYSQL
 */
package ec.workshop.java8.workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Openwebinars
 *
 */
public class EjemploConexion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection con = null;
		// Usamos un objeto de properties para pasar
		// de una manera m�s c�moda el user, password
		Properties props = new Properties();		
		props.put("user", "openwebinars");
		props.put("password", "12345678");
		
		try {
			// Si trabajaramos con JDBC < 4.0 tendr�amos que indicar esta l�nea
			// para indicar el tipo de driver que tiene que cargar DriverManager.
			// Class.forName("com.mysql.jdbc.Driver");
			
			// Obtenemos la conexi�n a partir de la URL jdbc correspondiente
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", props);
			
			// Estas pr�ximas l�neas las trabajaremos ampliamente 
			// en el siguiente cap�tulo
			
			// Creamos el objeto para enviar sentencias 
			Statement st = con.createStatement();
			// Enviamos una sentencia especial, para listar
			// las tablas disponibles en la base de datos
			// Almacenamos el resultado para recorrerlo despu�s
			ResultSet rs = st.executeQuery("SHOW TABLES");

			// De esta forma vamos a saber si hay tablas o no
			boolean hayFilas = false;
			while(rs.next()) {
				hayFilas = true;
				System.out.println(rs.getString(1));
			}
			if (!hayFilas) {
				System.out.println("No hay resultados que mostrar");
			}
			
			//Cerramos ResultSet y Statement
			rs.close();
			st.close();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}
		}
	
		
		

	}

}
