package cn.hu;


import cn.hu.dao.UserMapper;
import cn.hu.entity.User;
import cn.hu.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author hucc
 * 2022/4/30 16:19
 */
public class Application {

    public static void main(String[] args)  {
        SqlSessionFactory factory = MyBatisUtils.getSqlSessionFactory();

        try (SqlSession sqlSession = factory.openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.selectUser("admin");
            System.out.println(user.getPassword());
        }
    }

}
