package com.test;

import com.zking.core.userUtil.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class Test {
    //创建验证码
    public static String smsCode(){
        String random=(int)((Math.random()*9+1)*100000)+"";
        return random;
    }

    public static void main(String[] args) {
        String code = smsCode();
        String host = "https://feginesms.market.alicloudapi.com";
        String path = "/codeNotice";
        String method = "GET";
        String appcode = "47aeb3d9e1f74ba1835c198889150cfa";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("param", code);
        querys.put("phone", "17378231602");
        querys.put("sign", "2");
        querys.put("skin", "1");
        //JDK 1.8示例代码请在这里下载：  http://code.fegine.com/Tools.zip

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 或者直接下载：
             * http://code.fegine.com/HttpUtils.zip
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             * 相关jar包（非pom）直接下载：
             * http://code.fegine.com/aliyun-jar.zip
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());//如不输出json, 请打开这行代码，打印调试头部状态码。
            //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
            //获取response的body
            System.out.println("这是："+EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
