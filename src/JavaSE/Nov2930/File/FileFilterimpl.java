package JavaSE.Nov2930.File;

import java.io.File;
import java.io.FileFilter;

public class FileFilterimpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().endsWith(".java");
    }
}
