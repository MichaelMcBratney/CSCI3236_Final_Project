import java.io.*;
import java.util.*;

class Project{

    public static void main(String[] args)throws FileNotFoundException 
    {
        DFA tst = new DFA(args[0]);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String x = input.nextLine();
        tst.runDFA(x);

        input.close();
    }
}
