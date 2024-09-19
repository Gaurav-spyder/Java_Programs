package Java_Programs.Day5;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 

public class ReadnWrite {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NISHI\\eclipse-workspace\\GuviJavaBasics\\src\\Names.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        String[][] data = {
                {"Name", "Age", "Email"},
                {"John Doe", "30", "john@test.com"},
                {"John Doe", "38", "john@test.com"},
                {"Bo Smith", "35", "jacky@example.com"},
                {"Swapnil", "37", "swapnil@example.com"}
        };

        for (int i = 0; i < data.length; i++) {
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < data[i].length; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(data[i][j]);
            }
        }
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            System.out.println("Data written to Excel file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        //Read the data into console from a file
        
        String myfile= "C:\\Users\\NISHI\\eclipse-workspace\\GuviJavaBasics\\src\\Names.xlsx";
        try (FileInputStream fis = new FileInputStream(myfile);
                Workbook workbook1 = new XSSFWorkbook(fis)) {

               org.apache.poi.ss.usermodel.Sheet sheetR = workbook1.getSheetAt(0);

           
               for (Row row : sheet) {
         
                   for (Cell cell : row) {
                       switch (cell.getCellType()) {
                           case STRING:
                               System.out.print(cell.getStringCellValue() + "\t");
                               break;
                           case NUMERIC:
                               System.out.print(cell.getNumericCellValue() + "\t");
                               break;
                           case BOOLEAN:
                               System.out.print(cell.getBooleanCellValue() + "\t");
                               break;
                           default:
                               System.out.print("Unknown Type\t");
                       }
                   }
                   System.out.println();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
        
