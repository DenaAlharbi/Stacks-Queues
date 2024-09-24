import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        LabStack<Character> s = new LabStack<>();
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a mathematical expression> ");
        String input = k.nextLine();

        boolean Balanced = true;
        for (char charInArray : input.toCharArray()) {
            if (charInArray == '(' || charInArray == '{' || charInArray == '[') {
                s.push(charInArray);
            } else if (charInArray == ')' || charInArray == '}' || charInArray == ']') {
                if (s.isEmpty()) {
                    Balanced = false;
                    break;
                }
                char last = s.pop();
                if ((charInArray == ')' && last != '(') || (charInArray == '}' && last != '{') || (charInArray == ']' && last != '[')) {
                    Balanced = false;
                    break;
                }
            }
        }

        if (!s.isEmpty()) {
            Balanced = false;
        }
        if (Balanced) {
            System.out.println("Balanced.");
        } else {
            System.out.println("Not Balanced.");
        }
    }
}
