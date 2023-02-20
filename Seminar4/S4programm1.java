import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class S4programm1 {
    public static void main(String[] args) {
        ex1();
        
    }
    private static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        
        
        
        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();
            wordsList.add(inputString);
            

            if (inputString.equals("print")) {
                wordsList.removeLast();
                Iterator<String> iter = wordsList.descendingIterator();
                while (iter.hasNext()) {
                    System.out.println(iter.next());
                }
            }

            if (inputString.equals("revert")) {
                wordsList.removeLast();
                System.out.println(wordsList);
            }

            if (inputString.equals("exit")) {
                wordsList.removeLast();
                break;
            }
            
        }
        

    }
}
