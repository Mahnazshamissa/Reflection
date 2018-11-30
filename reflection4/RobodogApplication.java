package week4Exercises.reflection4;

import week4Exercises.exe09.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        readDocument(fileReader);


    }

    private static void readDocument(FileReader fileReader) {
        List<String> lines = fileReader.asLines("week4Exercises/reflection4/robodog.txt");
        Set<String> words =  new HashSet<>();

        for (String line : lines) {

            //String decrypted = fileReader.removeExclamationMarks();
            String instructions= line.replaceAll("!","");
            words.add(instructions);
        }

        System.out.println("The number of uniqe instructions are:"+ words.size());
        System.out.println(words);

    }

    //private List<String> removeExclamationMarks(FileReader fileReader) {
        //fileReader=fileReader.replaceAll("!","");
      //  return fileReader;
   // }
}


/*
In the main method of the RobodogApplication,
read the robodog.txt file,
decrypt its lines into instructions,
figure out the unique instructions,
display how many there are and which ones are there.
Hints:
Every line in robodog.txt is one instruction
polluted with many unnecessary exclamation marks.
Lists, Sets and replaceAll will be very useful.
Keep it simple stupid. Don’t overdo things,
just stick to what the exercise asks for.

 */