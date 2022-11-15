package com.deaifish.boot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileController {
    @PostMapping("/indx")
    public String File(@RequestParam("email") String email,
                       @RequestPart("headerImg")MultipartFile headerImg,
                       @RequestPart("photos") MultipartFile[] photos) throws IOException {
        if(!headerImg.isEmpty()){
            //保存到文件服务器，OSS服务器
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("/" + originalFilename));
        }
        for (MultipartFile photo :photos) {
            if(!photo.isEmpty()){
                String originalFilename = photo.getOriginalFilename();
                photo.transferTo(new File("/" + originalFilename));
            }
        }
        return "success";
    }
}
