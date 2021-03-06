package self.aub.product.cgt.common;

import lombok.Data;

/**
 * 基础的业务DTO
 */
@Data
public class BasicBizDto {
    /**
     * 业务代码;例如: 00
     */
    private String bizCode;
    /**
     * 业务代码描述;例如:成功
     */
    private String bizCodeDesc;

    public BasicBizDto() {
        this(BasicBizEnum.SUCCESS.getCode(), BasicBizEnum.SUCCESS.getDesc());
    }

    public BasicBizDto(String bizCode, String bizCodeDesc) {
        this.bizCode = bizCode;
        this.bizCodeDesc = bizCodeDesc;
    }
}
