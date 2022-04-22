package hu.data.redis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hucc
 * 2022/4/22 22:04
 */
@Repository
public interface UserSessionRepository extends CrudRepository<UserSession, String> {
}
