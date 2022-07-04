import java.util.Scanner;

public class PrimeSkaiciai {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sk =0;
        String  primeSkaiciai = "";
        System.out.println("Irašyk paskutinį sąrašo skaičių (n):");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int skaitiklis = 0;
            for(sk = i; sk >= 1; sk--)
            {
                if(i % sk == 0)
                {
                    skaitiklis = skaitiklis + 1;
                }
            }
            if (skaitiklis ==2)
            {
                primeSkaiciai = primeSkaiciai + i + " ";
            }
        }
        System.out.println("Prime skaičiai nuo 1 iki n yra :");
        System.out.println(primeSkaiciai);
    }
}
