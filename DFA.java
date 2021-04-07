import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

    public class DFA {
        private static char currentState = 'a';
        private static Map<String,Character> map = new HashMap<String,Character>();

        public DFA(String filename){
            String alphabet;
            String states;
            String startState;
            String acceptState;


            String cleanedInput = cleanInput(alphabet);
        }
        String cleanInput(String input){

        }
    public static void main(String[] args) {
        
        System.out.println("current state before the input: "+currentState);
        //transition table
        addToTheMap('a', 0, 'a');
        addToTheMap('a', 1, 'b');
        addToTheMap('b', 0, 'c');
        addToTheMap('b', 1, 'b');
        addToTheMap('c', 0, 'a');
        addToTheMap('c', 1, 'c');
        //starting state

        currentState = 'a';

        //test
        System.out.println(map.toString());
        currentState = ChangeState(1);

        System.out.println("current state after the input: "+ currentState);

    }

    char getCurrentState(){
        return currentState;
    }

    //

    static void addToTheMap(char state, int input, char output){
        map.put(""+state+input,output);
    }
    public static char ChangeState(int input){
        int n =0;
        return map.get(""+currentState+input);
    }

    
}
