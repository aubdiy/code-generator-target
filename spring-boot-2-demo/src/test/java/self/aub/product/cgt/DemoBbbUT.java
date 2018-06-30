package self.aub.product.cgt;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static self.aub.product.cgt.CaseDataStore.CASE_DATA;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoBbbUT {


    private String aaa = Optional.ofNullable((String) CASE_DATA.get(CaseDataKeyEnum.AAA)).orElse("");

    @Test
    public void t001Biz1() {
        Assert.assertTrue("aaa".equals(aaa));
    }

    @Test
    public void t002Biz2() {
        Assert.assertTrue(true);
    }
}
