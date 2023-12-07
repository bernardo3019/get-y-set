package personaempleado_getset;
public class Empleado extends personaEmpleado{
    private double sueldo;
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void mostrarSueldo(){
        System.out.println("sueldo: " + sueldo);
    }
}
