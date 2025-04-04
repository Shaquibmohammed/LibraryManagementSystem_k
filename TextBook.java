package LabSession2;

public class TextBook extends Book{
    private String subject;
    private int edition;
    TextBook(String isbn,String title, String author, String subject,int edition){
        super(isbn, title, author);
        this.subject=subject;
        this.edition=edition;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("isbn " +getIsbn());
        System.out.println("title "+getTitle());
        System.out.println("author "+getAuthor());
        System.out.println("isAvailable "+ isAvailable());
        System.out.println("subject " +subject);
        System.out.println("edition "+edition);
    }
}
