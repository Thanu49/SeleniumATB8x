package com.thetestingacademy.ExcelReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Excel {

    public String[][] getdatafromsheet(String woekbooklocation, String worksheetname) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(System.getProperty("user.dir") + "/" + woekbooklocation);
        XSSFSheet sheet = workbook.getSheet(worksheetname);

        int rownum = sheet.getLastRowNum() + 1;
        int colnum = sheet.getRow(0).getLastCellNum();

        String[][] data = new String[rownum][colnum];


        for (int i = sheet.getFirstRowNum();i < rownum; i++){
            Row row = sheet.getRow(i);
            for (int j=row.getFirstCellNum();j<colnum;j++){
                Cell cell=row.getCell(j);
                data[i][j]=cell.getStringCellValue();
                        }
        }
workbook.close();
return data;

}}