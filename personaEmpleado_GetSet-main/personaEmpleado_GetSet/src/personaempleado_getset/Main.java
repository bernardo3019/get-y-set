package personaempleado_getset;

/**
 * Programa que atraves de clases y metodos setter's y getter's muestra la información de un empleado.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Main {
    public static void main(String[] args) {
        //EMPLEADO.
        Empleado emp = new Empleado();
        emp.setNombre("Mengano");
        emp.setEdad(25);
        emp.setGenero("Masculino");
        emp.setSueldo(50000.0);
            //Imprimir en consola al empleado.
        emp.mostrarDatos();
        emp.mostrarSueldo();
        
        //ESTUDIANTE.
        System.out.println("\n");
        System.out.println("Estudiante: ");
        Estudiante est = new Estudiante();
        est.setNombre("Ana");
        est.setEdad(20);
        est.setGenero("Femenino");
        est.setCarrera("Ingenieria informática");
            //Imprimir en consola al estudiante.
        est.mostrarDatos();
        est.mostrarCarrera();
        
        //CLIENTE.
        System.out.println("\n");
        System.out.println("Cliente: ");
        Cliente cli = new Cliente();
        cli.setNombre("Maria");
        cli.setEdad(30);
        cli.setDireccion("123 Calle Principal");
        cli.setGenero("Femenino");
            //Imprimir en consola al cliente.
        cli.mostrarDatos();
        cli.mostrarDireccion();
        
        //PROFESOR.
        System.out.println("\n");
        System.out.println("Profesor: ");
        Profesor pro = new Profesor();
        pro.setNombre("Daniel");
        pro.setEdad(40);
        pro.setGenero("Masculino");
        pro.setEspecialidad("Matemáticas");
            //Imprimir en consola al profesor.
        pro.mostrarDatos();
        pro.mostrarEspecialidad();
        
        //ACTOR.
        System.out.println("\n");
        System.out.println("Actor: ");
        Actor act = new Actor();
        act.setNombre("Evelin");
        act.setEdad(35);
        act.setGenero("Femenino");
        act.setGeneroCine("Drama");
            //Imprimir en consola actor.
        act.mostrarDatos();
        act.mostrarGeneroCine();
        
        //ESTILISTA.
        System.out.println("\n");
        System.out.println("Estilista: ");
        Estilista sta = new Estilista();
        sta.setNombre("Estiven");
        sta.setEdad(28);
        sta.setGenero("Masculino");
        sta.setEspecialidadCorte("Cortes modernos");
            //Imprimir en consola al estilista.
        sta.mostrarDatos();
        sta.mostrarEspecialidadCorte();
        
        
    }
        
}
