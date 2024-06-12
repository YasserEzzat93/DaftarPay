package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static FileInputStream fis = null ; 

	public FileInputStream getFileInputStream() 
	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserDataLogin.xlsx"; 
		File srcFile = new File(filePath);

		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found. treminating Process !! : Check file path of TestData");
			System.exit(0);
		}
		return fis ; 
	}

	public Object[][] getExcelData() throws IOException
	{
		fis = getFileInputStream(); 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); 

		int TotalNumberOfRows = (sheet.getLastRowNum()+1);
		int TotalNumberOfCols = 2 ; 

		String[][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols] ; 

		for (int i = 0; i < TotalNumberOfRows; i++) 
		{
			for (int j = 0; j < TotalNumberOfCols; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString(); 
			}
		}
		
//		for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
//            XSSFRow row = sheet.getRow(rowNum);
//            if (row != null) {
//                // Iterate through cells in the row
//                for (int cellNum = 0; cellNum < row.getLastCellNum(); cellNum++) {
//                    XSSFCell cell = row.getCell(cellNum);
//                    if (cell != null) {
//                        // Check the cell's type and get its value
//                        switch (cell.getCellType()) {
//                            case STRING:
//                                System.out.println(cell.getStringCellValue());
//                                break;
//                            case NUMERIC:
//                                System.out.println(cell.getNumericCellValue());
//                                break;
//                            case BOOLEAN:
//                                System.out.println(cell.getBooleanCellValue());
//                                break;
//                            case BLANK:
//                                System.out.println("Cell is blank");
//                                break;
//                            default:
//                                // Handle other cell types if needed
//                                break;
//                        }
//                    } else {
//                        System.out.println("Cell is null");
//                    }
//                }
//            } else {
//                System.out.println("Row is null");
//            }
//        }


		wb.close();
		return arrayExcelData;

	}
}
