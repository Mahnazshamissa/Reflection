package week5Exersices.reflection5;

public class TVTableApplication {

    public static void main(String[] args) {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = tvTableBuilder.build();
        System.out.println(tvTable);
    }
}
