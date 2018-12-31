
package com.smartcampus.provider.controller;


import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.constant.Stu;
import com.smartcampus.provider.db1.service.StudentService;
import com.smartcampus.provider.entity.Rep;
import com.smartcampus.provider.entity.StudentEntity;
import com.smartcampus.provider.entity.UserEntity;
import com.smartcampus.provider.utils.ExcelHelper;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@CrossOrigin
@Controller
@RequestMapping("/excel")
public class ExcelController {
    private static Logger log = Logger.getLogger(ExcelController.class);

    @Autowired
    private StudentService studentService;

    @Value("${excel.dir}")
    private String filePath;

    @ResponseBody
    @RequestMapping("/addStudents")
    public Rep getToken1(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new Rep(RepCode.NG_FILE_UPLOAD);
        }
        String fileName = file.getOriginalFilename();


        File excel = new File(filePath + '/' + fileName);
        try {
            file.transferTo(excel);

            log.info("上传成功" + excel.getName());
            String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！

            log.info("上传成功" + split.toString());
            try {
                Workbook wb = null;
                //根据文件后缀（xls/xlsx）进行判断
                if ("xls".equals(split[1])) {
                    FileInputStream fis = new FileInputStream(excel);   //文件流对象
                    wb = new HSSFWorkbook(fis);
                } else if ("xlsx".equals(split[1])) {
                    wb = new XSSFWorkbook(excel);
                } else {
                    log.info("文件类型错误!");
                }
                log.info("开始解析!");
                if (wb != null) {
                    log.info("开始解析!2");
                    //开始解析
                    Sheet sheet = wb.getSheetAt(0);     //读取sheet 0
                    int firstRowIndex = sheet.getFirstRowNum() + 1;   //第一行是列名，所以不读
                    int lastRowIndex = sheet.getLastRowNum();
                    System.out.println("firstRowIndex: " + firstRowIndex);
                    System.out.println("lastRowIndex: " + lastRowIndex);
                    for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                        Row row = sheet.getRow(rIndex);
                        System.out.println(1);
                        if (row != null) {
                            int firstCellIndex = row.getFirstCellNum();
                            // 学号
                            Cell stuIdCell = row.getCell(firstCellIndex);
                            // 终止节点
                            if (ExcelHelper.cellIsNull(stuIdCell)) {
                                break;
                            }
                            System.out.println(2);
                            // 姓名
                            Cell nameCell = row.getCell(firstCellIndex + 1);
                            // 身份证
                            Cell identityIdCell = row.getCell(firstCellIndex + 2);
                            // 性别
                            Cell sexCell = row.getCell(firstCellIndex + 3);
                            // 入学日期
                            Cell enrollmentDateCell = row.getCell(firstCellIndex + 4);
                            // 专业
                            Cell majorCell = row.getCell(firstCellIndex + 5);
                            // 班级
                            Cell classCell = row.getCell(firstCellIndex + 6);
                            // 学制
                            Cell schoolingLlengthCell = row.getCell(firstCellIndex + 7);
                            // 地址
                            Cell addressCell = row.getCell(firstCellIndex + 8);
                            // 民族
                            Cell nationalityCell = row.getCell(firstCellIndex + 9);
                            // 状态
                            Cell statusCell = row.getCell(firstCellIndex + 10);

                            UserEntity userEntity = new UserEntity();
                            userEntity.setName(ExcelHelper.cellToString(stuIdCell));
                            userEntity.setPwd(Stu.DEF_PWD);
                            userEntity.setRole(Stu.ROLE);
                            StudentEntity studentEntity = new StudentEntity();
                            studentEntity.setStuId(ExcelHelper.cellToString(stuIdCell));
                            studentEntity.setStuName(ExcelHelper.cellToString(nameCell));
                            studentEntity.setStuIdentityId(ExcelHelper.cellToString(identityIdCell));
                            studentEntity.setStuSex(ExcelHelper.cellToString(sexCell));
                            studentEntity.setStuEnrollmentDate(ExcelHelper.cellToTime(enrollmentDateCell));
                            studentEntity.setStuMajor(ExcelHelper.cellToString(majorCell));
                            studentEntity.setStuClass(ExcelHelper.cellToString(classCell));
                            studentEntity.setStuSchoolingLength(ExcelHelper.cellToString(schoolingLlengthCell));
                            studentEntity.setStuAddress(ExcelHelper.cellToString(addressCell));
                            studentEntity.setStuNationality(ExcelHelper.cellToString(nationalityCell));
                            studentEntity.setStuStatus(ExcelHelper.cellToString(statusCell));
                            System.out.println(3);

                            int status1 = studentService.insert(studentEntity, userEntity);

                        }
                    }

                }

                return new Rep(RepCode.OK);
            } catch (Exception e) {
                return new Rep(RepCode.NG_FILE_UPLOAD,e);
            }

        } catch (IOException e) {
        }
        return new Rep(RepCode.NG_FILE_UPLOAD);
    }


}
