package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelUtils {
    private Workbook workbook;

    public ExcelUtils(String filePath) {
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
                Cell cell = row.getCell(col);

                String value = "";
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            value = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            value = String.valueOf(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            value = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            value = cell.getCellFormula();
                            break;
                        default:
                            value = "";
                    }
                }
                dataMap.put(key, value);
            }
            // ✅ Only add if "Check" = "Yes"
            if ("Yes".equalsIgnoreCase(dataMap.get("Check"))) {
                dataList.add(dataMap);
            }
        }

        Object[][] result = new Object[dataList.size()][1];
        for (int i = 0; i < dataList.size(); i++) {
            result[i][0] = dataList.get(i);
        }
        return result;
    }

}
