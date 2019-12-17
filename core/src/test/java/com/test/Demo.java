package com.test;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Demo {
    public static void main(String[] args) throws ParseException {
        String result = "{\"code\":\"0\",\"message\":\"成功\",\"result\":{\"name\":\"肖雨晴\",\"idcard\":\"430426200304168462\",\"res\":\"1\",\"description\":\"一致\",\"sex\":\"女\",\"birthday\":\"20030416\",\"address\":\"湖南省衡阳市祁东县\"}}";

        JSONObject jsonObj = (JSONObject)(new JSONParser().parse(result));
        System.out.println(jsonObj.toJSONString() + "\n" + jsonObj.getClass());
        Object code = (Object) jsonObj.get("result");
        System.out.println(code);

    }
}
