import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        LabStack<String> s = new LabStack<>();
        Scanner k = new Scanner(System.in);
        System.out.print("Enter an input> ");
        String input = k.nextLine();
        System.out.println("The stack is> ["+input+"]");


        String number = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                number += ch;
            } else {
                if (!number.isEmpty()) {
                    s.push(number);
                    number = "";
                }
                if (ch != ' ') {
                    s.push(String.valueOf(ch));
                }
            }
        }
        if (!number.isEmpty()) {
            s.push(number);
        }
        System.out.print("The stack After is> [");

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println("]");

    }
}
