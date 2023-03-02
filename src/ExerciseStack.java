import java.util.Scanner;
import java.util.Stack;

public class ExerciseStack {
    Stack <String> nameUsers = new Stack<String>();
    Scanner input = new Scanner(System.in);
    protected String name;
    protected String password;

    protected String addUp;

    public String createUser(String name, String pass){
        this.name = name;
        this.password = pass;
        System.out.println("Do you want to create a new user? ");
        String resp = input.next().toUpperCase();
        if(resp.equals("YES")){
            System.out.println("Write your name user: " + name);
            this.name = name;
            System.out.println("Write your password: " + pass);
            this.password = pass;
            System.out.println("Do you want to connect now? ");
            String respConnect = input.next().toUpperCase();
            if(respConnect.equals("YES")){
                addUp = nameUsers.push(name);
                System.out.println("User connect: " + addUp);
            }   else{
                System.out.println("You're disconnected.");
            }
        }   else{
            System.out.println("You're rejecting this action.");
        }

        return addUp;
    }

    public String userConnect(String name){
        if(nameUsers.contains(name)){
            return nameUsers.push(name);
        }   else {
            return createUser(name, password);
        }

    }

    public String userDisconnect(){
        return nameUsers.pop();
    }

    public static void main(String[] args) {
        System.out.println("This app% is simulate a Chat.");
        ExerciseStack stack1 = new ExerciseStack();
        stack1.createUser("Brian","324Acv");
        stack1.createUser("Steven","BH123");
        stack1.createUser("Angela","324Acv");
        stack1.createUser("Javier","3Lk90");
        stack1.createUser("Enrique","324Acv");
        stack1.createUser("Camila","MLP1972");
        stack1.createUser("Luciana","90NK78");

        System.out.println(stack1);

        stack1.userDisconnect();
        stack1.userDisconnect();
    }
}
