class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // [()]
        // -> true
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                        return false;
                }
                char top = stack.pop();
                // ((])
                // c = ]; top = (
                // ((true && true) && (false && false)) = true || false = true
                if ((c == ']' && top != '[') || 
                    (c == ')' && top != '(') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
                
            }
        }

    return stack.isEmpty();
    }
}

// for bracket in string:
//      stack.push(bracket)

//      stack.pop()
//  

//  [(){}] -> true
// [(({)
// Stack:  [ ( ( { 

// current element      last element in stack
//      )                   (
//      ]                   [
//      }                   {

//      ]                   ![
