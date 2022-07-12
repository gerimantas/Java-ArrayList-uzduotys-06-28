import java.util.*;

public class PrimeSkaiciai {

    public static void main (String[] args) {

        Scanner skait = new Scanner(System.in);
        int i =0;
        int num =0;

        String  primeSkaic = "";
        System.out.println("Koks saraso ilgis n:");
        int n = skait.nextInt();
        skait.close();
        for (i = 1; i <= n; i++)
        {
            int numeris=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    numeris = numeris + 1;
                }
            }
            if (numeris ==2)
            {
                primeSkaic = primeSkaic + i + " ";
            }
        }
        System.out.println("Pirminiai skaiciai sarase nuo 1 iki " + n + " yra :");
        System.out.println(primeSkaic);
        String[] sarasas = new ArrayList<String>().toArray(new String[0]);
        sarasas = primeSkaic.split(" ");
        System.out.println("Saraso ilgis yra " + sarasas.length + " skaiciai");


    }
}





