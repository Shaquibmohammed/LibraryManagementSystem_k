package LabSession2;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    public static int TotalUsers=0;
    public User(){
        userId=generateUniqueId();
    }
    public User(String name,String contactInfo){
        userId=generateUniqueId();
        this.name=name;
        this.contactInfo=contactInfo;
    }
    public User(User other){
        this.userId=generateUniqueId();
        this.name=other.name;
        this.contactInfo=other.contactInfo;
    }
    public final String generateUniqueId(){
        TotalUsers++;
        return "User Id -" + TotalUsers;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
