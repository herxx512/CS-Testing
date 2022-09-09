import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DataStructures {

    // Project Part 2:
    // Step 1:
    public static boolean parentheses(String x){
        int closed = 0;
        int opened = 0;

        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == '('){
                opened++;
            } else if (x.charAt(i) == ')') {
                closed++;
            }
        }

        return opened == closed;
    }

    // Step 2:
    public static boolean brackets(String x){
        int closed = 0;
        int opened = 0;
        Character[] open = {'(','[','{','<'};
        Character[] close = {')',']','}','>'};

        for (int i = 0; i < x.length(); i++){
            if (Arrays.asList(open).contains(x.charAt(i))){
                opened++;
            } else if (Arrays.asList(close).contains(x.charAt(i))) {
                closed++;
            }
        }
        return opened == closed;
    }

    // Frodo Solution for Step 2:
    public static boolean balancedBrackets(String s) {

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i += 1) {

            // If character is opening bracket
            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            // Else, if character is closing bracket
            else if (bracketPairs.containsKey(s.charAt(i))) {
                // Closing bracket without matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                // Check that most recent bracket on stack matches
                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Step 3: My stack implementation would look like the below
    public static boolean stackBrackets(String x){
        Stack<Character> openStack = new Stack<>();
        Stack<Character> closeStack = new Stack<>();

        Character[] open = {'(','[','{','<'};
        Character[] close = {')',']','}','>'};

        for (int i = 0; i < x.length(); i++){
            if (Arrays.asList(open).contains(x.charAt(i))){
                openStack.push(x.charAt(i));
            } else if (Arrays.asList(close).contains(x.charAt(i))) {
                closeStack.push(x.charAt(i));
            }
        }
        return openStack.size() == closeStack.size();
    }

    // Step 4:
/*
-I believe the runtime complexity of each solution is O(n). It is O(n) because each solution loop through a string once (in other words 1 for-loop) and the methods used have a time complexity of O(1).
-The runtime complexity of each solution provided is O(n).
-The solutions compare to mine are similar. The difference is that I used different methods and variables to contain the number of closed/opened brackets. Using the variables, I compare their sizes/length/value to return a boolean. I think I can improve my solutions by decreasing my code, like decrease the amount of variables that is used and take a different approach to return a boolean.
-If in step 3 we were to use Queue instead of Stack, I think my solution still take the same approach by using the push() and size() method to return a boolean.
 */
}
