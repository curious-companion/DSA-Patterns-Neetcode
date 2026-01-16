import java.util.*;
public class Solution {
  Stack<Integer> s1;
  Stack<Integer> s2;

  public minStack() {
    s1 = new Stack<>();
    s2 = new Stack<>();
  }

  public void push(int value) {
    s1.push(value);
    if (s2.isEmpty() || value <= s2.peek()) {
      s2.push(value);
    }
  }

  public void pop() {
    if (s1.pop().equals(s2.peek()) {
      s2.pop();
    }
  }

  public int top() {
    return s1.peek();
  }

  public int getMin() {
    return s2.peek();
  }
}
