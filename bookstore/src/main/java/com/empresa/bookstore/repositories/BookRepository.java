package com.empresa.bookstore.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.empresa.bookstore.models.Book;

@Repository
public class BookRepository {
    private List<Book> BOOKS = new ArrayList<>();
    private Long currentId = 11L;

    public BookRepository() {
        BOOKS.add(new Book(1L, "Hora de aventura", "Finn", LocalDate.of(2020, 12, 10)));
        BOOKS.add(new Book(2L, "El principito", "Antoine de Saint-Exupéry", LocalDate.of(1943, 4, 6)));
        BOOKS.add(new Book(3L, "Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, 5, 30)));
        BOOKS.add(new Book(4L, "El señor de los anillos", "J.R.R. Tolkien", LocalDate.of(1954, 7, 29)));
        BOOKS.add(new Book(5L, "Harry Potter y la piedra filosofal", "J.K. Rowling", LocalDate.of(1997, 6, 26)));
        BOOKS.add(new Book(6L, "El código Da Vinci", "Dan Brown", LocalDate.of(2003, 3, 18)));
        BOOKS.add(new Book(7L, "Orgullo y prejuicio", "Jane Austen", LocalDate.of(1813, 1, 28)));
        BOOKS.add(new Book(8L, "1984", "George Orwell", LocalDate.of(1949, 6, 8)));
        BOOKS.add(new Book(9L, "La sombra del viento", "Carlos Ruiz Zafón", LocalDate.of(2001, 4, 15)));
        BOOKS.add(new Book(10L, "El alquimista", "Paulo Coelho", LocalDate.of(1988, 1, 1)));
    }

    // CREATE
    public Book save(Book book) {
        book.setId(currentId++);
        BOOKS.add(book);
        return book;
    }

    // READ
    public List<Book> findAll() {
        return BOOKS;
    }

    public Optional<Book> findById(Long id) {
        for (Book book : BOOKS) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    // UPDATE
    public Book update(Book book) {
        for (int i = 0; i < BOOKS.size(); i++) {
            if (BOOKS.get(i).getId() == book.getId()) {
                BOOKS.set(i, book);
                return book;
            }
        }
        return null;
    }

    // DELETE
    public boolean deleteById(Long id) {
        for (int i = 0; i < BOOKS.size(); i++) {
            if (BOOKS.get(i).getId() == id) {
                BOOKS.remove(i);
                return true;
            }
        }
        return false;
    }

    public void deleteAll() {
        BOOKS.clear();
    }
}