package reflection02.exe01;

public class PostOfficeApplication {

    public static void main(String[] args) {

        Letter letter=new Letter("Vienna, 1210, Jedleseer Str. 79-83/1/14");

        PostOfficeAssistant assistant=new PostOfficeAssistant();

        assistant.stamp(letter);
        assistant.send(letter);




    }


    /*
    In the PostOfficeApplication class main method,
    create a Letter and a PostOfficeAssistant,
    and use it to stamp the letter and then send it.

     */

    /*

     */

}
