package com.excelProj;


public class App {

    public static void main(String[] args) {

        ExcelFile excelFile=new ExcelFile("excel/data1.xlsx","sheet1");


        System.out.println("rows : "+excelFile.getRowCount());
        System.out.println("collumns : "+excelFile.getCollumnCount());
        System.out.println("cell : "+excelFile.getCell(2,1));
    }
}
