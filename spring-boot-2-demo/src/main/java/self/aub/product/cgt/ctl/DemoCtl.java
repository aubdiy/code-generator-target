package self.aub.product.cgt.ctl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import self.aub.product.cgt.common.Page;
import self.aub.product.cgt.po.DemoPo;
import self.aub.product.cgt.service.DemoService;

import javax.annotation.Resource;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;

@RestController
@Validated
@RequestMapping("/demo")
@Api(value = "/demo", description = "例子")
public class DemoCtl {
    @Resource
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "创建XXX", response = Boolean.class)
    public boolean create(@ApiParam(name = "demoPo") DemoPo demoPo) {
        //TODO 如不使用，开发后请删除此方法
        return demoService.create(demoPo);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "更新XXX", response = Boolean.class)
    public boolean updateById(@ApiParam(name = "demoPo") DemoPo demoPo) {
        //TODO 如不使用，开发后请删除此方法
        return demoService.updateById(demoPo);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ApiOperation(value = "删除XXX", response = Boolean.class)
    public boolean removeById(@ApiParam(name = "id", value = "请补充参数说明", example = "请补充参数例子")  long id) {
        //TODO 如不使用，开发后请删除此方法
        return demoService.removeById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "查询XXX", response = Boolean.class)
    public DemoPo getById(@ApiParam(name = "id", value = "请补充参数说明", example = "请补充参数例子")
                              @Min(value = 5, message = "kpId必须大于等于5")
                              @Max(value = 10, message = "kpId必须大于等于0")int id

                          ) {
        //TODO 如不使用，开发后请删除此方法
        return demoService.getById(id);
    }

    @RequestMapping(path = "list", method = RequestMethod.GET)
    @ApiOperation(value = "分页查询XXX", response = Page.class)
    public Page<DemoPo> listForPage(@RequestParam Map<String, Object> paramMap) {
        //TODO 请自行整理参数
        return demoService.listForPage(paramMap, 1);
    }
}
