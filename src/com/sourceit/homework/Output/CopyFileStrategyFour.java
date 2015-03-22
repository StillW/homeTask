package com.sourceit.homework.Output;

import com.sourceit.hometask.io.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;
/**
 * Created by Still on 17.03.2015.
 */

public class CopyFileStrategyFour implements com.sourceit.hometask.io.CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        final File outFile = new File(s1);

        if (!outFile.exists()) {
            try {

                Path pathone = Paths.get(s);
                Path pathtwo = Paths.get(s1);
                Files.copy(pathone, pathtwo);


            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }else {
            throw new FileAlreadyPresentsException("Error");
        }
    }




            @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getAbsolutePath(),file1.getAbsolutePath());
    }
}
