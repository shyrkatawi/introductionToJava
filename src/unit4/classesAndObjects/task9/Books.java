package unit4.classesAndObjects.task9;

public class Books {
    private Book[] books;

    public Books(Book[] books) {
        this.books = books;
    }

    public void showBooksByWriter(String writer) {
        for (Book book : books) {
            String[] writers = book.getWriters();
            for (String s : writers) {
                if (s.equals(writer)) {
                    System.out.println(book);
                    break;
                }
            }
        }
        System.out.println();
    }

    public void showBooksByPublisher(String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
        System.out.println();
    }

    public void showBooksReleasedAfterSpecifiedYear(int year) {
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
        System.out.println();
    }
}
