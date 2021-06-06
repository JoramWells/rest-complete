package restapi.example.rest.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
