
package ejercicio1;

public class Estudiante {
    int cedula;
    String nombre;
    int nro_telefono;
    //Creamos un metodo para imprimir la informacion de los estudiantes
    public void Agregar_informacion(){
        for (int i = 1; i <= 2; i++) {
            System.out.printf("Datos del Estudiante %d\nNombre : %s\nCedula : %d\nNro.Telefono : %d\n ",i,nombre,cedula,nro_telefono);
        }
    }
}
