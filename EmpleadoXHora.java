package ProgramacionUno;



public class EmpleadoXHora
{

    //atributos
    private int codigo;
    private String nombre;
    private double horas;
    //constructor
    public EmpleadoXHora(int codigo,String nombre)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.horas=0.0;
    }
    //metodos
    //set y get

    public void setHoras(double hora)
    {
        this.horas=hora;
    }

    public double getHoras()
    {
        return horas;
    }


    public int getCodigo()
    {
        return codigo;
    }
    public String getNombre()
    {
        return nombre;
    }

    /*Funcion especifica
    crear una funcion para pagar al empleado, pero
    evaluar sus horas trabajadas, sus horas normales
    son hasta 40 horas y si es mayor que 40h normales
    se condidera horas extra para el empleado, tienen
    costo en pagar al empleado:
    horas normales son de 100 lempiras a la hora
    horas extras son de 200 lempiras por hora extra
     */

    public double PagoEmpleado()
    {

        if (horas<=40 && horas>0)
            return horas*100;
        else
            return (40*100)+((horas-40)*200);

    }
    public void imprimir()
    {
        System.out.println("Codigo :"+codigo+
                "\nTetas enormes : "+nombre+
                "\nHoras trabajadas: "+horas);

    }


}
