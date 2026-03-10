import java.time.LocalDateTime;

public class Registro {
    int idRegistro;
    String placaEntrada;
    LocalDateTime horaEntrada;
    LocalDateTime horaSalida;
    String estado;


public Registro(int idRegistro, String placaEntrada, LocalDateTime horaEntrada, LocalDateTime horaSalida, String estado){
    this.idRegistro = idRegistro;
    this.placaEntrada = placaEntrada;      
    this.horaEntrada = horaEntrada;
    this.horaSalida = horaSalida;
    this.estado = estado;

}


public int getIdRegistro() {
    return idRegistro;
}


public void setIdRegistro(int idRegistro) {
    this.idRegistro = idRegistro;
}


public String getPlacaEntrada() {
    return placaEntrada;
}


public void setPlacaEntrada(String placaEntrada) {
    this.placaEntrada = placaEntrada;
}


public LocalDateTime getHoraEntrada() {
    return horaEntrada;
}


public void setHoraEntrada(LocalDateTime horaEntrada) {
    this.horaEntrada = horaEntrada;
}


public LocalDateTime getHoraSalida() {
    return horaSalida;
}


public void setHoraSalida(LocalDateTime horaSalida) {
    this.horaSalida = horaSalida;
}


public String getEstado() {
    return estado;
}


public void setEstado(String estado) {
    this.estado = estado;
}


}


