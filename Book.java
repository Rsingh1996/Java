// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Book English = new Book();
        English.setTitle("Learn English");
        System.out.println("Book Title : " + English.getTitle());
        English.setAuthor("Nageshwara Rao");
        System.out.println("Book Author : " + English.getAuthor());
        English.setPrice(699.9f);
        System.out.println("Book Price : " + English.getPrice());
    }

}

class Book {
    String title;
    String author;
    Float price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }
}
