import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//clase celdasDAO
public class CeldasDAO {

    public Celdas obtenerCeldaLibre(){
        String sql = "SELECT * FROM celdas WHERE estado = 'libre' LIMIT 1";

        try {
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            if(rs.next()){
                int id_celda = rs.getInt("id_celda");
                int numero = rs.getInt("numero");
                String estado = rs.getString("estado");

                Celdas celda = new Celdas(id_celda, numero, estado);
                return celda;
            }

            conexion.close();

        }catch (SQLException e){
            System.out.println("error: " + e.getMessage());
        }

        return null;
    }

    //metodo ocuparCelda

    public void ocuparCelda(int id){

        String sql = "UPDATE celdas SET estado = 'ocupada' WHERE id_celda = ?";

        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setInt(1, id);
            statement.executeUpdate();

            conexion.close();

        }catch (SQLException e){
            System.out.println("error: " + e.getMessage());
        }
    }

    // metodo liberarCelda 

    public void liberarCelda(int id){
       
        String sql = "UPDATE celdas SET estado = 'libre' WHERE id_celda = ?";

        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setInt(1, id);
            statement.executeUpdate();

            conexion.close();

        }catch (SQLException e){
            System.out.println("error: "+ e.getMessage());
        }
    }


}
