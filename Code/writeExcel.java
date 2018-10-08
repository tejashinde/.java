import java.io.File;
import java.io.IOException;
import jxl.*;
import jxl.write.*;
import jxl.write.Number;

class writeExcel
{
	public static void main(String[] args) throws IOException,WriteException
	{
		try
		{
			String fileName = "/home/prince/Desktop/Semester4/Service_Learning/Code/Excel/file.xls";
			WritableWorkbook workbook = workbook createWorkbook(new file(fileName));
			WritableSheet sheet = workbook createSheet("Sheet1", 0);

			//add label
			Label  label = new Label(0,0,"A label record");
			Sheet.addCell(label);

			Number num = new Number(0,1,3.1459);
			Sheet.addCell(num);

			workbook.write();
			workbook.close();
		}
		catch(WriteException e)
		{
		}
	}
}