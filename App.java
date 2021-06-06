import java.util.Scanner;

public class App{

    public static void main (String[] args)
    {

System.out.println("entrer un entier n");
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
System.out.println(n);

if (n %2 == 0){
    System.out.println (" le nombre est paire");
}
else 
{
    System.out.println("le nombre est impair");
}
    }
}