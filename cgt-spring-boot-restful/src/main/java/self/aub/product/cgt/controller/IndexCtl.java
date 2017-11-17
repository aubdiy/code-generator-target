package self.aub.product.cgt.controller;

import org.apache.commons.lang3.Validate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import self.aub.product.cgt.po.DemoPo;


@RestController
@RequestMapping
public class IndexCtl {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "b", method = RequestMethod.GET)
    public int index2() {
        Validate.isTrue( false, "参数错误" );
        return 123;
    }

    @RequestMapping(path = "a", method = RequestMethod.GET)
    public DemoPo index1() {
        DemoPo demoPo = new DemoPo();
        demoPo.setId( 123123L );
        return demoPo;
    }
}
