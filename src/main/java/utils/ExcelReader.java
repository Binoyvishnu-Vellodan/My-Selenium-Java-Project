package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReader {
    private Workbook workbook;

    public ExcelReader(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object[][] getAllTestDataAsMap() {
        Sheet sheet = workbook.getSheetAt(0);
        Row headerRow = sheet.getRow(0);

        List<Map<String, String>> dataList = new ArrayList<>();

        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue;

            Map<String, String> dataMap = new HashMap<>();
            for (int col = 0; col < headerRow.getLastCellNum(); col++) {
                String key = headerRow.getCell(col).getStringCellValue();
                String value = row.getCell(col).getStringCellValue();
                dataMap.put(key, value);
            }
            dataList.add(dataMap);
        }

        Object[][] result = new Object[dataList.size()][1];
        for (int i = 0; i < dataList.size(); i++) {
            result[i][0] = dataList.get(i);
        }
        return result;
    }
}
