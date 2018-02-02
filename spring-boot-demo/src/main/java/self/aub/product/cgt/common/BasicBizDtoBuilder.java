package self.aub.product.cgt.common;

/**
 * BasicBizDto 构建器
 */
public class BasicBizDtoBuilder {

    private BasicBizDtoBuilder() {
    }

    public static BasicBizDto buildForSuccess() {
        return new BasicBizDto();
    }
}
