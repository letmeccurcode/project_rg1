package com.sgxy.springmvc.controller;

import com.sgxy.springmvc.controller.entity.Order;
import com.sgxy.springmvc.controller.entity.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/9 17:28
 */
@Controller
public class ControllerB {

    @RequestMapping("/testDownload")
    public ResponseEntity<byte[]> download(HttpSession session) throws IOException {
        ServletContext sc = session.getServletContext();
        String realPath = sc.getRealPath("/static/laohu.jpg");
        System.out.println(">>>>>>>>>" + realPath);
//        D:\FolderA\codes\sgxy_space\project_rg1\13-springmvc-HttpMessageConverter\src\main\webapp\static
//        D:\FolderA\codes\sgxy_space\project_rg1\13-springmvc-HttpMessageConverter\target\13-springmvc-HttpMessageConverter\static\laohu.jpg
        FileInputStream fis = new FileInputStream(realPath);
        byte[] bytes = new byte[fis.available()];
        //把图片数据写入到字节数组中
        fis.read(bytes);
        HttpHeaders h = new HttpHeaders();
        h.set("Content-Disposition", "attachment;filename=laohu.jpg");
        ResponseEntity<byte[]> entity = new ResponseEntity<>(bytes, h, HttpStatus.OK);
        fis.close();
        return entity;
//        Content-Disposition: attachment; filename="filename.jpg"
    }

    @RequestMapping("/testUpload")
//    public String testUpload(@RequestBody String body) {
    public String testUpload(MultipartFile upload, HttpSession session) throws IOException {

        //将本地的文件数据写入到远程服务器的磁盘上
        //1 确定文件上传的文件夹 假设规定讲文件放在 项目根目录下的images中
        ServletContext sc = session.getServletContext();
        String realPath = sc.getRealPath("images");
        File parent = new File(realPath);
        if (!parent.exists()) {
            parent.mkdirs();
        }
        //webapp/images
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        //webapp/images + filename => File
        filename = uuid + filename;
        File target = new File(parent, filename);
        System.out.println("================>" + target);
        //把上传文件的数据写入到目标文件中
        upload.transferTo(target);
        return "index1";
    }
}
