import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class vehiculosDAO {

    public void registrarVehiculo(vehiculos vehiculo){
        String sql = "INSERT INTO vehiculos (placa, modelo, color) VALUES (?,?,?)";

        try{
            Connection conexion = conexionBD.obtenerConexion();

            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, vehiculo.getPlaca());
            statement.setString(2, vehiculo.getModelo());
            statement.setString(3, vehiculo.getColor());

            statement.executeUpdate();

            System.out.println("el vehiculo se ha registrado correctamente");

            conexion.close();

        }catch (SQLException e){
            System.out.println("error al registrar el vehiculo" + e.getMessage());

        }
    }
}
