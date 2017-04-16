package self.aub.product.cgt.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DemoPo {
    private Long id;
    private Short tinyintDemo;
    private Short smallintDemo;
    private Integer intDemo;
    private Long bigintDemo;
    private Float floatDemo;
    private Double doubleDemo;
    private BigDecimal decimalDemo;
    private String charDemo;
    private String varcharDemo;
    private Date dateDemo;
    private Date timeDemo;
    private Date dateTimeDemo;
    private Date timeStampDemo;
}