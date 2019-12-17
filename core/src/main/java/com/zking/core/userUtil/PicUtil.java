package com.zking.core.userUtil;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PicUtil {
    public static String upPic(MultipartFile file) throws IOException {
        if (file.getSize() > 0) {
            String orName = file.getOriginalFilename();
            String extName = orName.substring(orName.lastIndexOf("."));
            String newName = new Date().getTime() + extName;
            File file2 = new File("E:/imgs/" + newName);
            file.transferTo(file2);
            return newName;
        } else {
            System.out.println("没有选择文件");
        }
        return null;
    }
}
