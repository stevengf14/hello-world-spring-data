package ec.com.learning.HelloWorld.dao;

import ec.com.learning.HelloWorld.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Steven
 */
public interface PersonDao extends CrudRepository<Person, Long>{
    
}
