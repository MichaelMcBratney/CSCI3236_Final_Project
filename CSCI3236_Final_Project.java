import java.io.File;

/**
 * CSCI3236_Final_Project
 */
public class CSCI3236_Final_Project {

    public static void main(String[] args) {
        DFA tst = new DFA("DFA-Test.txt");
        for (int i = 0; i < args.length; i++){
            System.out.println("String number " + (i+1) + " test: ");
            tst.runDFA(args[i]);
            System.out.println();
            System.out.println();
        }

        
    }
}