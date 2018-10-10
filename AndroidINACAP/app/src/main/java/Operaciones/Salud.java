package Operaciones;

public class Salud {
    private String Nombre;
    private int Edad;
    private int pesoActual;
    private String EstadoPeso;
    private int pesoIdeal;

    //Creamos metodo para calular peso ideal
    public int calcularPesoIdeal() {
        pesoIdeal = Edad * 2 + 8;
        return pesoIdeal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getpesoActual() {
        return pesoActual;
    }

    public void setpesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public String getEstadoPeso() {
        return EstadoPeso;
    }

    public void setEstadoPeso(String EstadoPeso) {
        EstadoPeso = EstadoPeso;
    }

    public int getpesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String compararPeso() {
        if (pesoActual == pesoIdeal) {
            EstadoPeso = "peso ideal";
        } else {
            if (pesoActual < pesoIdeal) {
                EstadoPeso = "bajo peso";
            } else {
                EstadoPeso = "sobre peso";
                }
            }
        return EstadoPeso;
        }

    }

