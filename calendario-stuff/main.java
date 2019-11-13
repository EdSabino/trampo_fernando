import java.util.Scanner;
import java.util.ArrayList;

class Main {    
    static ArrayList<Event> eventList;
    public static void main (String args[]) {
        eventList = new ArrayList<Event>();
        menuAddEvent();
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
        System.out.println("[1] - Am ou [2] - Pm?");
        event.isAm = sc.nextInt() == 1;
        System.out.println("Minuto:");
        event.minute = sc.nextInt();
        eventList.add(event);
    } 
}