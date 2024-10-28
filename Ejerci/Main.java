import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m =  s.nextInt();
        int [] a = new int[m];
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
    
        for(int i=0; i <m; i++){
            int c = s.nextInt();
            list.add(c);
        }
        for (int x= list.size()-1; x >=0;x-=1) {
            list2.add(list.get(x));
        }
        int resultado = 0;
        if(list2.get(0)%2==0){
            resultado = 2;
        }
        else{
            for(int x=0; x < m;x++){
                if(list2.get(x)%2==0){
                    resultado = x+1;
                    break;
            }
        }
        if(resultado==0){
            System.out.println("Do not worry Bob");
        }else{
            System.out.println(resultado);
        }
        }

    }
}
