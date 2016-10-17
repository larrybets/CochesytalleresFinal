/**
 * Created by DAM on 6/10/16.
 */
public class Persona {

    private String dni;
    private String numero_seguridad_social;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(String dni, String numero_seguridad_social, String nombre, String apellidos, int edad, double salario) {
        this.dni = dni;
        this.numero_seguridad_social = numero_seguridad_social;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumero_seguridad_social() {
        return numero_seguridad_social;
    }

    public void setNumero_seguridad_social(String numero_seguridad_social) {
        this.numero_seguridad_social = numero_seguridad_social;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
