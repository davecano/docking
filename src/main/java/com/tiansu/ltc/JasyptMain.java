package com.tiansu.ltc;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @ClassName JasyptMain
 * @Description : 配置文件加密 生成密文类
 * 输入 待加密的字段 console 等到加密后的字段
 *
 * @param null
 * @Return :
 * @Author : ldd
 * @Date : 2021/1/7 11:00
 */
@Slf4j
public class JasyptMain {

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor=new BasicTextEncryptor();
        //salt
        textEncryptor.setPassword("1Qaz0okm");
        String username=textEncryptor.encrypt("sa");
        String password=textEncryptor.encrypt("iamnts");
        log.info("username:"+username+" password："+password);
    }
}
