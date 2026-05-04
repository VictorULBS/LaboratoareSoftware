package lab8;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class AppLab8 {
    public static void main(String[] args) {

//        FileInputStream file = null;
//        try{
//            file = new FileInputStream(new File("laborator8_input.xlsx"));
//        }
//        catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//
//        XSSFWorkbook workbook = null;
//        try{
//            workbook = new XSSFWorkbook(file);
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//
//         XSSFSheet sheet = workbook.getSheetAt(0);
//        Iterator<Row> rowIterator = sheet.iterator();
//        while(rowIterator.hasNext()){
//            Row row = rowIterator.next();
//            Iterator<Cell> cellIterator = row.cellIterator();
//            while(cellIterator.hasNext()){
//                Cell cell = cellIterator.next();
//                switch(cell.getCellType()){
//                    case CellType.NUMERIC:
//                        System.out.println(cell.getNumericCellValue() + " ");
//                        break;
//                    case CellType.STRING:
//                        System.out.println(cell.getStringCellValue() + " ");
//                        break;
//                }
//            }
//            System.out.println();
//        }
//        try{
//            file.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }



        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("new sheet");
        Row row = sheet.createRow(2);
        row.createCell(0).setCellValue(1.1);
        row.createCell(1).setCellValue(new Date());
        row.createCell(2).setCellValue(Calendar.getInstance());
        row.createCell(3).setCellValue("a string");
        row.createCell(4).setCellValue(true);
        row.createCell(5).setCellType(CellType.ERROR);
// Write the output to a file
        try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
            wb.write(fileOut);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
