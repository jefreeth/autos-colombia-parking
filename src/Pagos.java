import java.time.LocalDate;

// clase pagos 
public class Pagos {
    private int idPago;
    private int idRegistro;
    private String estadoPago;
    private String metodoPago;
    private LocalDate fechaPago;
    private double monto;
    
    //constructor
    public Pagos(int idPago, int idRegistro, String estadoPago, String metodoPago, LocalDate fechaPago, double monto) {
        this.idPago = idPago;
        this.idRegistro = idRegistro;
        this.estadoPago = estadoPago;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
