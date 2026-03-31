import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalDate;

public class OperacionPago{

    //metodo calcular total de horas 
    public long calcularTotalHoras(Registro registro){

        LocalDateTime entrada = registro.getHoraEntrada();
        LocalDateTime salida = registro.getHoraSalida();

        if(entrada != null && salida != null){
            Duration duracion = Duration.between(entrada, salida);
            long minutos = duracion.toMinutes();
            double horas = Math.ceil(minutos / 60.0);

            if(horas == 0){
                horas = 1;
            }
            return (long)horas;

        }
        
        return 0;
    }

        public double calcularMontoPago(Registro registro){
        double tarifa = 9500;
        long totalHoras = calcularTotalHoras(registro);
        double total = tarifa * totalHoras;
        
        return total;

        }

        public Pagos guardarMonto(Registro registro, String metodoPago){
            double monto = calcularMontoPago(registro);
            
            Pagos pago = new Pagos(0, registro.getIdRegistro(), "pagado", metodoPago, LocalDate.now(), monto);
            pago.setIdRegistro(registro.getIdRegistro());
            pago.setMonto(monto);
            pago.setIdRegistro(registro.getIdRegistro());
            pago.setMetodoPago(pago.getMetodoPago());
            pago.setFechaPago(LocalDate.now());
            pago.setEstadoPago(pago.getEstadoPago());

            return pago;
        }
 }
