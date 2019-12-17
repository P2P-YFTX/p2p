package com.zking.core.controller;

import com.sun.java.browser.plugin2.liveconnect.v1.Result;
import com.zking.core.model.StateStatus;
import com.zking.core.service.IStateStatusService;
import com.zking.core.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Controller
public class UploadDownController {

    @Autowired
    private IStateStatusService stateStatusService;

    @RequestMapping(value = "/imageupload")
    @ResponseBody
    public Object UploadImage (HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file,@RequestParam(value = "asuserid", required = false)Long asuserid) throws IOException {
        JsonData jsonData = new JsonData();
        System.out.println(file.getOriginalFilename());
        String fileRealName = file.getOriginalFilename(); //获得原始文件名;
        int pointIndex = fileRealName.indexOf(".");  //点号的位置
        String fileSuffix = fileRealName.substring(pointIndex);  //截取文件后缀
        String pic_time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String saveFile = pic_time+fileSuffix;
        String filePath = "/uploads"+ File.separator+saveFile;
        String realPath = request.getServletContext().getRealPath(filePath);

        if(!file.isEmpty()){
            file.transferTo(new File(realPath));
            StateStatus byuserid = stateStatusService.findByuserid(asuserid);
            StateStatus status = new StateStatus();
            if(byuserid==null){
                status.setAsuserid(asuserid);
                status.setAsidimg(filePath);
                int i = stateStatusService.insertImg(status);
                if(i>0){
                    jsonData.setCode(0);
                    jsonData.setMessage("上传成功");
                    jsonData.setResult(saveFile);
                }
            }else{
                status.setAsid(byuserid.getAsid());
                status.setAsuserid(asuserid);
                status.setAsidimg(filePath);
                int i = stateStatusService.updateByPrimaryKeySelective(status);
                if(i>0){
                    jsonData.setCode(0);
                    jsonData.setMessage("上传成功");
                    jsonData.setResult(saveFile);
                }
            }
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("文件不能为空");
//            jsonData.setResult(saveFile);
        }
        return jsonData;
    }

    @RequestMapping(value = "/imageupload2")
    @ResponseBody
    public Object UploadImage2 (HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file,@RequestParam(value = "asuserid", required = false)Long asuserid) throws IOException {
        JsonData jsonData = new JsonData();
        System.out.println(file.getOriginalFilename());
        String fileRealName = file.getOriginalFilename(); //获得原始文件名;
        int pointIndex = fileRealName.indexOf(".");  //点号的位置
        String fileSuffix = fileRealName.substring(pointIndex);  //截取文件后缀
        String pic_time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String saveFile = pic_time+fileSuffix;
        String filePath = "/uploads"+ File.separator+saveFile;
        String realPath = request.getServletContext().getRealPath(filePath);

        if(!file.isEmpty()){
            file.transferTo(new File(realPath));
            StateStatus byuserid = stateStatusService.findByuserid(asuserid);
            StateStatus status = new StateStatus();
            if(byuserid==null){
                status.setAsuserid(asuserid);
                status.setAsidimg2(filePath);
                int i = stateStatusService.insertImg(status);
                if(i>0){
                    jsonData.setCode(0);
                    jsonData.setMessage("上传成功");
                    jsonData.setResult(saveFile);
                }
            }else{
                status.setAsid(byuserid.getAsid());
                status.setAsuserid(asuserid);
                status.setAsidimg2(filePath);
                int i = stateStatusService.updateByPrimaryKeySelective(status);
                if(i>0){
                    jsonData.setCode(0);
                    jsonData.setMessage("上传成功");
                    jsonData.setResult(saveFile);
                }
            }
        }else{
            jsonData.setCode(-1);
            jsonData.setMessage("文件不能为空");
//            jsonData.setResult(saveFile);
        }
        return jsonData;
    }
}
