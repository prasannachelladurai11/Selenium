package com.DataProvider;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
	@SuppressWarnings("deprecation")
	public String getExceldata(String sheetname,int rownum,int cellnum) {
		String retVal=null;
		File location=new File("src/TestData");
		File name = new File(location, "DataProviderForWeather.xlsx");
		try {
			FileInputStream fis=new FileInputStream(name.getAbsolutePath());
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			Row r=s.getRow(rownum);
			Cell c=r.getCell(cellnum);
			if(c.getCellType() == Cell.CELL_TYPE_STRING)
				retVal=c.getStringCellValue();
				else {
					retVal = String.valueOf(c.getNumericCellValue());
					return String.valueOf(retVal).split("\\.")[0];
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;

}}
