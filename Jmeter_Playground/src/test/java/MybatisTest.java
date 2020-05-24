import com.Kotori.domain.Student;
import com.Kotori.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;

public class MybatisTest {
    /***
     *
     */
    @Test
    public void testMyBatis1 () throws IOException {
        // 读取xml文件
        String resource = new String("mybatis-config.xml");
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 解析xml并创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 通过创建的工厂获取连接
        SqlSession sqlSession = sessionFactory.openSession();

        // 通过获取的连接执行sql
        Student student = sqlSession.selectOne("com.Kotori.mapper.StudentMapper.selectByPrimaryKey",1L);

        System.out.println(student);
    }


    @Test
    public void testMyBatis2 () throws IOException {
        // 读取xml文件
        String resource = new String("mybatis-config.xml");
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 解析xml并创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 通过创建的工厂获取连接
        SqlSession sqlSession = sessionFactory.openSession();

        // 通过连接获取mapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        // 通过mapper查询数据库
        Student student = studentMapper.selectByPrimaryKey(1L);

        System.out.println(student);
    }


}
