package folderSizeCalculation.helpers;


public class FileSizeHelpers {

    public static String formatFileSize(long size) {
        String unit = "bytes";

        if (size > 1024) {
            size /= 1024;
            unit = "KB";
        }
        if (size > 1024) {
            size /= 1024;
            unit = "MB";
        }
        if (size > 1024) {
            size /= 1024;
            unit = "GB";
        }

        return size + unit;
    }

}
