import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class PagosDAO {
   
    //metodo regisrar un pago 
    public void registrarPago (Pagos pago){
            String sql = "INSERT INTO pagos (idRegistro, estadoPago, metodoPago, monto) VALUES (?,?,?,?)";
    
            try{
                Connection conexion = ConexionBD.obtenerConexion();
                PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
                statement.setInt(1, pago.getIdRegistro());
                statement.setString(2, pago.getEstadoPago());
                statement.setString(3, pago.getMetodoPago());
                statement.setDouble(4, pago.getMonto());
    
                statement.executeUpdate();
                ResultSet rs = statement.getGeneratedKeys();

                if(rs.next()){
                    int idPago = rs.getInt(1);
                    pago.setIdPago(idPago);
                }else {
                    System.out.println("error al registrar pago");
                }

    
                conexion.close();
    
            }catch(SQLException e){
                System.out.println("error al registrar pago" + e.getMessage());

            }

    }

}
