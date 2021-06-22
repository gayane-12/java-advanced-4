package folderSizeCalculation.services;

import folderSizeCalculation.helpers.FileSizeHelpers;

import java.io.File;

public class FolderSizeCalcServices {

    public static void getFileOrFolderSize(File fileOrFolder) throws InterruptedException {
        File[] files = fileOrFolder.listFiles();
        long size = 0L;

        if (files != null) {
            long[] fileSizes = new long[files.length];
            for (int i = 0; i < files.length; i++) {
                fileSizes[i] = calculateFileSize(files[i]);
                size += fileSizes[i];
                System.out.println(FileSizeHelpers.formatFileSize(fileSizes[i]));
                Thread.sleep(1000);
            }
        }

        System.out.println("Whole size of file or folder: " + FileSizeHelpers.formatFileSize(size));
    }


    public static long calculateFileSize(File file) {
        long size = 0L;

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File subFile : files) {
                size += calculateFileSize(subFile);
            }
        } else {
            size = file.length();
        }

        return size;
    }


}
