package self.aub.product.cgt.mapper;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import self.aub.product.cgt.po.DemoPo;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class DemoMapperTest {

    @Resource
    private DemoMapper demoMapper;

    private static DemoPo demoPo;

    @BeforeClass
    public static void init() {
        demoPo = new DemoPo();
        demoPo.setTinyintDemo( (short) 1 );
        demoPo.setSmallintDemo( (short) 1 );
        demoPo.setIntDemo( 1 );
        demoPo.setBigintDemo( 1L );
        demoPo.setFloatDemo( 1.1F );
        demoPo.setDoubleDemo( 1.1D );
        demoPo.setDecimalDemo( new BigDecimal( 100 ) );
        demoPo.setCharDemo( "a" );
        demoPo.setVarcharDemo( "a" );
        demoPo.setDateDemo( new Date() );
        demoPo.setTimeDemo( new Date() );
        demoPo.setDateTimeDemo( new Date() );
        demoPo.setTimeStampDemo( new Date() );
    }

    @Test
    public void insert() throws Exception {
        demoMapper.insert( demoPo );
        Assert.assertNotNull( demoPo.getId() );
    }

    @Test
    public void inserts() throws Exception {
        List<DemoPo> demoPos = Collections.nCopies( 2, demoPo );
        int result = demoMapper.inserts( demoPos );
        Assert.assertEquals( demoPos.size(), result );
    }

    @Test
    public void updateTest() throws Exception {
        demoMapper.insert( demoPo );
        demoPo.setVarcharDemo( "update" );
        int result = demoMapper.updateById( demoPo );
        Assert.assertEquals( result, 1 );
    }

    @Test
    public void deleteTest() throws Exception {
        demoMapper.insert( demoPo );
        int result = demoMapper.deleteById( demoPo.getId() );
        Assert.assertEquals( result, 1 );
    }

    @Test
    public void selectTest() throws Exception {
        demoMapper.insert( demoPo );
        DemoPo result = demoMapper.selectById( DemoMapperTest.demoPo.getId() );
        Assert.assertEquals( result.getId(), demoPo.getId() );
    }

    @Test
    public void selectAllTest() throws Exception {
        List<DemoPo> demoPos = demoMapper.selectAll( Collections.emptyMap() );
        Assert.assertNotNull( demoPos );
    }

    @Test
    public void countForPageTest() throws Exception {
        long result = demoMapper.countForPage( Collections.emptyMap() );
        Assert.assertTrue( result >= 0 );
    }

    @Test
    public void selectForPageTest() throws Exception {
        Map<String, Object> paramMap = Collections.singletonMap( "id", 2 );
        List<DemoPo> demoPos = demoMapper.selectForPage( paramMap, 0, 10 );
        Assert.assertNotNull( demoPos );
    }

}
