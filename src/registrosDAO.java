import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegistrosDAO {

    //metodo registrarEntrada

    public void regsitrarEntrada (String placa) {

        String sql = "INSERT INTO registros ( id_placa, estado, id_celda) VALUES (?,'dentro', ?) ";

        //crear objeto celdasDAO
        CeldasDAO celdasDao = new CeldasDAO();

        try {

            Connection conexion = ConexionBD.obtenerConexion();

            //obtener las celdas libres
            Celdas celda = celdasDao.obtenerCeldaLibre();
            
            if (celda == null){
                System.out.println("no hay celdas libres");
                return;
            }

            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, placa);
            statement.setInt(2, celda.getId());//asignar la celda a la entrada
            statement.executeUpdate();

            //ocupar celda
            celdasDao.ocuparCelda(celda.getId());

            // mostrar la entrada registrada con el numero de celda que le corresponde
            System.out.println("entrada del vehiculo registrada. celda asignada: "+ celda.getNumero()); 


            conexion.close();

        }catch (SQLException e){
            System.out.println("error al registrar entrada" + e.getMessage());

        }
    }

    // metodo registrarSalida

    public void registrarSalida (String placa) {
        String sql = "UPDATE registros SET estado = 'fuera' WHERE id_placa = ? AND estado = 'dentro'";
        String select = "SELECT * FROM registros WHERE id_placa = ? AND estado = 'dentro'";

        //crear objeto celdasDao
        CeldasDAO celdasDao = new CeldasDAO();


        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(select);
            statement.setString(1, placa);

            ResultSet rs = statement.executeQuery();

            if(!rs.next()){
                System.out.println("error: el vehiculo no esta dentro del parqueadero");
                return;
            }

            int celdaId = rs.getInt("id_celda");

            PreparedStatement statementUpdate = conexion.prepareStatement(sql);
            statementUpdate.setString(1, placa);

            int filaAfectadas = statementUpdate.executeUpdate();

            if (filaAfectadas > 0){

                celdasDao.liberarCelda(celdaId);
                System.out.println("Salida del vehilculo correctamente. celda liberada:" + celdaId);

            }else{
                System.out.println("Error: no se pudo registrar la salida del vehiculo");
            }

            conexion.close();

        }catch (SQLException e){
            System.out.println("eror al registrar salida" + e.getMessage());
        }
    }

}
