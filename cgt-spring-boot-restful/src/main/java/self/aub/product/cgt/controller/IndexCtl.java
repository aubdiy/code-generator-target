package self.aub.product.cgt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class IndexCtl {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
