package com.fire.service.serviceImpl;

import com.fire.dao.ReportDao;
import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.Location;
import com.fire.pojo.entity.Report;
import com.fire.pojo.factory.InfoFactory;
import com.fire.pojo.msg.SystemMsg;
import com.fire.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportDao reportDao;
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    public String uploadImg(MultipartFile uploadFile){
        //获取文件名
        String fileName = uploadFile.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;
        //添加日期目录
        String format = sd.format(new Date());
        //指定本地文件夹存储图片
        String filePath = System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                +System.getProperty("file.separator")+"report"+System.getProperty("file.separator");
        File file = new File(filePath,fileName);
            if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
            try {
            //将图片保存到static文件夹里
            file.createNewFile();
            uploadFile.transferTo(new File(filePath+fileName));
            fileName=System.getProperty("file.separator")+"img"
                    +System.getProperty("file.separator")+"report"+System.getProperty("file.separator")+fileName;
            System.out.println(fileName);
            return  fileName;
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }

    @Override
    public Info addReport(Report report) {
        Integer msg = reportDao.addReport(report);
        if(msg==1){
            return InfoFactory.createInfo(SystemMsg.ADD_ONE_SUCCESS,SystemMsg.ADD_ONE_SUCCESS_STR,msg);
        }else{
            return InfoFactory.createInfo(SystemMsg.ADD_ONE_FAILED,SystemMsg.ADD_ONE_FAILED_STR,msg);
        }
    }

    @Override
    public Info getLocation() {
        Location location = reportDao.getLocation();
        if(location!=null){
            return InfoFactory.createInfo(SystemMsg.GET_ONE_SUCCESS,SystemMsg.GET_ALL_SUCCESS_STR,location);
        }else{
            return InfoFactory.createInfo(SystemMsg.INTERNAL_SERVICE_ERR,SystemMsg.INTERNAL_SERVICE_ERR_STR,location);
        }
    }
}
