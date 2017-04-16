package self.aub.product.cgt.service;

import org.springframework.stereotype.Service;
import self.aub.product.cgt.mapper.DemoMapper;
import self.aub.product.cgt.po.DemoPo;

import javax.annotation.Resource;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public boolean create(DemoPo demoPo) {
        return demoMapper.insert(demoPo) > 0;
    }

    public boolean updateById(DemoPo demoPo) {
        return demoMapper.updateById(demoPo) > 0;
    }

    public boolean removeById(Long id) {
        return demoMapper.deleteById(id) > 0;
    }

    public DemoPo getById(long id) {
        return demoMapper.selectById(id);
    }
}
