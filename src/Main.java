import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[][] matris = {

                {2, 3, 4, 11},
                {22, 5, 6, 7}
        };

        // matrisin satırındaki eleman sayısı kadar sütunu olan ve matrisin satır sayısı kadar sütunu olan yeni boş transpoze matrisi oluşturulur.
        int[][] matrisTranspoze = new int[matris[0].length][matris.length];


        // matris forEach kullanılarak yazdırılır
        System.out.println("Matris: \n");
        for (int[] i : matris) {
            System.out.println(Arrays.toString(i));
        }

        // matris satırlarındaki eleman sayısı kadar dönecek döngü yaızlır.
        for (int i = 0; i < matris[0].length; i++) {

            // sütünu kadar döncek döngü yazılır
            for (int j = 0; j < matris.length; j++) {

                // transpozu alınır ve matrisTranspoze arrayine yazılır
                matrisTranspoze[i][j] = matris[j][i];
            }

        }

        // forEach ile matrisTranspoze print edilir.
        System.out.println("\nTranspoze: \n");

        for (int[] i : matrisTranspoze) {

            System.out.println(Arrays.toString(i));
        }
    }
}