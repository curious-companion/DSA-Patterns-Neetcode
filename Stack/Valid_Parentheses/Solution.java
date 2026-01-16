import java.util.*;
public class Solution {
  public static boolean isValid(String s) {
    Stack<Character> s1 = new Stack<>();
    for(int i = 0; i<s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '{' || ch == '[' || ch == '(') {
        s1.push(ch);
      }else {
        if (s1.isEmpty()) {
          return false;
        } else {
          char top = s1.peek();
          if (top == '[' && ch == ']' ||
              top == '{' && ch == '}' ||
              top == '(' && ch == ')') {
                return false;
              }
        }
      }
    }
    return s1.isEmpty();
  }
}
