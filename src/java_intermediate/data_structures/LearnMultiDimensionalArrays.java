package java_intermediate.data_structures;

import java_intermediate.file_io.excel_file.DataReader;

import java.io.File;
import java.io.IOException;

public class LearnMultiDimensionalArrays {

    public static void main(String[] args) throws IOException {
        DataReader dr = new DataReader();
        String[][] myMdArray = new String[3][4];

        myMdArray[0][0] = "4665PA";
        myMdArray[0][1] = "Mahdi";
        myMdArray[0][2] = "Belabbas";
        myMdArray[0][3] = "PA";

        myMdArray[1][0] = "30491NY";
        myMdArray[1][1] = "Mehnaz";
        myMdArray[1][2] = "Bhuiyan";
        myMdArray[1][3] = "NY";

        myMdArray[2][0] = "30431NY";
        myMdArray[2][1] = "Eraz";
        myMdArray[2][2] = "Chowdhury";
        myMdArray[2][3] = "NY";

        String projectPath = System.getProperty("user.dir");
        String relPath = File.separator + "src" + File.separator + "files" + File.separator + "TestExcel.xlsx";
        String filePath = projectPath + relPath;
        String sheetName = "WriteTest";

        dr.writeStringArrays(myMdArray, filePath, sheetName);

    }
}
