import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int entrada = s.nextInt();
        int resultado = (((((entrada*567)/9)+7492)*235)/47)-498;
        if(resultado%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
