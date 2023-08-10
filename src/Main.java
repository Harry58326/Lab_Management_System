import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(6);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type add if you want to add Student info");
            System.out.println("Type list if you want to list Student info");
            String answer = sc.next();
            switch (answer){
                case "add" :
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter student id");
                    int id = sc1.nextInt();
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Please enter student name");
                    String name = sc2.next();
                    Student s = new Student(id, name);
                    ht.add(s);
                    break;
                case "list" :
                    ht.list();
                    break;
                default:
                    break;
            }
        }
    }
}