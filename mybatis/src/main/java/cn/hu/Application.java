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
            User user = userMapper.selectUser(1);
            printUser(user);

//            user = new User("foo", "bar");
//            int res = userMapper.insertUser(user);
//            System.out.println("insert result: " + res);
//            sqlSession.commit();
//            user = userMapper.selectUser(3);
//            printUser(user);

            user = userMapper.selectUser(3);
            user.setPassword("bar001");
            int res = userMapper.updateUser(user);
            System.out.println("update result: " + res);
            sqlSession.commit();
            user = userMapper.selectUser(3);
            printUser(user);


            user = userMapper.selectUser(4);
            res = userMapper.deleteUser(user);
            System.out.println("delete result: " + res);
            sqlSession.commit();
        }
    }

    private static void printUser(User user) {
        if (null == user) {
            System.out.println("user is null.");
        } else {
            System.out.println(user);
        }
    }

}
