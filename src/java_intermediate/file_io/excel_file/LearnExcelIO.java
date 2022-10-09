package java_intermediate.file_io.excel_file;

import java.io.File;
import java.io.IOException;

public class LearnExcelIO {

    public static void main(String[] args) throws IOException {
        String projectPath = System.getProperty("user.dir");
        String relPath = File.separator + "src" + File.separator + "files" + File.separator + "TestExcel.xlsx";
        String filePath = projectPath + relPath;

        DataReader dr = new DataReader();
        String sheetName = "Students";

//        String[][] data = dr.readStringArrays(filePath, sheetName);
//
//        for (String[] row : data) {
//
//            for (String cell : row) {
//                System.out.print(cell + "\t\t");
//            }
//            System.out.println();
//        }

        String[] singleRow = dr.readStringArray(filePath, sheetName);

        for (String s : singleRow) {
            System.out.println(s);
        }


    }
}
