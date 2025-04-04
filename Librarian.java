package LabSession2;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends User{
    ArrayList<Book> book;
    Scanner sc=new Scanner(System.in);

    private String employeeNumber;
    public  Librarian(){
        book=new ArrayList<>();
    }
    @Override
    public void displayDashboard() {
    }

    @Override                                                      z
    public boolean canBorrowBooks() {
        return true;
    }
    public void addNewBook(Book books){
        book.add(books);
    }
    public void removeBook(int id){
        for (Book books:book){
            if(books.id==id){
                book.remove(books);
            }
        }
    }
}
