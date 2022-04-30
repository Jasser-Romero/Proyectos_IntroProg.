package TrabajoExamen;

public class Empleado {

    String empleado;
    String departamento;
    String empPuesto;

    public Empleado(String empleado, String departamento, String empPuesto) {
        this.empleado = empleado;
        this.departamento = departamento;
        this.empPuesto = empPuesto;
    }

    public String getEmpleado() {
        return empleado;
    }


    public String getDepartamento() {
        return departamento;
    }


    public String getEmpPuesto() {
        return empPuesto;
    }

}
