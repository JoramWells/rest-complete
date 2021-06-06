package restapi.example.rest.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

//    Get all books from a db
    @GetMapping("/books")
    public List<Book> getBooks(){
        return  bookService.getBooks();
    }
    
//    Get a book
    @GetMapping("/book/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return bookService.getBook(id);
    }

//    Get book by name
    @GetMapping("/bookName/{book}")
    public Optional<Book> getBookByName(@PathVariable String book ){
        return bookService.getBookByName(book);

    }

//    Add book
    @PostMapping("/addBook")
    public void addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);

    }

//    Delete a book
    @DeleteMapping("/delete/book/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
    }
}
