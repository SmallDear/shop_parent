package feign;

import org.springframework.cloud.openfeign.FeignClient;
import service.WxService;

/**
 * 会员调用 微信接口
 */
@FeignClient(name = "brhds-weixin")
public interface WxServiceFeign extends WxService {

}
