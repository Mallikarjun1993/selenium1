package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelFile {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./data/testdata.xlsx/");
WorkbookFactory wb=new WorkbookFactory.create(fis);
String data=wb.getsheet("Create Customer");
getrow(1).getcell(3).getStringcellvalue();
System.out.println(data);

	}


}
