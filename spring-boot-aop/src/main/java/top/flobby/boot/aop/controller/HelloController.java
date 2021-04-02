package top.flobby.boot.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.flobby.boot.aop.annotation.ControllerWebLog;
import top.flobby.boot.aop.annotation.PictureOperation;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/1
 * @description :
 */

@RestController
@RequestMapping("api/aop")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    @ControllerWebLog(name = "hello", isSave = true)
    public String hello(String name,String title) throws InterruptedException {
        log.info(name);
        log.info(title);
        Thread.sleep(3000);
//        int a = 3 / 0;
        return "Hello World";
    }

    @PostMapping("picture")
    @PictureOperation(isWatermark = true, content = "123321")
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        // 创建文件存放路径
        String realPath = request.getServletContext().getRealPath("/upload");
        log.info(realPath);
        File fileDir = new File(realPath);
        if (!fileDir.exists()) {
            boolean flag = fileDir.mkdirs();
            log.info("flag: " + flag);
        }
        // 生成文件在服务器的名称前缀
        String prefixName = UUID.randomUUID().toString();
        // 取得原文件名
        String originalFilename = file.getOriginalFilename();
        // 从文件夹中分离后缀
        assert originalFilename != null;
        String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
        // 拼接文件名
        String fileName = prefixName + suffixName;
        log.info(fileName);
        File saveFile = new File(realPath + "/" + fileName);
        // 上传
        try {
            file.transferTo(saveFile);
        } catch (IOException e) {
            e.printStackTrace();
            log.info(e.getMessage());
        }
        return realPath + "/" + fileName;
    }
}
