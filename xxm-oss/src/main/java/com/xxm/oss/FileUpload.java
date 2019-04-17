package com.xxm.oss;

import com.aliyun.oss.OSSClient;

import java.io.File;

public class FileUpload {

    public static void upload() {
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
        String accessKeyId = "LTAICeP1kEoAe69n";
        String accessKeySecret = "42wxZfHrdJuWWrFkQfkV7LolCfkbP0";
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        ossClient.putObject("xxm-oss", "xxm-oss", new File("C:/Users/mmx/Pictures/33.jpg"));
        ossClient.shutdown();
    }
}
