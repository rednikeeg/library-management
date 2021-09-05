package entities;

public class Book {
    private int id;
    private String name;
    private int quantity;
    private String isbn;
    private String type;

    public Book(){

    }

    public Book(String name, int quantity, String isbn, String type){
        this.name = name;
        this.quantity = quantity;
        this.isbn = isbn;
        this.type = type;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setType(){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
