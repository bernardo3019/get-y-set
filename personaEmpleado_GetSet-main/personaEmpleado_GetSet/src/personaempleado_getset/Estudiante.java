package personaempleado_getset;
/**
 * Clase 'estudiante'; hereda a persona.
 */
public class Estudiante extends personaEmpleado {
    private String carrera;
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void mostrarCarrera(){
        System.out.println("Carrera: " + carrera);
    }
}
