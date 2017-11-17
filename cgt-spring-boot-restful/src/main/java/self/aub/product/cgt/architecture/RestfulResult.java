package self.aub.product.cgt.architecture;

import lombok.Data;

/**
 * Created by liujinxin on 2017/5/1.
 */
@Data
public class RestfulResult {


    private int status;

    private Object data;

    public RestfulResult(Object data) {
        this.status = RestfulResultStatusEnum.SUCCESS.getStatus();
        this.data = data;
    }

    public RestfulResult(RestfulResultStatusEnum status, Object data) {
        this.status = status.getStatus();
        this.data = data;
    }


}
