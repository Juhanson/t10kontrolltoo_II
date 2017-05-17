package genes;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface GeneDAO extends CrudRepository<Database, String> {

}