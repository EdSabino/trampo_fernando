import java.util.Scanner;
import java.util.ArrayList;

class Main {    
    static ArrayList<Event> eventList;
    public static void main (String args[]) {
        eventList = new ArrayList<Event>();
        menu();
    }

    public static void menu () {
        System.out.println("-- Gerenciador de Eventos -- ");
        System.out.println("[1] - Adicionar");
        System.out.println("[2] - Listar");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                menuAddEvent();
                break;
            case 2:
                listEvents();
                break;
            default:
                menu();
                break;
        }
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
        System.out.println("Hora (formato 24):");
        event.hour = sc.nextInt();
        System.out.println("Minuto:");
        event.minute = sc.nextInt();
        eventList.add(event);
        menu();
    }

    public static void listEvents () {
        System.out.println("-- Lista de eventos --");
        for (int i = 0; i < eventList.size(); i++) {
            Event e = eventList.get(i);
            System.out.println("-- Evento --");
            System.out.println("id  :" + i);
            System.out.println("data:" + e.getFormated());
        }
        menu();
    }
}