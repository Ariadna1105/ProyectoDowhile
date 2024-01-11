import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Ingresa cualquier numero para continuar o 0 para salir");
            opcion= leer.nextInt();
        }  while(opcion!=0);{
            System.out.println("Cerraste el programa");
        }
    }
}