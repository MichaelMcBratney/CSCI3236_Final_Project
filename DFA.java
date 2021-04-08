import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


    public class DFA {
        private  char currentState = ' ';
        private  Map<String,Character> map = new HashMap<String,Character>();
        private String alphabet;
        private String states;
        private char start;
        private String accept;

        public DFA(String filename){
            //System.out.println(filename);
            try{
            Scanner input = new Scanner(new File(filename));
            alphabet = input.nextLine().replaceAll("\\W+","");
            states = input.nextLine().replaceAll("\\W+","");
            start = input.nextLine().replaceAll("\\W+","").charAt(0);
            accept = input.nextLine().replaceAll("\\W+","");
            //System.out.println(accept);
            String tmp;
            currentState = start;
            while (input.hasNext()) {
                tmp = input.nextLine();
                tmp = tmp.replaceAll("\\W+","");
                //System.out.println(tmp);
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

    public char changeState(int input){
        char tmp = currentState;
        currentState = map.get(""+currentState+input);
        return map.get(""+tmp+input);
    }

    public boolean runDFA(String inputString){
            for (int i = 0;i < inputString.length(); i++){
                if (alphabet.indexOf(inputString.charAt(i)) != -1){
                    System.out.println("Current state is " + currentState);

                    int currInput = inputString.charAt(i)-'0';
                    System.out.println("Input is " + currInput);
                    changeState(currInput);
                }
            }

            if (accept.indexOf(currentState) != -1) {
                        System.out.println(currentState + " is an accept state. The string is accepted!");
                        currentState = start;
                        return true;
                    }

            System.out.println("Current state is " + currentState);
            System.out.println("The string is not accepted.");
            currentState = start;
            return false;
        }

    public void printMap(){
        System.out.println(map.toString());
    }
    
}

