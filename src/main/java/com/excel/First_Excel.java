package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class First_Excel {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Abhi\\eclipse-workspace\\Prac_Maven\\src\\excel\\Excel1.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet s=w.getSheetAt(0);
	//Row r=s.getRow(0);
	//Cell c=r.getCell(0);
	//CellType ct=c.getCellType();
	//if(ct.equals(ct.STRING))
	//{
	//System.out.println(c.getStringCellValue());
	//}else {
	//System.out.println(c.getNumericCellValue());
	//}
	Iterator iterator=s.iterator();
	while(iterator.hasNext())
	{
		XSSFRow row=(XSSFRow) iterator.next();
		Iterator cellIterator=row.cellIterator();
		
		while(cellIterator.hasNext())
		{
		XSSFCell cell=(XSSFCell) cellIterator.next();
		
		switch(cell.getCellType())//used instead of if case statement
		{
		case STRING: System.out.println(cell.getStringCellValue());
		break;
		
		case NUMERIC: System.out.println(cell.getNumericCellValue());
		break;
		}
		System.out.print(" ");
		}
		System.out.println();
		}
		}
	}
