package folderSizeCalculation.threads;

import folderSizeCalculation.models.FolderForCalc;
import folderSizeCalculation.services.FolderSizeCalcServices;


public class CalculateFolderSizeThread extends Thread {
    FolderForCalc folder;
    public CalculateFolderSizeThread(FolderForCalc folder) {
        this.folder = folder;
    }

    @Override
    public void run() {
        try {
            FolderSizeCalcServices.getFileOrFolderSize(folder.getDir());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
