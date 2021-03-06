package self.aub.product.cgt.common;

/**
 * 基础的业务异常构造器
 */
public class BasicBizExceptionBuilder {

    private BasicBizExceptionBuilder() {
    }

    public static BasicBizException build(String bizCode, String message) {
        return new BasicBizException(bizCode, message);
    }
}
