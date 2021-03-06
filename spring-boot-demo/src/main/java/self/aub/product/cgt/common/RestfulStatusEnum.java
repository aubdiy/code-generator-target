package self.aub.product.cgt.common;

/**
 * Restful 状态码枚举
 */
public enum RestfulStatusEnum {
    /**
     * 成功
     */
    SUCCESS(0),
    /**
     * 失败, 服务端异常
     */
    SREVER_SIDE_FAIL(1),
    /**
     * 失败, 非法的请求参数
     */
    ILLEGAL_ARGUMENT(2);

    private int status;

    RestfulStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
