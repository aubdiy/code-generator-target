package self.aub.product.cgt.common;

import lombok.Data;

/**
 * 基础的业务异常
 */
@Data
public class BasicBizException extends RuntimeException {

    private final String bizCode;

    public BasicBizException(String bizCode, String message) {
        super(message);
        this.bizCode = bizCode;
    }
}
