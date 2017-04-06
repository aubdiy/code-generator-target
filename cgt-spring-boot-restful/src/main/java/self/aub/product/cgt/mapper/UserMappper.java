package self.aub.product.cgt.mapper;

import org.apache.ibatis.annotations.Mapper;
import self.aub.product.cgt.po.UserPo;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMappper {

    long insert(UserPo userPo);

    UserPo updateById(UserPo userPo);

    void deleteById(Long id);

    UserPo selectById(Long id);

    List<UserPo> selectAll(Map<String, Object> paramMap);

}
