import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dimension = 0;
        System.out.println("Ingrese la dimension de la matriz");
        while (!sc.hasNextInt()) {
            System.out.println("la dimension debe ser un numero entero");
            sc.next();
        }
        dimension = sc.nextInt();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la opcion que desea realizar");
            while (!sc.hasNextInt()) {
                System.out.println("la dimension debe ser un numero entero");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {

            case 1:
                Punto1 objP1 = new Punto1();
                objP1.P1(dimension);
                break;
            case 2:
                Punto2 objP2 = new Punto2();
                objP2.P2(dimension);
                break;
            case 3:
                Punto3 objP3 = new Punto3();
                objP3.P3();
                break;
            case 4:
                Punto4 objP4 = new Punto4();
                objP4.P4();
                break;
            case 5:
                Punto5 objP5 = new Punto5();
                objP5.P5();
                break;

            default:
                System.out.println("Hasta pronto");
                continuar = false;
                break;
        }
            }
        }
    }