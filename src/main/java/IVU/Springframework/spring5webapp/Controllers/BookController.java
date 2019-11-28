package IVU.Springframework.spring5webapp.Controllers;


import IVU.Springframework.spring5webapp.Repositores.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/Books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());
    return "books";
    }
}
