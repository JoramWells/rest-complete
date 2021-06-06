package restapi.example.rest.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    Get all books from a collection
    public List<Book>getBooks(){
        return  bookRepository.findAll();
    }

//    Add a book
    public void addNewBook(Book book) {
        bookRepository.save(book);

    }
}
