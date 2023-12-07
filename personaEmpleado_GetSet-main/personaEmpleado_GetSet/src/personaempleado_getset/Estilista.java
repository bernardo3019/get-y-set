package personaempleado_getset;
/**
 * Clase 'estilista'; hereda a 'persona'.
 */
public class Estilista extends personaEmpleado{
    private String especialidadCorte;
    public String getExpecialidadCorte(){
        return especialidadCorte;
    }
    public void setEspecialidadCorte(String especialidadCorte){
        this.especialidadCorte = especialidadCorte;
    }
    public void mostrarEspecialidadCorte(){
        System.out.println("Especialidad en corte de cabellos: " + especialidadCorte);
    }
}
