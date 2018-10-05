package ejercicio1;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        String nombre;
        int cedula;
        int nro_telefono;
        //Creamos el objeto de la clase estudiante
        Estudiante objeto = new Estudiante();
        //Utilizamos for para solicitar ingresar la informacion de lso dos estudiantes
        for (int i = 1; i <= 2 ; i++) {
            System.out.printf("Ingrese el nombre del estudiante %d:\n ",i);
            nombre = entrada.nextLine();
            System.out.printf("Ingrese la cedula del estudiante %d:\n ",i);
            cedula = entrada.nextInt();
            System.out.printf("Ingrese el numero de telefono del estudiante %d:\n ",i);
            nro_telefono = entrada.nextInt();
            entrada.nextLine();
            //Usamos el objeto de la clase estudiante para enviar la informacion de cada estudiante
            objeto.nombre = nombre;
            objeto.cedula = cedula;
            objeto.nro_telefono = nro_telefono;
        }
//Usamos el objeto para llamar el metodo agregar_informacion
        objeto.Agregar_informacion();

    }
}
