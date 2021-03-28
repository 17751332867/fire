package com.fire.controller;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.Report;
import com.fire.pojo.factory.InfoFactory;
import com.fire.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/report")
public class FireReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping("/uploadImg")
    public String uploadImg(MultipartFile uploadFile){
        return reportService.uploadImg(uploadFile);
    }
    @RequestMapping("/addReport")
    public Info addFireReport(Report report){
        return reportService.addReport(report);
    }
    @RequestMapping("/getReportLocation")
    public Info getReportLocation(){
        return reportService.getLocation();
    }
}
