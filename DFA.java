package CSCI3236_Final_Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


    public class DFA {
        private  char currentState = 'a';
        private  Map<String,Character> map = new HashMap<String,Character>();

        public DFA(String filename){
            try{
            Scanner input = new Scanner(new File("test.txt"));
            String alphabet = input.nextLine();
            String states = input.nextLine();
            String start = input.nextLine();
            String accept = input.nextLine();
            String tmp;
            while (input.hasNext()) {
                tmp = input.nextLine();
                tmp = tmp.replaceAll("\\W+","");
                System.out.println(tmp);
                addToTheMap((char)tmp.charAt(0), tmp.charAt(1)-'0', tmp.charAt(2));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    char getCurrentState(){
        return currentState;
    }
     void addToTheMap(char state, int input, char output){
        map.put(""+state+input,output);
    }
    public char ChangeState(int input){
        char tmp = currentState;
        currentState = map.get(""+currentState+input);
        return map.get(""+tmp+input);
    }
    public void printMap(){
        System.out.println(map.toString());
    }
    
}
