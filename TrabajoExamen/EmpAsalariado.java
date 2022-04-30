package TrabajoExamen;

public class EmpAsalariado extends Empleado{

    protected float gananciaMensual;
    protected float gananciaQuincenal;

    public EmpAsalariado(String empleado, String departamento, String empPuesto) {
        super(empleado, departamento, empPuesto);
    }

    public void setGananciaMensual(float gananciaMensual) {
        this.gananciaMensual = gananciaMensual;
    }

    public void calcularGananciaQuincenal(float gananciaQuincenal) {
        this.gananciaQuincenal = gananciaMensual/2;
    }

    public float GananciaQuincenal() {
        return gananciaQuincenal;
    }

    public float getGananciaMensual() {
        return gananciaMensual;
    }
}
