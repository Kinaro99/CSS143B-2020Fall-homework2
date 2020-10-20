package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    @Override // https://www.baeldung.com/java-equals-hashcode-contracts and https://www.javatpoint.com/java-string-equals
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book anotherBook = (Book)obj;
        //boolean titleEquals = (this.title == null && other.title == null) || (this.title != null && this.title.equals(other.title));
        //boolean authorEquals = (this.author == null && other.author == null) || (this.author != null && this.author.equals(other.author));
        // books that have the same ID have have the same author and title so the top 2 wouldn't be needed(?).

        boolean idEquals
                = (this.id == null && anotherBook.id == null) || (this.id != null && this.id.equals(anotherBook.id));
            return this.title == anotherBook.title && idEquals;
    }



}
