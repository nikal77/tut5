public class Book extends LibraryMedia {
    private String author;
    private int numberOfPages;
    public Book(String title, int publicationYear, String author, int numberOfPages) {
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + numberOfPages);
    }
    public void checkNumberOfPages() {
        if (numberOfPages > 500) {
            System.out.println("This is a long book with " + numberOfPages + " pages.");
        } else {
            System.out.println("This is a standard book with " + numberOfPages + " pages.");
        }
    }
}
