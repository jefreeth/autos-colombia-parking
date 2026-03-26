// clase celdas
public class Celdas {

    private int id_celda;
    private int numero;
    private String estado;

    //constructor
    public Celdas(int id_celda, int numero, String estado) {
        this.id_celda = id_celda;
        this.numero = numero;
        this.estado = estado;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id_celda;
    }

    public void setId(int id_celda) {
        this.id_celda = id_celda;
    }

    

}
