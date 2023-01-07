package Exercise2_2;

public class TestMain {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Tech", "ahtech@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        System.out.println("Author's name are: " + javaDummy.getAuthorNames());
    }
}
