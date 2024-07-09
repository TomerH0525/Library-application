package com.tomer2h.LibraryApplication.EntityBeans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    private long id;
    private String authorName;
    @OneToMany
    private Set<Book> authorBooks;
    private int authorAge;

    public Author(long id, String authorName, Set<Book> authorBooks, int authorAge) {
        this.id = id;
        this.authorName = authorName;
        this.authorBooks = authorBooks;
        this.authorAge = authorAge;
    }

    private Author() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Set<Book> getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(Set<Book> authorBooks) {
        this.authorBooks = authorBooks;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getId() == author.getId() && Objects.equals(getAuthorName(), author.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAuthorName());
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", authorBooks=" + authorBooks.size() +
                ", authorAge=" + authorAge +
                '}';
    }
}
