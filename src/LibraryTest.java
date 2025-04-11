public class LibraryTest {
    public static void main(String[] args) {

        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski", 320);
        Book book2 = new Book("War and Peace", 1869, "Leo Tolstoy", 1225);
        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont", 189);
        Movie movie2 = new Movie("Toy Story", 1995, "John Lasseter", 81);

        LibraryMedia[] mediaArray = new LibraryMedia[4];
        mediaArray[0] = book1;
        mediaArray[1] = book2;
        mediaArray[2] = movie1;
        mediaArray[3] = movie2;

        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media : mediaArray) {
            media.displayInformation();
            System.out.println("--------------------");
        }

        System.out.println("\n===== BORROWING AND RETURNING =====");
        book1.borrow();
        book1.borrow();
        book1.returnMedia();

        System.out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book1.checkNumberOfPages();
        movie1.checkDuration();
        System.out.println("\n===== TYPE CASTING =====");
        for (LibraryMedia media : mediaArray) {
            if (media instanceof Book) {
                ((Book) media).checkNumberOfPages();
            } else if (media instanceof Movie) {
                ((Movie) media).checkDuration();
            }
        }
    }
}
