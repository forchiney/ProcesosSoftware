package Services;

import java.util.List;

/**
 *
 * @author User
 */
public interface Idao {

    public interface IDao<T> {

        public void insert(T data);

        public void delete(T data);

        public void update(T data);

        public List<T> getAll();

    }
}
