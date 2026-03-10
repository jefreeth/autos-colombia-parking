import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("==== SISTEMA DE PARQUEADEROS AUTOS COLOMBIA====");
            System.out.println("1 registrar vehiculo");
            System.out.println("2 registrar entrada del vehiculo");
            System.out.println("3 salir");
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

                    vehiculos vehiculos = new vehiculos(placa, modelo, color);

                    vehiculosDAO vehiculosDAO = new vehiculosDAO();
                    vehiculosDAO.registrarVehiculo(vehiculos);

                    break;
                    
                case 2:
                    System.out.println("ingrese placa del vehicul: ");
                    String placaEntrada = sc.nextLine();

                registrosDAO registrosDAO = new registrosDAO();
                registrosDAO.regsitrarEntrada(placaEntrada);

                break;

                case 3:
                    System.out.println("saliendo del sistema ");
                    break; 

                default:
                    System.out.println("opcion invalida");


            }

        }while(opcion != 3);
        sc.close();
        
    }
}
