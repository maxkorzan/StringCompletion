import java.util.Scanner;

public class PetQuestions
{
    public static void main( String[] args )
    {
        //declare vars
        String name;
        String breed;
        int age;

        Scanner keyboard = new Scanner(System.in);

        //prompt user for values
        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();

        //display values
        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
