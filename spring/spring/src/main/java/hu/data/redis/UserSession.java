package hu.data.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * @author hucc
 * 2022/4/22 22:03
 */
@RedisHash("Session")
public class UserSession {

    @Id
    private String name;

    public UserSession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "name='" + name + '\'' +
                '}';
    }
}
