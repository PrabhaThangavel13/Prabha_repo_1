import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class loggerload {

	final static Logger logger = Logger.getLogger("loggerload");
	
	@SuppressWarnings("resource")
	public void readload() throws IOException
	{
		logger.info("logger info");
		String Files="/log4j.properties";
		File objfile=new File("D:\\Selenium support files\\log4j-api-2.0.2.jar");
		FileReader objreader=new FileReader(objfile);
		BufferedReader objbuffer= new BufferedReader(objreader);
		
		logger.info(Files);
		String writefile=objbuffer.readLine();
		logger.info(writefile + "filedata" );
	}
	
	public static void main(String args[]) throws Exception
	{
		loggerload obj=new loggerload();
		obj.readload();
		
	}
}
