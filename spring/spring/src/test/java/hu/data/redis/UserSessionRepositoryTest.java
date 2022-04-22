package hu.data.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hucc
 * 2022/4/22 22:22
 */
@SpringBootTest
public class UserSessionRepositoryTest {

    @Autowired
    private UserSessionRepository userSessionRepository;

    @Test
    public void test() {
        UserSession userSession = new UserSession("Milo");
        UserSession saved = userSessionRepository.save(userSession);
        System.out.println(saved);
    }

}