import java.util.function.BinaryOperator;
import java.util.Scanner;

public class Main {
 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String bin = "";
        String binario = Integer.toBinaryString(n);
        for(int i= 0; i < binario.length();i++){
            bin+="1";
        }
        int cont = 0;
        String ent = Integer.toHexString(Integer.parseInt(binario));
        
        while(!binario.equals(bin) && n > 0){
            cont++;
            int b1= Integer.parseInt(binario,2);
            binario = Integer.toBinaryString( b1 | n-cont);
            n-=1;
        }
        System.out.println(cont+1);
        
    }
}
