
import java.util.Scanner;


public class UsoDeConstantes {

    // CONSTANTES
    final static double CANT_JORNADAS_TRABAJADAS = 5.5;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sueldoDiario, sueldoSemanal;
        
        System.out.print("Ingrese su sueldo diario: ");
        sueldoDiario = Double.parseDouble(input.nextLine());
        
        sueldoSemanal = sueldoDiario * CANT_JORNADAS_TRABAJADAS;
        
        System.out.print("Tu sueldo semanal es de " + sueldoSemanal);
    }
}