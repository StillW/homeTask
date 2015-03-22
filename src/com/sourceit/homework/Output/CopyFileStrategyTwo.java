package com.sourceit.homework.Output;

import com.sourceit.hometask.io.*;

import java.io.*;

/**
 * Created by Still on 17.03.2015.
 */
public class CopyFileStrategyTwo implements com.sourceit.hometask.io.CopyFileStrategy {

    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        final File outFile = new File(s1);
        if (!outFile.exists()) {
            try
                    (
                    BufferedInputStream bufferIn = new BufferedInputStream(new FileInputStream(s));
                    BufferedOutputStream bufferOut = new BufferedOutputStream(new FileOutputStream(s1))
                    )

            {
                int i;
                for (; (i = bufferIn.read()) != -1; ) {
                    bufferOut.write(i);
                }

            } catch (IOException e) { throw new FileCopyFailedException("Error");
                
            }

        } else {
            throw new FileAlreadyPresentsException("Error");
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
            copyFile(file.getAbsolutePath(),file1.getAbsolutePath());
    }
}
