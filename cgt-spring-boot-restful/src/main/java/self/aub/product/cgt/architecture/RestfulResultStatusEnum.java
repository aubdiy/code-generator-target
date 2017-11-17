package self.aub.product.cgt.architecture;

/**
 * Created by liujinxin on 2017/5/1.
 */
public enum RestfulResultStatusEnum {
    SUCCESS( 0 ), FAIL( 1 ), ILLEG_ALARGUMENT( 2 );

    private int status;

    RestfulResultStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
