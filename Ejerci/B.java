import java.util.Scanner;

public class B{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] angulos = new int[n];
        for(int i =0 ; i < n; i++){
            angulos[i] = s.nextInt();
        }
        int dif= s.nextInt();
        boolean seguro = true;
        for(int i =0 ; i < n-1; i++){
            if(Math.abs(angulos[i+1]-angulos[i]) > dif){
                seguro = false;
                break;
            }
        }
        if(seguro){
            System.out.println("Seguro");
        }else{
            System.out.println("Inseguro");
        }
    }
}