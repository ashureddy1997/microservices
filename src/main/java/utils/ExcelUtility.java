package utils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ExcelUtility {
    public ArrayList<String> readExcel(String filePath, String fileName, String sheetName, int index) throws IOException {

        ArrayList<String> value = null;
        File file = new File(filePath + "/" + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(index);
        value.add(row.getCell(0).getStringCellValue());
        return value;
    }


    public void writeExcel(String filePath, String fileName, String sheetName, HashMap<String, String> dataToWrite) throws IOException {


        File file = new File(filePath + "/" + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);


        Set<Map.Entry<String, String>> entry = dataToWrite.entrySet();
        Iterator<Map.Entry<String, String>> statsIterator = entry.iterator();
        int i = 0;
        while (statsIterator.hasNext()) {
            Row newRow = sheet.createRow(++i);
            Map.Entry<String, String> keys = statsIterator.next();
            Cell cell0 = newRow.createCell(0);
            cell0.setCellValue(keys.getKey());
            Cell cell1 = newRow.createCell(1);
            cell1.setCellValue(keys.getValue());
            System.out.println(keys.getKey() + " => " + keys.getValue());
        }
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        outputStream.close();

    }

    public void writeExcel(String filePath, String fileName, String sheetName, String dataToWrite) throws IOException {


        File file = new File(filePath + "/" + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row newRow = sheet.createRow(0);
        Cell cell0 = newRow.createCell(0);
        cell0.setCellValue(dataToWrite);
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        outputStream.close();

    }

    public void writeExcel(String filePath, String fileName, String sheetName, String dataToWrite, int i , int j) throws IOException {


        File file = new File(filePath + "/" + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row newRow = sheet.getRow(i+1);
        Cell cell0 = newRow.createCell(j);
        cell0.setCellValue(dataToWrite);
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

}
