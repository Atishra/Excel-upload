package com.example.excelapi.helper;

//import com.example.excelapi.entity.Customer;
import com.example.excelapi.entity.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {

    public static boolean checkExcelFormat(MultipartFile file) {
        String contentType = file.getContentType();
        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return false;
        }

    }


    public static List<Product> convertExcelToListOfProduct(InputStream is) {
        List<Product> list = new ArrayList<>();
//        public static List<Customer> convertExcelToListOfCustomer(InputStream is) {
//        List<Customer> list1 = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheet("Sheet4");
            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cells = row.iterator();
                int cid = 0;
                Product p = new Product();


                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    if(cell.getCellType() == CellType.BLANK){
                        System.out.println("Error: Empty cell found. File not uploaded.");
                        return  new ArrayList<>();
                    }
                    switch (cid) {
                        case 0:
                            p.setsNo((int) cell.getNumericCellValue());
                            break;
                        case 1:
                            p.setApplicationNumber(cell.getStringCellValue());
                            break;
                        case 2:
                            p.setProduct(cell.getStringCellValue());
                            break;
                        case 3:
                            p.setFirstDisbursalDate(cell.getDateCellValue());
                            break;
                        case 4:
                            p.setPropertyAddress(cell.getStringCellValue());
                            break;
                        case 5:
                            p.setPropertyPincode((int) cell.getNumericCellValue());
                            break;
                        case 6:
                            p.setRegion(cell.getStringCellValue());
                            break;
                        case 7:
                            p.setZoneOrDist(cell.getStringCellValue());
                            break;
                        case 8:
                            p.setLocations(cell.getStringCellValue());
                            break;
                        case 9:
                            p.setRatePerSqft(cell.getNumericCellValue());
                            break;
                        case 10:
                            p.setPropertyType(cell.getStringCellValue());
                            break;
                        case 11:
                            p.setLatitude(cell.getNumericCellValue());
                            break;
                        case 12:
                            p.setLongitude(cell.getNumericCellValue());
                            break;


                        default:
                            break;

                    }
                    cid++;
                }
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}





















