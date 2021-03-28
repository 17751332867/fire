package com.fire.service;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.Report;
import com.fire.pojo.factory.InfoFactory;
import org.springframework.web.multipart.MultipartFile;

public interface ReportService {
    public String uploadImg(MultipartFile uploadFile);
    public Info addReport(Report report);
    public Info getLocation();
}
