package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("Ottessa Moshfegh", "my year of rest and relaxation"));
        mediatheque.addItem( new Book("Fyodor Dostoevsky", "crime and punishment"));
        mediatheque.addItem( new CD(5, "people watching"));
        mediatheque.printCatalog();
        //mediatheque.printOnlyBooks();
        //mediatheque.printOnlyCDs();
    }
}
