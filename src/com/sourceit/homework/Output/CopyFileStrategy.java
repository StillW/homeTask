package com.sourceit.homework.Output;

import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Still on 17.03.2015.
 */
public class CopyFileStrategy implements com.sourceit.hometask.io.CopyFileStrategy {

    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {

        final File outFile = new File(s1);

        if (!outFile.exists()) {

            try
                    (
                    FileInputStream in = new FileInputStream(s);
                    FileOutputStream out = new FileOutputStream(s1)
                    )

            {
                int read;
                for (; (read = in.read()) != -1; ) {
                    out.write(read);
                }

            } catch (IOException e) {
                throw new FileCopyFailedException("File copy fail");
            }

        } else {

            throw new FileAlreadyPresentsException("File is already present");
        }
    }
        @Override
        public void copyFile (File file, File file1)throws FileAlreadyPresentsException, FileCopyFailedException {
            copyFile(file.getAbsolutePath(),file1.getAbsolutePath());

        }
    }
