package com.zking.core.userUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.zking.core.util.JsonData;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetRealCode {
    private static final String URL="https://eid.shumaidata.com/eid/check";
    private static final String APP_CODE="47aeb3d9e1f74ba1835c198889150cfa";

    //验证
    public static JsonData getRealCode(String realCode,String realname) throws IOException, ParseException {
        JsonData jsonData = new JsonData();
//        String realCode="430922200010014523";
//        String realname="卢赛";
        Map<String, String> params = new HashMap<>();
        params.put("idcard", realCode);
        params.put("name", realname);
        String AutoResult = postForm(APP_CODE, URL, params);
        JSONObject jsonObj = (JSONObject)(new JSONParser().parse(AutoResult));
        //System.out.println(jsonObj.toJSONString());
        //result
        Object result = jsonObj.get("result");
        System.out.println(result);
        //jsonData.setResult(result);
        //code
        Object code = jsonObj.get("code");
        System.out.println(code);
        //jsonData.setResult(code);
        //message
        Object message = jsonObj.get("message");
        System.out.println(message);
        //jsonData.setResult(message);
        return jsonData;
    }

    /**
     * 用到的HTTP工具包：okhttp 3.13.1
     * <dependency>
     * <groupId>com.squareup.okhttp3</groupId>
     * <artifactId>okhttp</artifactId>
     * <version>3.13.1</version>
     * </dependency>
     */
    public static String postForm(String appCode, String url, Map<String, String> params) throws IOException {
        OkHttpClient client = new OkHttpClient.Builder().build();
        FormBody.Builder formbuilder = new FormBody.Builder();
        Iterator<String> it = params.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            formbuilder.add(key, params.get(key));
        }
        FormBody body = formbuilder.build();
        Request request = new Request.Builder().url(url).addHeader("Authorization", "APPCODE " + appCode).post(body).build();
        Response response = client.newCall(request).execute();
        System.out.println("返回状态码" + response.code() + ",message:" + response.message());
        String result = response.body().string();
        return result;
    }
}
