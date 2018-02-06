package self.aub.product.cgt.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "例子")
public class DemoPo {

    @ApiModelProperty(value = "自增主键")
    private long id;

    @ApiModelProperty(value = "tinyint 例子")
    private short tinyintDemo;

    @ApiModelProperty(value = "smallint 例子")
    private short smallintDemo;

    @ApiModelProperty(value = "int 例子")
    private int intDemo;

    @ApiModelProperty(value = "bigint 例子")
    private long bigintDemo;

    @ApiModelProperty(value = "float 例子")
    private String floatDemo;

    @ApiModelProperty(value = "double 例子")
    private double doubleDemo;

    @ApiModelProperty(value = "decimal 例子")
    private String decimalDemo;

    @ApiModelProperty(value = "char 例子")
    private String charDemo;

    @ApiModelProperty(value = "varchar 例子")
    private String varcharDemo;

    @ApiModelProperty(value = "date 例子")
    private Date dateDemo;

    @ApiModelProperty(value = "time 例子")
    private Date timeDemo;

    @ApiModelProperty(value = "date_time 例子")
    private Date dateTimeDemo;

    @ApiModelProperty(value = "time_stamp 例子")
    private Date timeStampDemo;

    private DemoPo() {
    }
}