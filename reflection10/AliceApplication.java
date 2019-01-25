package reflection10;

public class AliceApplication {
    public static void main(String[] args) {
        AliceExplorer aliceExplorer = new AliceExplorer();

        System.out.println("Number of words: " + aliceExplorer.getNumberOfWords());
        System.out.println("Number of distinct words: " + aliceExplorer.getNumberOfDistinctWords());
        System.out.println("Longest words: " + aliceExplorer.getLongestWords());
        System.out.println("Most appearing 5 words:\n" );
        aliceExplorer.getMostAppearing5Words().forEach(System.out::println);
        System.out.println("Most appearing 5 letters:\n" );
        aliceExplorer.getMostAppearing5Letters().forEach(System.out::println);
        System.out.println("Alice appearances: " + aliceExplorer.getNumberOfAlice());
    }
}
