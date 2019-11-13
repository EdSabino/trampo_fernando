import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        
        int maior, menor;
        double media;
        List<Double> ints = new ArrayList<>(Arrays.asList());
        Scanner sc = new Scanner(System.in); 
        
        while(sc.hasNextLine()){
           ints.add(Integer.valueOf(sc.next()));
        }

        sc.close();
        for ( int i = 0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }
        int cont;
        int num = 0;

        for(Integer i : ints ){
            cont = 0;

            for(int u=1; u<=i;u++){
                if(i%u == 0){
                    cont++;
                    num = u;
                }
            }
            if(cont == 2) {
                System.out.println("O Número: " + num + " é primo e seus primos são: 1 e "+ num);
            }
        }
        for ( int i = 0; i<ints.size(); i++) {
            if(ints.get(i)%7 && ints.get(i)%10)
              System.out.print(ints.get(i));
        }

        maior = ints.get(0);
        menor = ints.get(0);
        media = ints.gets(0);

        for ( int i = 1; i<ints.size(); i++) {
            if(ints.get(i)> maior) maior = ints.get(i);
            if(ints.get(i)< menor) menor = ints.get(i);
            media+=ints.get(i);
        }
        System.out.print("Maior: " + maior);
        System.out.print("Menor: " + menor);
        System.out.print("Média: " + media/ints.size());
    }
}
