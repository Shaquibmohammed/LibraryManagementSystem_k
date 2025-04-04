package LabSession2;

public class NovelBook extends Book{
    private String genre;
    NovelBook(String isbn,String author,String title,String genre){
        super(isbn,author,title);
        this.genre=genre;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("genre " + genre);
    }
}
