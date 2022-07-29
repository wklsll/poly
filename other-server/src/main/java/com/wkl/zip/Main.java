package com.wkl.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        /** 测试压缩方法1 */
        /*  FileOutputStream fos1 = new FileOutputStream(new File("D:\\test\\back.zip"));
        ZipUtils.toZip("D:\\test\\back", fos1, true);*/

        // 测试压缩方法2 /*
        List<File> fileList = new ArrayList<>();
        fileList.add(new File("D:\\datas\\1.txt"));
        fileList.add(new File("D:\\datas\\2.xlsx"));
        fileList.add(new File("D:\\datas\\4.docx"));
        fileList.add(new File("D:\\datas\\5.pdf"));
        FileOutputStream fos2 = new FileOutputStream(new File("D:\\datas\\wkl.zip"));
        ZipUtils.toZip(fileList, fos2);
    }


}
