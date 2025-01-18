package com.thetestingacademy.filehandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class write_to_particular_cell {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Main");

        Row row=sheet.createRow(1);
        Cell cell=row.createCell(1);
        cell.setCellValue("thanu");


        FileOutputStream file=new FileOutputStream("SEllspecific.xlsx");
        workbook.write(file);
        file.close();

    }


}
