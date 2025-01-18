package com.thetestingacademy.filehandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Excel_reading {

    public static void main(String[] args) throws IOException {

        //creating workbook
        //sheet
        //Row,cell
        //XSSFWorkBook->xlsx >2008
        //HSSFWorkBook->xls <2004


        //creating excel file and add data


        Map<String,Object> data = new TreeMap<>();
        data.put("1",new Object[]{"LoginId","Email","password"});
        data.put("2",new Object[]{"1","thanushreeag01@gmail.com","Thanu@49"});
        data.put("3",new Object[]{"2","pramod@gmail.com","123456"});

        createExcel("CTD1.xlsx",data);


    }

    public  static String createExcel(String name,Map data) throws IOException {

        Set<String> keyset= data.keySet();

        XSSFWorkbook workbook=new XSSFWorkbook();

        XSSFSheet sheet =workbook.createSheet("main");

        int rownum=0;

        for(String key:keyset){

            Row r =sheet.createRow(rownum++);
            Object[] ObjectA=(Object[]) data.get(key);

            int cellnum=0;
            for(Object o:ObjectA){
                Cell cell=r.createCell(cellnum++);
                if(o instanceof String){
                    cell.setCellValue((String) o);

                }
                if (o instanceof Integer){
                    cell.setCellValue((Integer) o);
                }
            }


        }

        FileOutputStream file=new FileOutputStream(name);
        workbook.write(file);
        file.close();

        return name;

    }
}
