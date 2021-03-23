// sacar el ultimo digito de un nuermo mayor a mil
import java.util.Scanner;
public class ulDigito {
    public static void main (String [] arg){
        int num,numu;
        Scanner read= new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000 ");
            num= read.nextInt();
        }while (num<1000);


        numu=num%10;
        System.out.println("El ultimo digito es: "+numu);

    }
}
