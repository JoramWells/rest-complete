package restapi.example.rest.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
//    Get a book by id
    public Optional<Book> getBook(int id) {
        return bookRepository.findById(id);
    }

//    Get a book by name

    public Optional<Book> getBookByName(String book) {
         Optional<Book> bookF = bookRepository.findBookByName(book);
         System.out.println(bookF);
        return bookRepository.findBookByName(book);
    }

    //    Delete a book
    public void deleteBook(int id) {
        boolean exists = bookRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(
                    "Book with " + id + " does not exist"
            );
        }
        bookRepository.deleteById(id);
    }


}
