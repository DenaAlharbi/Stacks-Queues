import java.util.Scanner;

public class PostfixEvaluator {
    public static void main(String[] args) {

        LabStack<String> s = new LabStack<>();
        Scanner k = new Scanner(System.in);
        //
        System.out.print("Enter a mathematical expression> ");
        String input = k.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (Character.isDigit(ch)) {
                int number = 0;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    number = number * 10 + (input.charAt(i) - '0');
                    i++;
                }i--; 
                s.push(String.valueOf(number));
                System.out.println("The stack after pushing "+number+" :" + s);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String oper = " ";

                int oppp = Integer.parseInt(s.pop());
                int oppp0 = Integer.parseInt(s.pop());
                int result = 0;
                if (String.valueOf(ch).equals("+")) {
                    result = oppp0 + oppp;
                    oper = "Addition";
                } else if (String.valueOf(ch).equals("-")){
                    result = oppp0 - oppp;
                    oper = "Subtraction";
                }else if (String.valueOf(ch).equals("*")){
                    result = oppp0 * oppp;
                    oper = "Multiplication";
                }else if (String.valueOf(ch).equals("/")){
                    result = oppp0 / oppp;
                    oper = "Division";
                }



                s.push(String.valueOf((result)));
                System.out.println("The stack after "+oper+" :" + s);
            }
        }

        System.out.println("The final result: " + s.pop());
    }
}

