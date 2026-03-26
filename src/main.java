import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("==== SISTEMA DE PARQUEADEROS AUTOS COLOMBIA====");
            System.out.println("1 registrar vehiculo");
            System.out.println("2 registrar entrada del vehiculo");
            System.out.println("3 registrar salida del vehiculo"); //nueva opcion de salida de vehuculos
            System.out.println("4 usuarios");// nueva opcion de usuarios
            System.out.println("5 salir");
            System.out.println("seleccione una opcion");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("ingrese placa: ");
                    String placa = sc.nextLine();

                    System.out.println("ingrese modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("ingrese color: ");
                    String color = sc.nextLine();

                    Vehiculos vehiculos = new Vehiculos(placa, modelo, color);

                    VehiculosDAO vehiculosDAO = new VehiculosDAO();
                    vehiculosDAO.registrarVehiculo(vehiculos);

                    break;
                    
                case 2:
                    System.out.println("ingrese placa del vehiculo: ");
                    String placaEntrada = sc.nextLine();

                    RegistrosDAO registrosDAO = new RegistrosDAO();
                    registrosDAO.regsitrarEntrada(placaEntrada);

                break;

                //menu de salida de vehiculos
                
                case 3:
                    System.out.println("ingrese placa del vehiculo");
                    String placaSalida = sc.nextLine();

                    RegistrosDAO registrosDAO2 = new RegistrosDAO();
                    registrosDAO2.registrarSalida(placaSalida);

                    break;
                
                    //menu de usuarios
                
                case 4:
                    System.out.println("1 registrar usuario");
                    System.out.println("2 consultar usuarios");
                    System.out.println("3 actualizar usuario");
                    System.out.println("4 eliminar usuario");


                    int op = sc.nextInt();
                    sc.nextLine();
                    UsuariosDAO usuariosDAO = new UsuariosDAO();

                    switch (op){

                        //opcion de registrar usuario
                        case 1:
                            System.out.println("nombre:");
                            String nombre = sc.nextLine();

                            System.out.println("correo:");
                            String correo = sc.nextLine();

                            usuariosDAO.registrarUsuario(new Usuarios(nombre, correo));
                            break;

                        //opcion de mostrar usuarios
                        case 2:
                            usuariosDAO.listaUsuarios();
                            break;

                        //opcion de actualizar usuario
                        case 3:
                            System.out.println("nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();

                            System.out.println("nuevo correo: ");
                            String nuevoCorreo = sc.nextLine();

                            usuariosDAO.actualizarUsuario(nuevoNombre, nuevoCorreo);
                            break;
                        
                         //opcion de eliminar usuario
                        case 4:
                            System.out.println("ingrese correo del usuario");
                            String eliminarCorreo = sc.nextLine();

                            usuariosDAO.eliminarUsuario(eliminarCorreo);
                            break;
                    }


                //nueva opcion de salir
                case 5:
                    System.out.println("saliendo del sistema ");
                    break; 

                default:
                    System.out.println("opcion invalida");


            }

        }while(opcion != 3);
        sc.close();
        
    }
}
