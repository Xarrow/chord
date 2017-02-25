package controller;

import model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import utils.ExcelUtil;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhang
 * @Time:2017/2/25
 */
@Controller
public class DownloadActController {
    @RequestMapping(value = "exportExcel")
    public String download(HttpServletResponse response) throws IOException {
        String fileName = "" + System.currentTimeMillis();
        //填充projects数据
        List<Project> projects = createData();
        List<Map<String, Object>> list = createExcelRecord(projects);
        String columnNames[] = {"ID", "项目名", "销售人", "负责人", "所用技术", "备注"};//列名
        String keys[] = {"id", "name", "saler", "principal", "technology", "remarks"};//map中的key
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ExcelUtil.createWorkBook(list, keys, columnNames).write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return null;
    }

    private List<Project> createData() {
        // TODO Auto-generated method stub
        //自己实现
        List<Project> projectList = new ArrayList<>();
        Project p1 = new Project();
        p1.setId(1);
        p1.setName("zhangsan");
        p1.setTechnology("alibab");
        p1.setRemarks("CTO");
        projectList.add(p1);
        return projectList;
    }

    private List<Map<String, Object>> createExcelRecord(List<Project> projects) {
        List<Map<String, Object>> listmap = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("sheetName", "sheet1");
        listmap.add(map);
        for (Project project : projects) {
            Map<String, Object> mapValue = new HashMap<>();
            mapValue.put("id", project.getId());
            mapValue.put("name", project.getName());
            mapValue.put("technology", project.getTechnology());
            mapValue.put("remarks", project.getRemarks());
            listmap.add(mapValue);
        }
        return listmap;
    }
}
