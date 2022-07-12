import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MasyvuSujungimas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        java.util.ArrayList<Integer> sarasas1 = new ArrayList<>();
        sarasas1 = nuskaitymas (scan);

        ArrayList<Integer> sarasas2 = new ArrayList<>();
        sarasas2 = nuskaitymas2(scan);

        System.out.println("------------------");
        System.out.println("GAVAU 2 SARASUS:");
        System.out.print(sarasas1);
        System.out.println(sarasas2);
        System.out.println("------------------");

        ArrayList<Integer> sarasas3 = new ArrayList<>();
        sarasas3.addAll(sarasas1);
        sarasas3.addAll(sarasas2);
        System.out.println("GAVAU SARASA VIENAS PASKUI KITA SUJUNGTUS:");
        System.out.println(sarasas3);
        System.out.println("------------------");



        // Iterating over List1
        Iterator<Integer> iterator = sarasas1.iterator();

        // ConditionCheck using hasNext() method which hold
        // true till single element in remaining List
//        while (iterator.hasNext()) {
//
//            // Printing List1 contents
//            System.out.print(iterator.next() + " ");
//        }
//
//        // New line
//        System.out.println();
//
//        // Display message
//        System.out.print("sarasas2 contents: ");
//        iterator = sarasas2.iterator();
////
////        // ConditionCheck using hasNext() method which hold
////        // true till single element in remaining List
//        while (iterator.hasNext()) {
//
//            // Printing List2 contents
//            System.out.print(iterator.next() + " ");
//        }
        // Setting counters to zeros
        int i = 0;
        int j = 0;

        // Creating(declaring) merged list
        ArrayList<Integer> sarasas4 = new ArrayList<Integer>();

        // Iterating over both the lists
        // until the shorter list
        while (i < sarasas2.size() && j < sarasas1.size())
        {
            // Step 1: Adding List2 element
            sarasas4.add(sarasas1.get(j));

            // Step 2: Adding List1 element
            sarasas4.add(sarasas2.get(i));

            // Incrementing counters
            i++;
            j++;
        }

        // Iterating over the remaining part of List1

        // Case 1: Input: ShorterList following BiggerList
        while (i < sarasas2.size())
        {
            // Merge remaining List to List1, and
            // making List2 final as NULL List
            sarasas4.add(sarasas2.get(i));
            i++;
        }

        // Case 2: Input: BiggerList following ShorterList
        while (j < sarasas1.size())
        {

            // Merge remaining List to List1,an d
            // making List2 -> NULL List
            sarasas4.add(sarasas1.get(j));
            j++;
        }

        // New line
        System.out.println();

        // Display message
        System.out.println("SUKELIU PO 1 SKAICIU  IS EILES IS KIEKVIENO SARASO: ");

        // Iterating over merged list
        iterator =sarasas4.iterator();

        // Condition check using hasNext() method which
        // holds true till there is single element remaining
        // in the List
        while (iterator.hasNext())
        {
            // Printing merged List contents i.e
            // FinalList = List1 + List2(Null final List)
            System.out.print(iterator.next() + " ");
        }

    }


    public static ArrayList<Integer> nuskaitymas(Scanner skait)
    {
        ArrayList<Integer> sar1 = new ArrayList();
        int n;

        System.out.print("Ivesk kiek bus elementu 1-am sarase : ");
        n = skait.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.print("Ivesk 1-o saraso skaiciu: ");
            int laikinasSk;
            laikinasSk = skait.nextInt();
            sar1.add(laikinasSk);
        }
        return sar1;

    }

    public static ArrayList<Integer> nuskaitymas2(Scanner skait)
    {
        ArrayList<Integer> sar2 = new ArrayList();
        int n;

        System.out.print("Ivesk kiek bus elementu 2-am sarase : ");
        n = skait.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.print("Ivesk 2-o saraso skaiciu: ");
            int laikinasSk;
            laikinasSk = skait.nextInt();
            sar2.add(laikinasSk);
        }
        return sar2;

    }


}
