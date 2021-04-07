package CSCI3236_Final_Project;

/**
 * CSCI3236_Final_Project
 */
public class CSCI3236_Final_Project {

    public static void main(String[] args) {
        DFA tst = new DFA("../test.txt");
        tst.printMap();
        System.out.println("Current State: "+tst.getCurrentState());
        tst.ChangeState(0);
        System.out.println("Current State: "+tst.getCurrentState());
        
    }
}