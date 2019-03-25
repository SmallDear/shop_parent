package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.AppWx;


@RestController
public class WxServiceImpl implements WxService {

    @Override
    @GetMapping(value = "getApp")
    public AppWx getApp() {
        return new AppWx("992968389", "buruihua");
    }
}
