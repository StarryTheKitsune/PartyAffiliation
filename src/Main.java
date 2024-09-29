import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String party = "";

        System.out.println("Input your political party [R, D, I]");
        Scanner sc = new Scanner(System.in);
        party = sc.nextLine();

        if (party.equals("R")){
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("D")){
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("I")){
            System.out.println("You get an Independent Person.");
        }
        else {
            System.out.println("This program does not know the party " + party + ". Please input only R, D, or I" );
        }

    }
}