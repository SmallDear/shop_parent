package service;

import org.springframework.web.bind.annotation.GetMapping;
import pojo.AppWx;

public interface WxService {
    /*
    *微信接口
    * */
    @GetMapping(value = "getApp")
    public AppWx getApp();
}
