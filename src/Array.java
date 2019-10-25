import java.util.Random;

public class Array {

    public static void main(String[] args) {

        int[] tab = new int[11];
        Random r = new Random(tab.length);

        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt();
            System.out.println(tab[i]);
        }
        for (int i = 11 - 1; i >= 0; i--)

            System.out.println(tab[i]);

    }

}

