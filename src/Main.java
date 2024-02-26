public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Harper", "", "Lee");
        //проверю корректность ФИО через консоь   System.out.println(author1);
        Author author2 = new Author("Jerome", "David", "Salinger");
        //проверю корректность ФИО через консоь  System.out.println(author2);

        Book book1 = new Book("To Kill a Mockingbird", author1, 1989);
        System.out.println(book1);
        // можно распечатать отдельный параметр через get...>> System.out.println(book1.getYearOfPublication());
        // изменим год публикации
        book1.setYearOfPublication(2023);
        System.out.println("В библиотеке имеется таже книга, " + book1.getYearOfPublication() + " года издания.");
        System.out.println();

        Book book2 = new Book("The catcher in the rye", author2, 2011);
        System.out.println(book2);
    }
}