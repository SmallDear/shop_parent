package service;

import org.springframework.web.bind.annotation.GetMapping;
import pojo.AppWx;

public interface MemberService {

    /*
    * 会员调用微信接口
    * */
    @GetMapping(value = "memberInvokeWx")
    public AppWx memberInvokeWx();

}
