package personaempleado_getset;
/**
 * Clase 'actor'; hereda a ´persona'.
 */
public class Actor extends personaEmpleado {
    private String generoCine;
    public String getGeneroCine(){
        return generoCine;
    }
    public void setGeneroCine(String generoCine){
        this.generoCine = generoCine;
    }
    public void mostrarGeneroCine(){
        System.out.println("Genero cinematográfico" + generoCine);
    }
}
