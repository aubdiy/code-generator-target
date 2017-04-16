package self.aub.product.cgt.mapper;

import org.apache.ibatis.annotations.Mapper;
import self.aub.product.cgt.po.DemoPo;

import java.util.List;


@Mapper
public interface DemoMapper {
    int insert(DemoPo demoPo);

    int inserts(List<DemoPo> demoPos);

    int updateById(DemoPo demoPos);

    int deleteById(Long id);

    DemoPo selectById(Long id);
}
