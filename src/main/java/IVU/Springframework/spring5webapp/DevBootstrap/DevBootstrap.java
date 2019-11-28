package IVU.Springframework.spring5webapp.DevBootstrap;

import IVU.Springframework.spring5webapp.Library.Author;
import IVU.Springframework.spring5webapp.Library.Book;
import IVU.Springframework.spring5webapp.Library.Publisher;
import IVU.Springframework.spring5webapp.Library.Student;
import IVU.Springframework.spring5webapp.Repositores.AuthorRepository;
import IVU.Springframework.spring5webapp.Repositores.BookRepository;
import IVU.Springframework.spring5webapp.Repositores.PublisherRepository;
import IVU.Springframework.spring5webapp.Repositores.StudentRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;
    //private StudentRepository studentRepository;
    //private Object Student;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, StudentRepository studentRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
      //  this.studentRepository = studentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        //student
       // Student student=new Student();
        //student.setCoursename("RCSE");
        //student.setName("wasiq");
        //studentRepository.save(student);



        //publisher
        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisher.setAddress("12th Street, LA");
        publisherRepository.save(publisher);

        //
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
