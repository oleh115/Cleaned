package package115.cleaning;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class Cleaner {
    public void clean(String[] extArray, String[] dirArray) {
        for (String dir : dirArray) {
            File userDir = new File(dir);
            int deleteCount = 0;
            List<File> files = (List<File>) FileUtils.listFiles(userDir, extArray, true);
            for (File file : files) {
                if (file.delete()) {
                    deleteCount++;
                }
            }

            JOptionPane.showMessageDialog(null, files.size() + " file(s) should be deleted and "
                    + deleteCount + " file(s) was deleted");
        }
    }
}
