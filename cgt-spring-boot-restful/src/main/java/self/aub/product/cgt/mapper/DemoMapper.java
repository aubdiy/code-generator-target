package self.aub.product.cgt.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import self.aub.product.cgt.po.DemoPo;

import java.util.List;
import java.util.Map;


@Mapper
public interface DemoMapper {
    int insert(DemoPo demoPo);

    int inserts(List<DemoPo> demoPos);

    int updateById(DemoPo demoPos);

    int deleteById(Long id);

    DemoPo selectById(Long id);

    List<DemoPo> selectAll(Map<String, Object> paramMap);

    long countForPage(Map<String, Object> paramMap);

    List<DemoPo> selectForPage(@Param("paramMap")Map<String, Object> paramMap, @Param("startIndex") int startIndex, @Param("pageSize")int pageSize);

}
