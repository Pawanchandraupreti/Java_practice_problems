package Ques_31_to_40;

//Basic Class and Object

class Book {
    String title;
    String author;
    int pages;
    
    void displayInfo() {
        System.out.println(title + " by " + author + ", " + pages + " pages");
    }
}

public class ques36 {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.title = "Java Basics";
        myBook.author = "John Doe";
        myBook.pages = 200;
        myBook.displayInfo();
    }
}
