import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n2=5;
        String bin = "";
        String binario = Integer.toBinaryString(n);
        for(int i= 0; i < binario.length();i++){
            bin+="1";
        }
        while (!bin.equals(binario)) {
            binario = Integer.toBinaryString(n|n2);
            int n2 = -1;
        }
        
        
        System.out.println(binario);
    }
}
