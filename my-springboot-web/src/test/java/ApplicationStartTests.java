import com.xm.springboot.domain.Demo;
import com.xm.springboot.mapper.DemoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: caoxingming
 * date: 2018/3/28
 * time: 16:03
 * To change this template use File | Settings | Editor | File and Code Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class ApplicationStartTests {
    @Autowired
    private DemoMapper demoMapper;

    @Test
    @Rollback
    public void selectOne() throws Exception {
        Demo demo = new Demo();
        demo.setName("xuanxuan");
        demoMapper.insert(demo);
        Demo u = demoMapper.selectOne(demo);
        Assert.assertEquals("xuanxuan", u.getName());
    }
}
