import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        
        int maior = 0;
        int menor = 999999999;
        double media =0;
        List<Double> ints = new ArrayList<>(Arrays.asList());
        Scanner sc = new Scanner(System.in); 
        
        //while(sc.hasNext()){
        //   ints.add(Integer.valueOf(sc.next()));
        //}
        ints.add(1.0);
        ints.add(2.0);
        ints.add(3.0);
        sc.close();

        for ( int i = 0; i<ints.size(); i++) {
            if(ints.get(i) % 7 && ints.get(i) % 10)
              System.out.print(ints.get(i));
        }

        for ( int i = 0; i<ints.size(); i++) {
            if(ints.get(i)> maior) maior = ints.get(i);
            if(ints.get(i)< menor) menor = ints.get(i);
            media+=ints.get(i);
        }
        System.out.print("Maior: " + maior);
        System.out.print("Menor: " + menor);
        System.out.print("Média: " + media/ints.size());
    }
}
