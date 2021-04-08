import java.io.File;

/**
 * CSCI3236_Final_Project
 */
public class CSCI3236_Final_Project {

    public static void main(String[] args) {
        DFA tst = new DFA("DFA-Test.txt");
        tst.runDFA(args[0]);
        
    }
}