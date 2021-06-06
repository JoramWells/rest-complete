package restapi.example.rest.books;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book>getBooks(){
        return  bookRepository.findAll();
    }
}
