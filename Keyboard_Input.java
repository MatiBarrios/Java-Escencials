import java.util.Scanner;
public class Keyboard_Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Keyboard Input");
        String word=sc.next();
        sc.close();
        System.out.println(word);
    }
}