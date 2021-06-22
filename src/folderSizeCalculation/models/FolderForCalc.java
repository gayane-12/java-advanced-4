package folderSizeCalculation.models;

import java.io.File;

public class FolderForCalc {
    private File dir;

    public FolderForCalc(String path) {
        this.dir = new File(path);
    }

    public File getDir() {
        return dir;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }
}
