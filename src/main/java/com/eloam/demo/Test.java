package com.eloam.demo;

import cn.com.agree.device.comm.api.ICommFingerPrint;
import cn.com.agree.device.comm.api.service.EloamServiceFingerImpl;
import com.eloam.demo.DemoApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: miss[494977551@qq.com]
 * @Date: Create in 9:42 2020/5/6
 * @DESC:
 **/
@RestController
public class Test {
    public static void main(String[] args){
        ICommFingerPrint fingerPrint = new EloamServiceFingerImpl();
        byte[] bytes = new byte[0];
        byte[] fileName = new byte[128];
        System.out.println(fileName.length);
        int fingerPrint1 = fingerPrint.getFingerPrint(1, bytes, fileName, 5000);
        System.out.println(fingerPrint1);
        System.out.println(fingerPrint.getErrorMessage(fingerPrint1));
        System.out.println(new String(fileName));
    }
    @RequestMapping({"/","/index"})
    public String str(){
        return "ok";
    }
}
