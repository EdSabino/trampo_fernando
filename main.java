import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
    
        ArrayList<Integer> ints = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in); 
        
        while(sc.hasNext()){
            ints.add(Integer.valueOf(sc.next()));
        }
        sc.close();

        for ( int i = 0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }
    }
}
