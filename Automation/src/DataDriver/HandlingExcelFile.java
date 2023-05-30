package DataDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fs= new FileInputStream("./data/testdata.xlsx");
Workbook wb = WorkbookFactory.create(fs);
int count = wb.getSheet("Sheet1").getLastRowNum();

for(int i=1;i<=count;i++)
{
String un = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
String pwd = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
System.out.println(un+" "+pwd);

}
// to write back to excel

wb.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("passed");
FileOutputStream fo= new FileOutputStream("./data/testdata.xlsx");
wb.write(fo);

for(int i=1;i<=count;i++)
{
 wb.getSheet("Sheet1").getRow(1).getCell(2).setCellValue("passed");


}
wb.write(fo);
wb.close();
}
}