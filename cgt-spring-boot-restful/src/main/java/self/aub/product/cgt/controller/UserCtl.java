package self.aub.product.cgt.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import self.aub.product.cgt.po.UserPo;
import self.aub.product.cgt.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserCtl {
    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public boolean create(String userName, String password) {
        userService.create(userName, password);
        return true;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public UserPo get(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserPo> getAll(Integer age) {
        HashMap<String, Object> parameterMap = new HashMap<>();
        parameterMap.put("age", 10);
        return userService.getAll(parameterMap);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public boolean update(Long id, String userName, String password, Integer age) {
        userService.updateById(id, userName, password, age);
        return true;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public boolean removeById(@PathVariable("id") Long id) {
        userService.removeById(id);
        return true;
    }
}
