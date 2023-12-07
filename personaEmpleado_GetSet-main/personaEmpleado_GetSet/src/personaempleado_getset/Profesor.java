package personaempleado_getset;
/**
 * Clase 'Profesor'; hereda a 'persona'.
 */
public class Profesor extends personaEmpleado{
    private String especialidad;
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void mostrarEspecialidad(){
        System.out.println ("Especialidad: "+ especialidad);
    }
}
