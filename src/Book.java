public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        // implement
        this.title=title;
        this.author=author;
        this.year=year;
        this.isAvailable=true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title=other.title;
        this.author=other.author;
        this.year=other.year;
        this.isAvailable=other.isAvailable;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        if (isAvailable){
            isAvailable=false;
            System.out.println("Книга:"+title+"успешно взято.");
        }
        else{
            System.out.println("Книга:"+title+"не доступен.");
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        if (!isAvailable){
            isAvailable=true;
            System.out.println("Книга:"+title+"вернули.");
        }
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Название:"+title+"Автор:"+author;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book other &&
                this.year== other.year &&
                this.title.equals(other.title) &&
                this.author.equals(other.author);
    }
}
