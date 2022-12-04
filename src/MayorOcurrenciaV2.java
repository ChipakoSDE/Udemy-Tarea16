import java.util.Scanner;

public class MayorOcurrenciaV2 {
    public static void main(String[] args) {
        int[] a = new int[10];
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
        int aux = 0, mayorOcurrencia = 0, masRepetido = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (a[i] == a[j]) {
                    aux++;
                }
            }
            if (aux > mayorOcurrencia) {
                mayorOcurrencia = aux;
                masRepetido = a[i];
            }
            aux = 0;
        }
        System.out.println("\nEl número con más ocurrencias es el " + masRepetido + " y aparece " + mayorOcurrencia + " veces" );

    }
}
