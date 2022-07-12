import java.util.ArrayList;
import java.util.Scanner;

public class MasyvuSuma {
    public static void main(String[] args) {
        ArrayList<Integer> sarasas1 = new ArrayList<>();


        Scanner scan = new Scanner(System.in);

        System.out.print("Pradzios skaicius: ");
        int pradziosSkaicius = scan.nextInt();

        System.out.print("Pabaigos skaicius: ");
        int pabaigosSkaicius = scan.nextInt();
        if (pradziosSkaicius == pabaigosSkaicius)
        {
            System.out.println("Klaida, skaiciai negali buti lygus");
        }

        System.out.print("Kiek keisti: ");
        int kiekKeisti = scan.nextInt();

        pildSarasas1(pradziosSkaicius, pabaigosSkaicius, kiekKeisti, sarasas1);

        System.out.println("------------------");
        System.out.println("Gauname toki ArrayList'a: ");
        System.out.println(sarasas1);
//        System.out.print("Viso skaiciu: ");
//        System.out.println(sarasas1.size());
        System.out.println("------------------");
        int suma = (int) masyvoSuma(sarasas1);
        System.out.println("Masyvo suma = " +suma);

    }



    /**
     * sukuriam skaiciu sarasa
     * @param pradziosSkaicius
     * @param pabaigosSkaicius
     * @param kiekKeisti
     * @param sarasas1
     */
    public static void pildSarasas1(int pradziosSkaicius, int pabaigosSkaicius, int kiekKeisti, ArrayList<Integer> sarasas1)
    {

        if (pradziosSkaicius < pabaigosSkaicius)
            for (int x = pradziosSkaicius; x <= pabaigosSkaicius; x = x + kiekKeisti)
            {
                sarasas1.add(x);
            }

        else
            for (int x = pradziosSkaicius; x >= pabaigosSkaicius; x = x - kiekKeisti)
            {
                sarasas1.add(x);
            }
    }

    public static int masyvoSuma(ArrayList<Integer> sarasas1) {

        int suma = 0;
        for ( int i : sarasas1) {
            suma += i;
        }
        return suma;
    }


}
