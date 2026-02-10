public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        // implement
        if (count< books.length){
            books[count]=book;
            count++;
            System.out.println("Книга успешно добавлена.");
        }
        else {
            System.out.println("Мест нет");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        // implement
        if (count==0){
            System.out.println("Нет книг");
            return;
        }
        for (int i=0;i<count;i++){
            System.out.println((i+1)+". "+ books[i] );
        }


    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i=0; i<count;i++){
            if (books[i].getTitle().equalsIgnoreCase(title)){
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        // implement
        Book book=searchByTitle(title);
        if (book!=null){
            book.borrowBook();
        }
        else {
            System.out.println("нет книг");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
        Book book=searchByTitle(title);
        if (book!=null){
            book.borrowBook();
        }
        else{
            System.out.println("Книг 0");
        }
    }
}
