package self.aub.product.cgt.service;

import org.springframework.stereotype.Service;
import self.aub.product.cgt.mapper.UserMappper;
import self.aub.product.cgt.po.UserPo;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Resource
    private UserMappper userMappper;

    public long create(String userName, String password) {
        UserPo userPo = new UserPo();
        userPo.setUserName(userName);
        userPo.setPassword(password);
        return userMappper.insert(userPo);
    }

    public UserPo updateById(long id, String userName, String password, int age) {
        UserPo userPo = new UserPo();
        userPo.setUserName(userName);
        userPo.setPassword(password);
        userPo.setAge(age);
        return userMappper.updateById(userPo);
    }

    public void removeById(Long id) {
        userMappper.deleteById(id);
    }

    public UserPo getById(long id) {
        return userMappper.selectById(id);
    }

    public List<UserPo> getAll(Map<String, Object> paramMap) {
        return userMappper.selectAll(paramMap);
    }


}
