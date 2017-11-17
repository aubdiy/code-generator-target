package self.aub.product.cgt.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DemoPo {
    private long id;
    private short tinyintDemo;
    private short smallintDemo;
    private int intDemo;
    private long bigintDemo;
    private float floatDemo;
    private double doubleDemo;
    private BigDecimal decimalDemo;
    private String charDemo;
    private String varcharDemo;
    private Date dateDemo;
    private Date timeDemo;
    private Date dateTimeDemo;
    private Date timeStampDemo;
}