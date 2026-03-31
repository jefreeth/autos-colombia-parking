import java.time.LocalDate;

// clase facturas
public class Facturas {
    private int idFactura;
    private int idPago;
    private LocalDate fechaEmision;
    private double totalHoras;
    private double tarifa;
    private double total;

    
    //constructor
    public Facturas(int idFactura, int idPago, LocalDate fechaEmision, double totalHoras, double tarifa, double total) {
        this.idFactura = idFactura;
        this.idPago = idPago;
        this.fechaEmision = fechaEmision;
        this.totalHoras = totalHoras;
        this.tarifa = tarifa;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

     // metodo mostrar factura
    public void mostrarFactura(Registro registro, Pagos pago){

        OperacionPago operacionPago = new OperacionPago();
        long horas = operacionPago.calcularTotalHoras(registro);

        System.out.println("-----FACTURA AUTOS COLOMBIA-----");
        System.out.println("placa: " + registro.getidPlaca());
        System.out.println("celda: " + registro.getidCelda());
        System.out.println("hora de entrada: " + registro.getHoraEntrada());
        System.out.println("hora de salida: " + registro.getHoraSalida());
        System.out.println("total horas: " + horas);
        System.out.println("tarifa: 9500");
        System.out.println("total: " + pago.getMonto());

    }
}
