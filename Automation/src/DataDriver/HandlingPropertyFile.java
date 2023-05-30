package DataDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs= new FileInputStream("./data/commondata.property");
Properties p= new Properties();
p.load(fs);
String un = p.getProperty("password");
String pwd = p.getProperty("username");
String url = p.getProperty("url");
System.out.println(un+" "+pwd +" "+url);
	}

}
