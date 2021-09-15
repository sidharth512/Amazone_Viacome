package Readconfilit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public  static int getRowCount(String sheetName) throws IOException {
		fi=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\Amazon_DemoProject\\src\\test\\java\\loginData\\Login Data for Amazon.xlsx");
		wb=new  XSSFWorkbook(fi);
		ws=wb.getSheet(sheetName);
		int rowcount=ws.getLastRowNum();
				return rowcount;
	}
		public static int getCellcount(String sheetName,int rownum) throws IOException {
			fi=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\Amazon_DemoProject\\src\\test\\java\\loginData\\Login Data for Amazon.xlsx");
			wb=new  XSSFWorkbook(fi);
			ws=wb.getSheet(sheetName);
			row=ws.getRow(rownum);
			int cellcount=row.getLastCellNum();
			return cellcount;
			
			
		}
		public  static String getCellData(String sheetName,int rownum,int colnum) throws IOException {
			fi=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\Amazon_DemoProject\\src\\test\\java\\loginData\\Login Data for Amazon.xlsx");
			wb=new  XSSFWorkbook(fi);
			ws=wb.getSheet(sheetName);
			row=ws.getRow(rownum);
			cell=row.getCell(colnum);
			String data;
			try {
			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
			}
       catch(Exception e){
    	    data = "";
       }
			return data;
		}
			
		/*}
			public static void setCellData(String xlfile,String xlsheet, int rownum,int colnum,String data) throws IOException {
				fi=new FileInputStream(xlfile);
				wb=new  XSSFWorkbook(fi);
				ws=wb.getSheet(xlsheet);
				row=ws.getRow(rownum);
				cell=row.getCell(colnum);
				cell.setCellValue(data);
				fo=new FileOutputStream(xlfile);
				wb.write(fo);
				wb.close();
				fi.close();
				fo.close();
			
				
			}*/
			
			
		
	}
	
	
	


