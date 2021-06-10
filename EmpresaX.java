package ProgramacionUno;

public class EmpresaX
{
    //atributos
    private String nombreEmpresa;
    private int contador=0;
    private EmpleadoXHora empleados[];

    //constructor
    public EmpresaX(String nombreE, int cantidadEmpleados)
    {
        this.nombreEmpresa=nombreE;
        empleados=new EmpleadoXHora[cantidadEmpleados];
    }
    public void setNombreEmpresa(String nombreE)
    {
        this.nombreEmpresa=nombreE;

    }
    public String getNombreEmpresa()
    {
        return nombreEmpresa;
    }

    //buscar empleado y retornar todos los objetos

    public EmpleadoXHora buscarEmpleado(int codigoE)
    {
        //foreach
        for(EmpleadoXHora eph:empleados)
        {
            if(eph!=null && eph.getCodigo()==codigoE)
                return eph;

        }
        return null;
    }

    public boolean agregarEmpleado1(int codigoE, String nombreE)
    {
        if(buscarEmpleado(codigoE)==null)
        {
            for(int posicion=0;posicion< empleados.length;posicion++)
            {
                if(empleados[posicion]==null)
                {
                    empleados[posicion] = new EmpleadoXHora(codigoE, nombreE);
                    return true;
                }

            }

        }

    return  false;
    }
    public boolean agregarEmpleado2(int codigoE, String nombreE)
    {
        if(buscarEmpleado(codigoE)==null && contador< empleados.length)
        {
            empleados[contador]=new EmpleadoXHora(codigoE,nombreE);
            contador++;
            return true;
        }
    return false;
    }

    //imprimir

    public void imprimirE()
    {
        for(EmpleadoXHora eph:empleados)
        {
            if(eph!=null)
                eph.imprimir();
        }
    }
    //pagar empleado

    public double pagar(int codigoE)
    {
        EmpleadoXHora eph=buscarEmpleado(codigoE);
        if(eph!=null)
        {
            return eph.PagoEmpleado();
        }
        return -1;
    }
}
