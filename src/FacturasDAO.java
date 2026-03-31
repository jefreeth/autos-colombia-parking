import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class FacturasDAO {
    //metodo registrarFactura
    public void registrarFactura (Facturas factura){
        String sql = "INSERT INTO facturas (idPago, totalHoras, tarifa, total) VALUES (?,?,?,?)";

        try {
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setInt(1, factura.getIdPago());
            statement.setDouble(2, factura.getTotalHoras());
            statement.setDouble(3, factura.getTarifa());
            statement.setDouble(4, factura.getTotal());

            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()){
                factura.setIdFactura(rs.getInt(1));
            }

            System.out.println("la factura se ha registrado correctamente");

            conexion.close();

        }catch(SQLException e){
            System.out.println("error al registrar factura" + e.getMessage());
        }

    }

}


