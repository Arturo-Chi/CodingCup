import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class H{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        List<ArrayList<Integer>> arreglo= new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> fila = new ArrayList<Integer>();
            int x= s.nextInt();
            for(int j = 0; j < x; j++){
                int y = s.nextInt();
                fila.add(y);
            }
            Collections.sort(fila, Collections.reverseOrder());
            arreglo.add(fila);
        }
        for (ArrayList<Integer> arrayList : arreglo) {
            System.out.println(arrayList);
        }
        int resultado = 0;
        
    }
}