package feign;

import org.springframework.cloud.openfeign.FeignClient;
import service.WxService;

/**
*feign 调用微信服务接口
*/
@FeignClient(name = "brhds-weixin")
public interface WxServiceFeign extends WxService {

}
