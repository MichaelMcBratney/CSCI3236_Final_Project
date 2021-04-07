import java.util.HashMap;
import java.util.Map;


    public class DFA {
        private static char currentState = 'a';
        private static Map<String,Character> map = new HashMap<String,Character>();

        public DFA(String filename){
            
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
        currentState = DFA(1);

        System.out.println("current state after the input: "+ currentState);

    }

    char getCurrentState(){
        return currentState;
    }

    //

    static void addToTheMap(char state, int input, char output){
        map.put(""+state+input,output);
    }
    public static char DFA(int input){
        return map.get(""+currentState+input);
    }
}
