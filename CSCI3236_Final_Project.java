import java.io.*;
import java.util.*;

class CSCI3236_Final_Project{

    public static void main(String[] args)throws FileNotFoundException 
    {
        DFA tst = new DFA(args[0]);
        Scanner input = new Scanner(System.in);
        String x;

        System.out.print("Enter String: ");
        x = input.nextLine();
        do {
            tst.runDFA(x);
            System.out.print("\nEnter String (type exit when finished): ");
            x = input.nextLine();
        } while (!x.trim().equals("exit"));

        input.close();
    }
}
