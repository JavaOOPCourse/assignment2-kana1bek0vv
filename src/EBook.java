public class EBook extends Book {

    private double fileSize;

    // TODO: Implement constructor using super()
    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        // implement
        this.fileSize=fileSize;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Электронная книга:"+"Название"+getTitle()+"Автор"+getAuthor()+"Год"+getYear()+"Размер"+fileSize;
    }
}