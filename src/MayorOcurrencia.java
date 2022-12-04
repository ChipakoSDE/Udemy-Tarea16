import java.util.Scanner;

public class MayorOcurrencia {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int count = a.length;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un número entero: ");
            a[i] = s.nextInt();
        }
        System.out.println("\nEl arreglo ingresado es el siguiente:" );
        for (int i = 0; i < count; i++) {
            System.out.print("[" + a[i] + "];");
        }

        for (int i = 0; i < count; i++) {
            int aux = 0;
            for (int j = 0; j < count; j++) {
                if (a[i] == a[j]) {
                    aux++;
                }

            }
        b[i] = aux;
        }
        int max = 0, posicion = 0;

        for (int i = 0; i < count; i++) {
            if (b[i] > max){
                max = b[i];
                posicion = i;
            }
        }
        System.out.println("\nEl número con más ocurrencias es el " + a[posicion] + " y se repite " + max + " veces" );

    }
}
