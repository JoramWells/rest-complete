package restapi.example.rest.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
