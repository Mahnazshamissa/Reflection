package reflection02.exe02;

import reflection02.exe01.Letter;
import reflection02.exe01.PostOfficeAssistant;
import reflection02.exe01.PostOfficeApplication;

import java.util.ArrayList;
import java.util.List;


public class PostMann {

    // private List<Letter> letters= new ArrayList<>();
    // chon farz vojude liste letters hast dige khali va new nist.

    private List<Letter> letters;

    public PostMann(List<Letter> letters) {
        this.letters = letters;
    }

    public void deliver(){

        while (thereIsLetter()){

            deliverLetter();
        }


    }

    private boolean thereIsLetter() {
        return !letters.isEmpty();
    }

    private void deliverLetter() {

        Letter letter = letters.get(0);
        letters.remove(0);
        System.out.println("Letter delivered to: " + letter.getAddress());

    }
}

/*
Create the class Postman that has a list of Letter.
It has the deliver method that goes through all the letters he has and one by one,
 says that he delivered it to its address and
 removes it from his list (until there are no more letters left).
 */