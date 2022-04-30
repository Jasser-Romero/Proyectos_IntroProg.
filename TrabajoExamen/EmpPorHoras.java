package TrabajoExamen;

public class EmpPorHoras extends Empleado {

    protected int horasTrabajadas;
    protected float cuotaPorHora;
    protected float sueldoQuincenaHoras;

    public EmpPorHoras(String empleado, String departamento, String empPuesto) {
        super(empleado, departamento, empPuesto);
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setCuotaPorHora(float cuotaPorHora) {
        this.cuotaPorHora = cuotaPorHora;
    }

    public void calcularSueldoQuincenaHoras(float sueldoQuincenaHoras) {
        this.sueldoQuincenaHoras = horasTrabajadas*cuotaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public float getCuotaPorHora() {
        return cuotaPorHora;
    }

    public float getSueldoQuincenaHoras() {
        return sueldoQuincenaHoras;
    }
}
