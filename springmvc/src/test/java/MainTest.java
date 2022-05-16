import com.generator.mapper.ArticleMapper;
import com.generator.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import util.model.UserModel;
import util.result.Result;

import javax.annotation.Resource;

/**
 * @Author WangBinRen
 * @Date 2022/5/7 22:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/applicationContext.xml"})
public class MainTest {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleService articleService;

    @Test
    public void a() {
        Result<?> result = articleService.onload(new UserModel("admin", "123"));
        System.out.println(result.getData());
    }
}
