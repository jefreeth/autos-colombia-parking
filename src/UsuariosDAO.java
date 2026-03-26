import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuariosDAO {
    //metodo registrarUsuario
    public void registrarUsuario (Usuarios usuarios){

        String sql = "INSERT INTO usuarios (nombre, correo) VALUES (?,?)";

        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, usuarios.getNombre());
            statement.setString(2, usuarios.getCorreo());

            statement.executeUpdate();

            System.out.println("usuario creado correctamente");
            conexion.close();

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }
    //metodo listaUsuarios

    public void listaUsuarios(){
        String sql = "SELECT * FROM usuarios";

        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                System.out.println("ID" + rs.getInt("id_usuario")+ "nombre" + rs.getString("nombre") + "correo" + rs.getString("correo"));


            }
            conexion.close();

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }

    //metodo actualizarUsuario
    public void actualizarUsuario(String nuevoNombre, String nuevoCorreo){

        String sql = "UPDATE usuarios SET nombre = ?, correo = ?";

        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, nuevoNombre);
            statement.setString(2, nuevoCorreo);

            int filas = statement.executeUpdate();

            if(filas > 0){
                System.out.println("usuario actualizado correctamente");

            }else{
                System.out.println("usuario no econtrado");
            }

            conexion.close();

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }

    //metodo eliminarUsuario
    public void eliminarUsuario (String correo){

        String sql = "DELETE FROM usuarios WHERE correo = ?";

        try{
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, correo);

            int filas = statement.executeUpdate();

            if(filas > 0){
                System.out.println("usuario eliminado correctamente");

            }else{
                System.out.println("usuario no encontrado");
            }

            conexion.close();

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }

}
