import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class ExerciseQueue {
    Queue<Long> customerAttend = new LinkedList();


    public boolean addCustomer(){
        Random random1 = new Random();
        Long randomNumber = random1.nextLong();
        System.out.println("Name is add: " + randomNumber);
        return customerAttend.add(randomNumber);
    }

    public void pollCustomer(){
        customerAttend.poll();
    };

    public static void main(String[] args) {
        ExerciseQueue queue1 = new ExerciseQueue();
        System.out.println("Welcome!");
        System.out.println("Do you want to join app? ");
        Scanner sc = new Scanner(System.in);
        String resp = sc.next().toUpperCase();
        while(resp.equals("YES")){
            System.out.println("Choose to service adn write: ");
            System.out.println("Add customer");
            System.out.println("Poll customer");
            String respService = sc.next().toUpperCase();
            if(respService.equals("ADD")){
                queue1.addCustomer();
                System.out.println("Customer is waiting.. ");
            } else if (respService.equals("POLL")) {
                queue1.pollCustomer();
                System.out.println("Customer was attended! ");
            }
            System.out.println("Do you want to continue?");
            resp = sc.next().toUpperCase();
        }
        System.out.println("Thanks you for using our services, Come back soon!");
    }

}
