package IVU.Springframework.spring5webapp.Repositores;

import IVU.Springframework.spring5webapp.Library.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long>{
}
