package utils;

import com.github.pjfanning.xlsx.StreamingReader;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtilities {
    public String path = System.getProperty("user.dir") + "\\src\\main\\resources\\";

    public FileInputStream fis = null;

    public FileOutputStream fileOut = null;

    private XSSFWorkbook workbook = null;

    private XSSFSheet sheet = null;

    private XSSFRow row = null;

    private XSSFCell cell = null;
    public static DataFormatter formatter= new DataFormatter();

    Workbook workbooks = null;
    Sheet sheets = null;
    private Row rows = null;

    private Cell cells = null;

    public int col_num;
    public void initializeExcelConfig(String fileName) {
        // this.path = path+fileName+".xls";
        try {
            System.out.println("inside intialize excel config");
            fis = new FileInputStream(path + fileName + ".xlsx");
            File file = new File(path + fileName + ".xlsx");
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(0);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void initializeExcelConfig1(String fileName, String sheetName) {
        try {
            System.out.println("inside intialize excel config");
            fis = new FileInputStream(path + fileName + ".xlsx");
            Workbook workbook = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(fis);
            int sheets = workbook.getNumberOfSheets();
            System.out.println("Total Sheets :: "+sheets);
            int index = workbook.getSheetIndex(sheetName);
            Sheet sheet = workbook.getSheetAt(index);
            int number = sheet.getLastRowNum() + 1;
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initializeExcelConfig2(String fileName) {
        try {
            System.out.println("inside intialize excel config");
            fis = new FileInputStream(path + fileName + ".xlsx");
            workbooks = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(fis);
            sheets = workbooks.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void check(String fileName) throws FileNotFoundException {
        InputStream is = new FileInputStream(new File(path + fileName+".xlsx"));
        StreamingReader reader = StreamingReader.builder()
                .rowCacheSize(100)    // number of rows to keep in memory (defaults to 10)
                .bufferSize(4096)     // buffer size to use when reading InputStream to file (defaults to 1024)
                .sheetIndex(0)        // index of sheet to use (defaults to 0)
                .read(is);            // InputStream or File for XLSX file (required)

        for (Row r : reader) {
            for (Cell c : r) {
                System.out.println(c.getStringCellValue());
            }
        }
    }

    public boolean checksheetExists(String fileName, String sheetName) {
        boolean flag = false;
        try {
            System.out.println("inside intialize excel config");
            System.out.println(path +"Question_Sequencing"+ fileName);
            fis = new FileInputStream(path+"Question_Sequencing\\"+fileName);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
            int totalSheets = workbook.getNumberOfSheets();
            System.out.println("Total Sheets :: "+totalSheets);
            for (int i=0;i<totalSheets;i++) {
                if (workbook.getSheetName(i).equals(sheetName)) {
                    flag = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public ArrayList<String> getFileNames(){
        ArrayList<String> filesNames = new ArrayList<>();
        File file = new File(path+"Question_Sequencing\\");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
            filesNames.add(f.getName());
        }
        return filesNames;
    }



    public int getRowCount(String sheetName) {
        int index = workbook.getSheetIndex(sheetName);
        if (index == -1)
            return 0;
        else {
            sheet = workbook.getSheetAt(index);
            int number = sheet.getLastRowNum() + 1;
            return number;
        }
    }

    public int getRowCount1(String sheetName) {
        int index = workbooks.getSheetIndex(sheetName);
        if (index == -1)
            return 0;
        else {
            sheets = workbooks.getSheetAt(index);
            int number = sheets.getLastRowNum() + 1;
            return number;
        }
    }

    public int getColumnOfTestCase(String sheetName, String columnName) throws NullPointerException {
        int columnNumber = 0;
        try {
            int index = workbook.getSheetIndex(sheetName);
            System.out.println("============================"+index);
            sheet = workbook.getSheetAt(index);
            int rw= sheet.getLastRowNum()+1;
            for(int j=0;j<rw;j++)
            {
                row = sheet.getRow(0);

                if(row == null) {
                }else {
                    for(int k=0;k < row.getLastCellNum(); k++) {
                        Object re=row.getCell(k);
                        if(re==null) {
                        }
                        else {

                            String testCase = re.toString().trim();
                            columnName = columnName.trim();
                            if(testCase.contentEquals(columnName)){
                                columnNumber = k;
                            }
                        }

                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return columnNumber;
    }

    public ArrayList<String> getValues(String sheetName, String colName) {
        ArrayList<String> value = new ArrayList<String>();
        try {
            int index = workbook.getSheetIndex(sheetName);
            int colNum = getColumnOfTestCase(sheetName, colName);
            //     int col_Num = -1;
            if (index == -1) {
            }
            sheet = workbook.getSheetAt(index);
            int rw= sheet.getLastRowNum()+1;
            String val[] = new String[rw];
            for(int j=1;j<rw;j++)
            {
                row = sheet.getRow(j);
                if (row == null) {
                }
                cell = row.getCell(colNum);
                if (cell == null) {
                }
                if (cell.getCellType() == CellType.STRING) {
                    val[j-1]  = cell.getStringCellValue();
                }
                else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
                    cell.setCellType(CellType.STRING);
                    String cellText = String.valueOf(cell.getStringCellValue());
                    val[j-1]  = cellText;
                }
                else if (cell.getCellType() == CellType.BLANK)
                    val[j-1]  = "";
                else
                    val[j-1]  =    String.valueOf(cell.getBooleanCellValue());
            }
            for(int j=0;j<rw;j++)
            {
                if(val[j]!=null) {
                    value.add(val[j]);
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    public String getCellData(String sheetName, String colName, int rowNum) {
        try {
            if (rowNum <= 0)
                return "";
            int index = workbook.getSheetIndex(sheetName);
            int col_Num = -1;
            if (index == -1)
                return "";
            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
                    col_Num = i;
                    break;
                }
            }
            if (col_Num == -1)
                return "";
            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                return "";
            cell = row.getCell(col_Num);

            if (cell == null)
                return "";
            if (cell.getCellType() == CellType.STRING) {
                return cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
                cell.setCellType(CellType.STRING);
                String cellText = String.valueOf(cell.getStringCellValue());
                return cellText;
            } else if (cell.getCellType() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " and column " + colName + " does not exist in xls";
        }
    }

    public String getCellData1(String sheetName, String colName, int rowNum) {
        try {
            if (rowNum <= 0)
                return "";
            int index = workbooks.getSheetIndex(sheetName);
            int col_Num = -1;
            if (index == -1)
                return "";
            sheets = workbooks.getSheetAt(index);
            rows = sheets.getRow(0);
            for (int i = 0; i < rows.getLastCellNum(); i++) {
                if (rows.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
                    col_Num = i;
                    break;
                }
            }
            if (col_Num == -1)
                return "";
            sheets = workbooks.getSheetAt(index);
            rows = sheets.getRow(rowNum - 1);
            if (rows == null)
                return "";
            cells = rows.getCell(col_Num);

            if (cells == null)
                return "";
            if (cells.getCellType() == CellType.STRING) {
                return cells.getStringCellValue();
            } else if (cells.getCellType() == CellType.NUMERIC || cells.getCellType() == CellType.FORMULA) {
                cells.setCellType(CellType.STRING);
                String cellText = String.valueOf(cells.getStringCellValue());
                return cellText;
            } else if (cells.getCellType() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cells.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " and column " + colName + " does not exist in xls";
        }
    }

    public String getCellData(String sheetName, int colNum, int rowNum) {
        try {
            if (rowNum <= 0)
                return "";
            int index = workbook.getSheetIndex(sheetName);
            if (index == -1)
                return "";
            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                return "";
            cell = row.getCell(colNum);
            if (cell == null)
                return "";

            if (cell.getCellType() == CellType.STRING)
                return cell.getStringCellValue();
            else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
                String cellText = String.valueOf(cell.getNumericCellValue());
                return cellText;
            } else if (cell.getCellType() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colNum + " does not exist  in xls";
        }
    }

    public boolean addSheet(String sheetName) {
        try {
            workbook.createSheet(sheetName);
            fileOut = new FileOutputStream(path);
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean removeSheet(String sheetName) {

        int index = workbook.getSheetIndex(sheetName);
        if (index == -1)
            return false;

        try {
            workbook.removeSheetAt(index);
            fileOut = new FileOutputStream(path);
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void removeSheetData(String fileName) throws FileNotFoundException, IOException {
        int rownum;
        while ((rownum = sheet.getLastRowNum()) > 0)
            sheet.removeRow(sheet.getRow(rownum));
        workbook.write(new FileOutputStream(path + fileName + ".xls"));
        workbook.close();
    }

    public void setCellHeader(String fileName) throws FileNotFoundException, IOException {
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("S.No");
        /*
         * row1.createCell(1).setCellValue(createHelper.createRichTextString("Name"));
         * row1.createCell(2).setCellValue(createHelper.createRichTextString("Email"));
         * row1.createCell(3).setCellValue(createHelper.createRichTextString("Phone"));
         * row1.createCell(4).setCellValue(createHelper.createRichTextString("Password")
         * );
         * row1.createCell(5).setCellValue(createHelper.createRichTextString("Goal"));
         */
        workbook.write(new FileOutputStream(path + fileName + ".xls"));
        workbook.close();
    }

    public boolean isSheetExist(String sheetName) {

        int index = workbook.getSheetIndex(sheetName);
        if (index == -1) {
            index = workbook.getSheetIndex(sheetName.toUpperCase());
            return index != -1;
        } else
            return true;
    }

    public int getColumnCount(String sheetName) {

        // check if sheet exists
        if (!isSheetExist(sheetName))
            return -1;

        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(0);

        if (row == null)
            return -1;

        return row.getLastCellNum();
    }

    public ArrayList<Integer> getCellRowNum(String sheetName, String colName, String cellValue) {
        ArrayList<String> cgID = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        System.out.println("Sheet Name ::"+sheetName);
        System.out.println("Row Count :: "+getRowCount(sheetName));
        for (int i = 2; i <= getRowCount(sheetName); i++) {
            if (getCellData(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
                row.add(i);
            }
        }
        return row;
    }

    public ArrayList<Integer> getCellRowNum1(String sheetName, String colName, String cellValue) {
        ArrayList<String> cgID = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        int lastRowNum = sheets.getLastRowNum();
        System.out.println("Sheet Name : "+sheets.getSheetName());
        System.out.println(" ::"+sheetName+" "+colName+" "+cellValue);
        System.out.println("Last Row :: "+lastRowNum);
        System.out.println("Row Count :: "+getRowCount1(sheetName));
        for (int i = 2; i <= getRowCount1(sheetName); i++) {
            if (getCellData1(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
                row.add(i);
            }
        }
        return row;
    }

    public boolean setCellData(String fileName, String sheetName, String colName, int rowNum, String data) {
        try {
            fis = new FileInputStream(path + fileName + ".xls");
            workbook = new XSSFWorkbook(fis);

            if (rowNum <= 0)
                return false;
            int sheetIndex = workbook.getSheetIndex(sheetName);
            if (sheetIndex == -1)
                return false;
            int colNum = -1;
            sheet = workbook.getSheetAt(sheetIndex);
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim() == colName)
                    colNum = i;
                break;
            }

            if (colNum == -1)
                return false;
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                row = sheet.createRow(rowNum - 1);
            cell = row.getCell(colNum);
            if (cell == null) {
                row.createCell(colNum);
                System.out.println("sheet " + sheet);
                System.out.println(path + fileName + ".xls");
                fileOut = new FileOutputStream(path + fileName + ".xls");

                workbook.write(fileOut);
                fileOut.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public void getTestData(String sheetName, String testCaseName) {
        int rowNum = getRowNumberOfTestCase(sheetName, testCaseName);
        System.out.println("Test case Row Number" +rowNum);
        int ExecutionFlagRowNo = rowNum + 1;

        String ExecutionFlag = sheet.getRow(ExecutionFlagRowNo).getCell(1).toString();
        if (ExecutionFlag.toLowerCase().contains("yes")) {
            for (int i = 0; i < row.getLastCellNum(); i++) {
                System.out.println(sheet.getRow(i));
                System.out.println(row.getLastCellNum());
            }
        }

    }

    public int getRowNumberOfTestCase(String sheetName, String testcaseName) throws NullPointerException {
        int rowNumber = 0;
        try {
            int index = workbook.getSheetIndex(sheetName);
            sheet = workbook.getSheetAt(index);
            int rw = sheet.getLastRowNum() + 1;
            for (int j = 0; j < rw; j++) {
                row = sheet.getRow(j);

                if (row == null) {
                } else {
                    for (int k = 0; k < row.getLastCellNum(); k++) {
                        Object re = row.getCell(k);
                        if (re == null) {
                        } else {

                            String testCase = re.toString().trim();
                            testcaseName = testcaseName.trim();
                            if (testCase.contentEquals(testcaseName)) {
                                rowNumber = j;
                            }
                        }

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowNumber;
    }

    public String getData(String sheetName, String testcaseName, String colName) {
        String value = null;
        try {
            int index = workbook.getSheetIndex(sheetName);
            int col_Num = -1;
            if (index == -1)
                return "";
            sheet = workbook.getSheetAt(index);
            int rowNum = getRowNumberOfTestCase(sheetName, testcaseName);
            row = sheet.getRow(rowNum);
            int ExecutionFlagRowNo = rowNum + 1;
            String ExecutionFlag = sheet.getRow(ExecutionFlagRowNo).getCell(1).toString();
            if (ExecutionFlag.toLowerCase().contains("yes")) {
                for (int i = 0; i < row.getLastCellNum(); i++) {
                    if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
                        col_Num = i;
                        break;
                    }
                }
                if (col_Num == -1)
                    return "";
                sheet = workbook.getSheetAt(index);
                int newRow = getRowNumberOfTestCase(sheetName, testcaseName) + 1;
                row = sheet.getRow(newRow);
                if (row == null)
                    return "";
                cell = row.getCell(col_Num);

                if (cell == null)
                    return value = "";
                if (cell.getCellType() == CellType.STRING) {
                    return value = cell.getStringCellValue();
                } else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
                    cell.setCellType(CellType.STRING);
                    String cellText = String.valueOf(cell.getStringCellValue());
                    return value = cellText;
                } else if (cell.getCellType() == CellType.BLANK)
                    return value = "";
                else
                    return String.valueOf(cell.getBooleanCellValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return value = "row " + colName + " and column " + colName + " does not exist in xls";
        }

        return value;
    }

    public  Object[][] getDataFromExcel(String sheetName, String filePath)  {
        try {
            fis= new FileInputStream(filePath); //Excel sheet file location get mentioned here
            workbook = new XSSFWorkbook(fis); //get my workbook
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int sn=0; sn < workbook.getNumberOfSheets(); sn++) {
            if (workbook.getSheetName(sn).equals(sheetName)){
                sheet=workbook.getSheetAt(sn);
                break;
            }
        }
        XSSFRow Row=sheet.getRow(0);     //get my Row which start from 0
        int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum= Row.getLastCellNum(); // get last ColNum

        String Data[][]= new String[RowNum-1][ColNum]; // pass my  count data in array

        for(int i=0; i<RowNum-1; i++) //Loop work for Rows
        {
            XSSFRow row= sheet.getRow(i+1);

            for (int j=0; j<ColNum; j++) //Loop work for colNum
            {
                if(row==null)
                    Data[i][j]= "";
                else
                {
                    XSSFCell cell= row.getCell(j);
                    if(cell==null)
                        Data[i][j]= ""; //if it get Null value it pass no data
                    else
                    {
                        String value=formatter.formatCellValue(cell);
                        Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                    }
                }
            }
        }

        return Data;
    }

    public  void writeDataIntoExcel(String sheetName, String filePath, List<Boolean> statusList, int dataRow, String colName){

        try {
            fis= new FileInputStream(filePath); //Excel sheet file location get mentioned here
            workbook = new XSSFWorkbook(fis); //get my workbook
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet=workbook.getSheet(sheetName);// get my sheet from workbook
        XSSFRow Row=sheet.getRow(0);     //get my Row which start from 0
        int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum= Row.getLastCellNum(); // get last ColNum
        int sheetIndex=workbook.getSheetIndex(sheetName);
        if(sheetIndex==-1)
        {
            System.out.println("No such sheet in file exists");
        }else {
            col_num=-1;
            for(int i=0;i<Row.getLastCellNum();i++)
            {
                XSSFCell cols=Row.getCell(i);
                String colsVal=formatter.formatCellValue(cols);
                if(colsVal.trim().equalsIgnoreCase(colName.trim()))
                {
                    col_num=i;
                    System.out.println("the colument is "+col_num);
                    break;
                }
            }
//
            Row= sheet.getRow(dataRow);
            try
            {
                System.out.println(statusList.size());
                for (int i = 0; i <statusList.size() ; i++) {

                    XSSFCell cell=sheet.getRow(dataRow).getCell(col_num);
                    // if no cell found then it create cell
                    if(cell==null) {
                        cell=Row.createCell(col_num);
                    }
                    //Set Result is pass in that cell number
                    cell.setCellValue(statusList.get(i));
                    col_num = col_num+1;
                }
                //get my Row which is equal to Data  Result and that colNum



            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut = new FileOutputStream(filePath,false);
            workbook.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(col_num==-1) {
            System.out.println("Column you are searching for does not exist");
        }

    }
    public  void writeQuestionCountExcel(String sheetName, String filePath, List<String> statusList, int dataRow, String colName){

        try {
            fis= new FileInputStream(filePath); //Excel sheet file location get mentioned here
            workbook = new XSSFWorkbook(fis); //get my workbook
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet=workbook.getSheet(sheetName);// get my sheet from workbook
        XSSFRow Row=sheet.getRow(0);     //get my Row which start from 0
        int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum= Row.getLastCellNum(); // get last ColNum
        int sheetIndex=workbook.getSheetIndex(sheetName);
        if(sheetIndex==-1)
        {
            System.out.println("No such sheet in file exists");
        }else {
            col_num=-1;
            for(int i=0;i<Row.getLastCellNum();i++)
            {
                XSSFCell cols=Row.getCell(i);
                String colsVal=formatter.formatCellValue(cols);
                if(colsVal.trim().equalsIgnoreCase(colName.trim()))
                {
                    col_num=i;
                    System.out.println("the colument is "+col_num);
                    break;
                }
            }
//
            Row= sheet.getRow(dataRow);
            if (Row == null){
                Row = sheet.createRow(dataRow);
            }
            try
            {
                System.out.println(statusList.size());
                for (int i = 0; i <statusList.size() ; i++) {

                    XSSFCell cell=Row.getCell(col_num);
                    // if no cell found then it create cell
                    if(cell==null) {
                        cell=Row.createCell(col_num);
                    }
                    //Set Result is pass in that cell number
                    cell.setCellValue(statusList.get(i));
                    col_num = col_num+1;
                }
                //get my Row which is equal to Data  Result and that colNum



            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut = new FileOutputStream(filePath,false);
            workbook.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(col_num==-1) {
            System.out.println("Column you are searching for does not exist");
        }

    }
    public  void writeQuestionCountExcel1(String sheetName, String filePath, List<String> statusList, int dataRow){

        try {
            fis= new FileInputStream(filePath); //Excel sheet file location get mentioned here
            workbook = new XSSFWorkbook(fis); //get my workbook
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet=workbook.getSheet(sheetName);// get my sheet from workbook
        XSSFRow Row=sheet.getRow(0);     //get my Row which start from 0
        int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum= Row.getLastCellNum(); // get last ColNum
        int sheetIndex=workbook.getSheetIndex(sheetName);
        if(sheetIndex==-1)
        {
            System.out.println("No such sheet in file exists");
        }else {
            col_num=-1;
//			for(int i=0;i<Row.getLastCellNum();i++)
//			{
//				XSSFCell cols=Row.getCell(i);
//				String colsVal=formatter.formatCellValue(cols);
//				if(colsVal.trim().equalsIgnoreCase(colName.trim()))
//				{
//					col_num=i;
//					System.out.println("the colument is "+col_num);
//					break;
//				}
//			}
//
//			Row= sheet.getRow(dataRow);
//			if (Row == null){
//				Row = sheet.createRow(dataRow);
//			}

            XSSFRow  row = sheet.getRow(dataRow);
            if (row == null)
                try
                {
//				col_num =0;
                    System.out.println(statusList.size());
                    for (int i = 0; i <statusList.size() ; i++) {

                        XSSFCell cell=row.getCell(i);
                        // if no cell found then it create cell
                        if(cell==null) {
                            cell=row.createCell(i);
                        }
                        //Set Result is pass in that cell number
                        cell.setCellValue(statusList.get(i));
//					col_num = col_num+1;
                    }
                    //get my Row which is equal to Data  Result and that colNum



                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut = new FileOutputStream(filePath,false);
            workbook.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(col_num==-1) {
            System.out.println("Column you are searching for does not exist");
        }

    }
//	public  void writeQuestionCountExcel(final String filePath, final String sheetName, List<String> columnNames, Map<String,List<String>> resultMap) {
//
//		try {
//			fis= new FileInputStream(filePath); //Excel sheet file location get mentioned here
//			workbook = new XSSFWorkbook(fis); //get my workbook
//			sheet=workbook.getSheet(sheetName);// get my sheet from workbook
//			int rowCount = 0;
//			int columnCount = 0;
//			List<String> resultList =null;
//			Row row = sheet.createRow(rowCount++);
//			for (String columnName : columnNames) {
//				Cell cell = row.createCell(columnCount++);
//				cell.setCellValue(columnName);
//			}
//
//			Set<String> set =resultMap.keySet();
//			for (String lm:set) {
//				columnCount =0;
////				row = sheet.getRow(rowCount);
////				if(row == null){
////					row = sheet.createRow(rowCount);
////				}
////				rowCount++;
////				Cell cell = row.createCell(columnCount++);
////				cell.setCellValue(lm);
//				resultList = resultMap.get(lm);
//				for(int i=0; i<columnNames.size()-1; i++){
//					Cell cell1 = row.createCell(columnCount++);
//					cell1.setCellValue(resultList.get(i));
//				}
//			}
//			fileOut = new FileOutputStream(filePath,false);
//			workbook.write(fileOut);
//			fileOut.flush();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (fileOut != null) {
//					fileOut.close();
//				}
//			} catch (IOException e) {
//			}
//			try {
//				if (workbook != null) {
//					workbook.close();
//				}
//			} catch (IOException e) {
//			}
//		}
//	}

    public void setCellValue(String fileName, String sheetName, String ColumnName, int rowNumber, String cellValue) throws IOException, NullPointerException {
        FileInputStream fiss = new FileInputStream(path+fileName+".xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fiss);
        Sheet sheet = workbook.getSheetAt(0);
        int columnNum = 0;
        for(int i=0;i<sheet.getLastRowNum();i++) {

            Row rowTotal = sheet.getRow(0);

            for(int j=0;j<rowTotal.getLastCellNum();j++) {
                Object cellE = rowTotal.getCell(j);

                if(cellE  == null) {
                }
                else {
                    String cellS = cellE.toString().trim();
                    if(cellS.contentEquals(ColumnName)){
                        columnNum = j;
                    }
                }
            }
            if(rowNumber<sheet.getLastRowNum()) {
                Row rowN = sheet.getRow(rowNumber);
                Cell cellTotal = rowN.createCell(columnNum);
                cellTotal.setCellValue(cellValue);
            }
        }
        try (FileOutputStream outputStream = new FileOutputStream(path+fileName+".xlsx")) {
            workbook.write(outputStream);
            workbook.close();
        }
    }


    public void writeExcel(String userDir, String s, String learn, String yes, int m, int i) {
    }
}
