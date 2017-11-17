package self.aub.product.cgt.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import self.aub.product.cgt.mapper.DemoMapper;
import self.aub.product.cgt.po.DemoPo;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static org.springframework.beans.support.PagedListHolder.DEFAULT_PAGE_SIZE;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public boolean create(DemoPo demoPo) {
        return demoMapper.insert( demoPo ) > 0;
    }

    public boolean updateById(DemoPo demoPo) {
        return demoMapper.updateById( demoPo ) > 0;
    }

    public boolean removeById(Long id) {
        return demoMapper.deleteById( id ) > 0;
    }

    public DemoPo getById(long id) {
        return demoMapper.selectById( id );
    }

    public List<DemoPo> list(Map<String, Object> paramMap) {
        return demoMapper.selectAll( paramMap );
    }

    public Page<DemoPo> listForPage(Map<String, Object> paramMap, int pageNum) {
        long total = demoMapper.countForPage( paramMap );
        List<DemoPo> demoPos = demoMapper.selectForPage( paramMap, (pageNum - 1) * DEFAULT_PAGE_SIZE, DEFAULT_PAGE_SIZE );
        return new PageImpl<>( demoPos, new PageRequest( pageNum, DEFAULT_PAGE_SIZE ), total );
    }
}
