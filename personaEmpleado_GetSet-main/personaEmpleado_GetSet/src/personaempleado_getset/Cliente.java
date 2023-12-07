package personaempleado_getset;
public class Cliente extends personaEmpleado {
    private String direccion;
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void mostrarDireccion(){
        System.out.println("Direccion: "+ direccion);
    }
}
