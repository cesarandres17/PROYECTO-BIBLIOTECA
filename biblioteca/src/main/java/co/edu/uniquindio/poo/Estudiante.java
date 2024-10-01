package co.edu.uniquindio.poo;



public class Estudiante extends Persona {

    private boolean estado;
    private int cantidadPrestamos = 0;

    public Estudiante(String nombre, String cedula, String correo, int telefono, boolean estado) {
        super(nombre, cedula, cedula, correo);
        this.estado = estado;
        
    }




    /**
     * Obtiene la cantidad de préstamos realizados por el estudiante.
     * 
     * @return Cantidad de préstamos
     */
    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    /**
     * Incrementa la cantidad de préstamos del estudiante.
     */
    public void incrementarPrestamos() {
        cantidadPrestamos++;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", prestamos=" + cantidadPrestamos + "]";
    }

}
