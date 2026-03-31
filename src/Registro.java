import java.time.LocalDateTime;

public class Registro {
    private int idRegistro;
    private String idPlaca;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private String estado;
    private int idCelda;

public Registro(){};


public Registro(int idRegistro, String idPlaca, LocalDateTime horaEntrada, LocalDateTime horaSalida, String estado, int idCelda){
    this.idRegistro = idRegistro;
    this.idPlaca = idPlaca;      
    this.horaEntrada = horaEntrada;
    this.horaSalida = horaSalida;
    this.estado = estado;
    this.idCelda = idCelda;
}


public int getIdRegistro() {
    return idRegistro;
}


public void setIdRegistro(int idRegistro) {
    this.idRegistro = idRegistro;
}


public String getidPlaca() {
    return idPlaca;
}


public void setidPlaca(String idPlaca) {
    this.idPlaca = idPlaca;
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

public int getidCelda() {
    return idCelda;
}

public void setIdCelda(int idCelda){
    this.idCelda = idCelda;
}

}


