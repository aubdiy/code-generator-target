package self.aub.product.cgt.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import self.aub.product.cgt.po.DemoPo;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {
    //TODO 如不使用，开发后请删除此方法
    int insert(DemoPo demoPo);

    //TODO 如不使用，开发后请删除此方法
    int inserts(List<DemoPo> demoPos);

    //TODO 如不使用，开发后请删除此方法
    int updateById(DemoPo demoPo);

    //TODO 如不使用，开发后请删除此方法
    int deleteById(long id);

    //TODO 如不使用，开发后请删除此方法
    DemoPo selectById(long id);

    //TODO 如不使用，开发后请删除此方法
    List<DemoPo> selectAll(Map<String, Object> paramMap);

    //TODO 如不使用，开发后请删除此方法
    long countForPage(Map<String, Object> paramMap);

    //TODO 如不使用，开发后请删除此方法
    List<DemoPo> selectForPage(@Param("paramMap") Map<String, Object> paramMap, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

}
