package personaempleado_getset;
public class personaEmpleado {
    private String nombre;
    private int edad;
    private String genero;
       
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void mostrarDatos(){
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: " + edad);
        System.out.println("genero: "+ genero);
    }

