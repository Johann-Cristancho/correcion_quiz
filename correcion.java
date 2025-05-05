import java.util.Scanner;

public class correcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero de 1 a 5");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verano");
                break;
            case 3:
                System.out.println("Otoño");
                break;
            case 4:
                System.out.println("Halloween");
                break;
            case 5:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("No es valido");
                break;
        }

    }
}
