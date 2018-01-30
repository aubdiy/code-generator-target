package self.aub.product.cgt;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoAaaUT {


    @Test
    public void t001Biz1() {
        Assert.assertTrue(true);
    }

    @Test
    public void t002Biz2() {
        Assert.assertTrue(true);
    }

    @Test
    public void t999CaseDataStore() {
        CaseDataStore.CASE_DATA.put(CaseDataKeyEnum.AAA, "aaa");
    }
}
