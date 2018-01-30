package self.aub.product.cgt.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DemoPo {
    @ApiModelProperty(value = "")
    private long id;
    @ApiModelProperty(value = "")
    private short tinyintDemo;
    @ApiModelProperty(value = "")
    private short smallintDemo;
    @ApiModelProperty(value = "")
    private int intDemo;
    @ApiModelProperty(value = "")
    private long bigintDemo;
    @ApiModelProperty(value = "")
    private String floatDemo;
    @ApiModelProperty(value = "")
    private double doubleDemo;
    @ApiModelProperty(value = "")
    private String decimalDemo;
    @ApiModelProperty(value = "")
    private String charDemo;
    @ApiModelProperty(value = "")
    private String varcharDemo;
    @ApiModelProperty(value = "")
    private Date dateDemo;
    @ApiModelProperty(value = "")
    private Date timeDemo;
    @ApiModelProperty(value = "")
    private Date dateTimeDemo;
    @ApiModelProperty(value = "")
    private Date timeStampDemo;
}