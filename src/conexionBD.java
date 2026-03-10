import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionBD {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/autosColombia";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    
    public static Connection obtenerConexion(){

        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos");

        }catch (SQLException e){
            System.out.println("error en la conexion" + e.getMessage());

        }

        return conexion;
    }
}
