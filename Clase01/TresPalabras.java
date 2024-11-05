import java.util.Scanner;

public class TresPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("Hola " + nombre1 + "!");
        
        
        System.out.print("Por favor ingrese Alimento favorito: ");
        String nombre2 = sc.nextLine();
        System.out.println("Alimento " + nombre2 + "!");
            
       
        System.out.print(" Por favor ingrese su edad: ");
        int nombre3 = sc.nextInt();
        System.out.println("Edad " + nombre3 + "!");
                
    }
     
}