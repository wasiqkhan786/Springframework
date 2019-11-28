package IVU.Springframework.spring5webapp.Repositores;

import IVU.Springframework.spring5webapp.Library.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
