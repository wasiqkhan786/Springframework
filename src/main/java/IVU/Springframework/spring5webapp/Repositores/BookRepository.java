package IVU.Springframework.spring5webapp.Repositores;

import IVU.Springframework.spring5webapp.Library.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
