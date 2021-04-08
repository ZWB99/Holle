package demo;
import demo.dao.user.Smbms_providerMapper;
import demo.entity.Smbms_provider;
import demo.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Test11 {

    @Test
    public  void  getUserListByUserName(){
        SqlSession sqlSession = null;
        List<Smbms_provider>users =new ArrayList<>();
        try {
            sqlSession =MyBatisUtil.createSqlSession();
            users =sqlSession.getMapper(Smbms_providerMapper.class).getUserListByUserName("张");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { ;
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        //新特性
        users.forEach((value) -> log.info("每行的内容：{}",value));
    }
}