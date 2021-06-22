package folderSizeCalculation.test;

import folderSizeCalculation.models.FolderForCalc;
import folderSizeCalculation.threads.CalculateFolderSizeThread;

public class Test {
    public static void calculateFolderSize() throws InterruptedException {
        FolderForCalc FolderForCalc = new FolderForCalc("C:\\Users\\User\\Desktop\\playlist");
        CalculateFolderSizeThread calculateFolderSizeThread = new CalculateFolderSizeThread(FolderForCalc);
        calculateFolderSizeThread.start();
    }
}
