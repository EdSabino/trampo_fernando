import java.util.Scanner;

class Main {    
    public static void main (String args[]) {
        this.sc 
    }

    public static void menuAddEvent () {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Adicinando Evento -- ");
        Event event = new Event();
        System.out.println("Ano:");
        event.year = sc.nextInt();
        System.out.println("Mes:");
        event.month = sc.nextInt();
        System.out.println("Dia:");
        event.day = sc.nextInt();
        System.out.println("Hora:");
        event.hour = sc.nextInt();
        System.out.println("Minuto:");
        event.minuto = sc.nextInt();
    } 
}