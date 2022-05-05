import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GenerarPila<Integer> pila = new GenerarPila<Integer>(GenerarPila.MAX_NUMEROS);
        Scanner sc = new Scanner(System.in);
        boolean entradaUsuario = false;
        while (!entradaUsuario) {
            System.out.println("1.......Introducir valores");
            System.out.println("2.......Sumar valores");
            System.out.println("3.......Restar valores");
            System.out.println("4.......Multiplicar valores");
            System.out.println("5.......Dividir valores");
            System.out.println("Q.......Sumar todo y salir");
            System.out.println("Qué deseas hacer?");

            String opcion = sc.nextLine();
            switch (opcion) {
                case"1":
                    System.out.println("Añade el primer número");
                    int primerValor = sc.nextInt();
                    pila.push(primerValor);
                    System.out.println("Añade el segundo número");
                    int segundoValor = sc.nextInt();
                    pila.push(segundoValor);
                    break;
                case "2":
                    int sumar = 0;
                    for (int i = 0; i < pila.numObjetos; i++) {
                        sumar += pila.pop();
                    }
                    System.out.println(sumar);
                    break;
                case "3":
                    int restar = 0;
                    for (int i = 0; i < pila.numObjetos; i++) {
                        restar = restar - pila.pop();
                    }
                    System.out.println(restar);
                    break;
                case "4":
                    int multiplicar = 0;
                    for (int i = 0; i < pila.numObjetos; i++) {
                        multiplicar = multiplicar * pila.pop();
                    }
                    System.out.println(multiplicar);
                    break;
                case "5":
                    int dividir = 0;
                    for (int i = 0; i < pila.numObjetos; i++) {
                        dividir = dividir / pila.pop();
                    }
                    System.out.println(dividir);
                    break;
                case"Q":
                    System.out.println("Saliendo...");
                    entradaUsuario = true;
                    break;
                default:
                    System.out.println("Introduce una opción correcta...");
            }
        }
    }
}
