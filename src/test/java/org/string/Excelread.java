package org.string;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excelread {
        public static void main(String args[]) throws Exception {
        FileInputStream fis= new FileInputStream("/C:/Users/binoy/IdeaProjects/Selenium/src/Files/Age.xlsx");
        Workbook wb=new XSSFWorkbook(fis);
        Sheet sheet=wb.getSheetAt(0);
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);
        }
}

