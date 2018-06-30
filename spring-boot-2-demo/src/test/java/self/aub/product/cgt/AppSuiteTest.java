package self.aub.product.cgt;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 单元测试入口<br/>
 * 按照指定业务顺序执行相关单元测试用例
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        //A业务
        DemoAaaUT.class,
        //B业务
        DemoBbbUT.class

})
public class AppSuiteTest {
}
