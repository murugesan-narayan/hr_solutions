package thirtydays;

public class MyBook extends Book{
    private final int price;
    MyBook(String $title,String $author,int $price){
        super($title, $author);
        this.price=$price;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);

    }

    public static void main(String[] args) {
        MyBook myBook = new MyBook("title", "author", 5);
        myBook.display();
    }
}
class Book{
    String title;
    String author;
    /**
     * @param $title title
     * @param $author author
     */
    public Book(String $title, String $author) {
        this.author=$author;
        this.title=$title;
    }

}