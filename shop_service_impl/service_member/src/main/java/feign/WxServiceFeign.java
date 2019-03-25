package feign;

import org.springframework.cloud.openfeign.FeignClient;
import service.WxService;

@FeignClient(name = "brhds-weixin")
public interface WxServiceFeign extends WxService {

}
