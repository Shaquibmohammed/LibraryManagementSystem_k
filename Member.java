package LabSession2;

public class Member extends User{
    User user;
    private int borrowedBooksCount;
    private final int MAX_BORROW_lIMIT=5;
    Member(){
        super();
        borrowedBooksCount=0;
    }
    Member(String name,String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount=0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: "+ getName());
        System.out.println("Number of books borrowed"+ borrowedBooksCount);
        //System.out.println(user.getContactInfo());
    }

    @Override
    public boolean canBorrowBooks() {
        /*if(borrowedBooksCount<MAX_BORROW_lIMIT){
            return true;
        }
        return false;*/
        return borrowedBooksCount<MAX_BORROW_lIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }

}
