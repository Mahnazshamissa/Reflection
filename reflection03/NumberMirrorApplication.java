package reflection03;

import java.util.List;
import java.util.Scanner;

public class NumberMirrorApplication {

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        NumberMirror numberMirror= new NumberMirror();
        List<Integer> mirrorNumber= numberMirror.mirrorNumber(number);

        System.out.println("The mirror number is : "+ mirrorNumber);


    }


}
