package ec.edu.espe;

import ec.edu.espe.builder.Empleado;
import ec.edu.espe.builder.EmpleadoBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado empleado1=new Empleado();
        empleado1.setNombre("Brayan");
        empleado1.setApellido("Lopez");

        Empleado empleado2=new Empleado("Juanito","perez");

        System.out.println("empleado1:"+empleado1.toString());
        System.out.println("empleado2:"+empleado2.toString());

        EmpleadoBuilder empleado3 = new EmpleadoBuilder.Builder()
                .setNombre("Anita")
                .setApellido("Lopez")
                .build();
        System.out.println("empleado3:"+empleado3.toString());

        EmpleadoBuilder empleado4 = new EmpleadoBuilder.Builder()
                .setNombre("Liliana")
                .build();
        System.out.println("empleado4:"+empleado4.toString());

        EmpleadoBuilder empleado5 = new EmpleadoBuilder.Builder()
                .setNombre("Liliana")
                .setApellido("Chora")
                .setGenero("F")
                .setPuesto("Analista de Ti")
                .setSalario(2000)
                .build();
        System.out.println("empleado5:"+empleado5.toString());
    }
}