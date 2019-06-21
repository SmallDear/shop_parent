package service;

import feign.WxServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.AppWx;

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WxServiceFeign wxServiceFeign;

    /**
    * 会员调用微信接口
    */
    @Override
    @GetMapping(value = "memberInvokeWx")
    public AppWx memberInvokeWx() {
        return wxServiceFeign.getApp();
    }
}
