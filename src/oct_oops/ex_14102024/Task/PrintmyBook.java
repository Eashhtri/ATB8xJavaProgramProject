package oct_oops.ex_14102024.Task;

public class PrintmyBook extends Book {

    @Override
    void getDetails() {
        System.out.println(name + " " + author + " " + price);
    }

    public PrintmyBook(String name, String author, int price){

        this.name = name;
        this.author = author;
        this.price = price;
    }

}

