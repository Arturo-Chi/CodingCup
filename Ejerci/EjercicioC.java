import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EjercicioC {
    


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ms = s.nextInt();
        int vc = s.nextInt();


        Stack<Integer> list1 = new Stack<>();
        Queue<Integer> list2 = new LinkedList<>();


        for (int i = 0; i < vc; i++) {
            int virus = s.nextInt();
            list1.push(virus);
        }
        System.out.println("Lista de virus: "+list1);
       
        
        int contador = 0;
    
        while(par(list2) && !list1.isEmpty()){
            contador++;
            int ingresa = list1.lastElement();
            if (list1.size() >= 0) {
                list1.pop();               
            }
 
         
            System.out.println("Se ingresa: "+ingresa);     
            //list2.push(ingresa);
            list2.add(ingresa);

            //System.out.println("En memoria: "+list2);
            //System.out.println("Tamanio: "+list2.size()+"\n");
            //System.out.println("Virus restantes: "+list1);

            if(list2.size()==3){
                list2.poll();
            }

            contador++;

        };

        
        if(list1.isEmpty()){
            //System.out.println("Se ingresa al if");
            System.out.println("Dont worry bob");
        }else{
            System.out.println("Tiempo en el que fallara: "+contador);
        }

    }

    public static boolean par(Queue<Integer> memoria) {
        boolean state = true;
        //System.out.println("Ingreso al metodo");
        for(int v : memoria){
            if(v%2==0){
                state = false;
                break;
            }else{
                state = true;
            }
        }
        System.out.println(state);
        return state;
        
    }
}
