package com.excelProj;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelFile {

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private String sheetPage;

    public ExcelFile(String path, String sheetPage) {
        this.sheetPage=sheetPage;
        try {
            this.workbook = new XSSFWorkbook(path);
            this.sheet = workbook.getSheet(this.sheetPage);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public int getRowCount(){
        return sheet.getPhysicalNumberOfRows();
    }

    public int getCollumnCount(){
        return sheet.getRow(0).getPhysicalNumberOfCells();
    }

    public List<String> getCollumn(int collumn)  {
        if (collumn > 0 && collumn <=getCollumnCount()) {

            List<String> colList = new ArrayList<>();
            Iterator<Row> itRow = sheet.iterator();

            while (itRow.hasNext()) {
                Row row = itRow.next();
                Cell cell = row.getCell(collumn - 1);
                colList.add(cell.toString());
            }
            return colList;
        }
        return null;
    }

    public List<String> getRow(int row) {
            if (row > 0 && row <=getRowCount()) {

                List<String> rowList = new ArrayList<>();
                Row rowSelected =sheet.getRow(row-1);

                Iterator<Cell> itCell=rowSelected.cellIterator();
                while (itCell.hasNext()){
                    Cell cell=itCell.next();
                    rowList.add(cell.toString());
                }
            return rowList;
            }
            return null;
    }

    public String getCell(int row,int col){
        Row rowSelected =sheet.getRow(row-1);
        Cell cell=rowSelected.getCell(col-1);
        return cell.toString();
    }

    public String getSheetPage() {
        return sheetPage;
    }

    public void setSheetPage(String sheetPage) {
        this.sheetPage = sheetPage;
    }
}
