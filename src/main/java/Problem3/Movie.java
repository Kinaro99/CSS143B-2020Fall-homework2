package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating =  rating;
        this. title =  title;
    }

    public Movie(Movie anotherMovie) {
        this.id = anotherMovie.id;
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
    }

    @Override // https://www.baeldung.com/java-equals-hashcode-contracts and https://www.javatpoint.com/java-string-equals
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie anotherMovie = (Movie)obj;
        boolean idEquals
                = (this.id == null && anotherMovie.id == null) || (this.id != null && this.id.equals(anotherMovie.id));
        return this.title == anotherMovie.title && idEquals;
    }
}
