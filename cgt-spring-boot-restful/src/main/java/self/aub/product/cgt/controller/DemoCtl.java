package self.aub.product.cgt.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import self.aub.product.cgt.po.DemoPo;
import self.aub.product.cgt.service.DemoService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoCtl {
    @Resource
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.POST)
    public boolean create(DemoPo demoPo) {
        return demoService.create(demoPo);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public boolean update(DemoPo demoPo) {
        return demoService.updateById(demoPo);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public boolean removeById(@PathVariable("id") Long id) {
        demoService.removeById(id);
        return true;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public DemoPo get(@PathVariable("id") Long id) {
        return demoService.getById(id);
    }

}
