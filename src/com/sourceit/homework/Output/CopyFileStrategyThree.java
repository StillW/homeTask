package com.sourceit.homework.Output;

import com.sourceit.hometask.io.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by Still on 17.03.2015.
 */
public class CopyFileStrategyThree implements com.sourceit.hometask.io.CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {

        final File outFile = new File(s);
        if (!outFile.exists())

        {
            try (
                FileChannel channelIn = new FileInputStream(s).getChannel();
                FileChannel channelOut = new FileInputStream(s1).getChannel();
                )

                { channelOut.transferFrom(channelIn, 0,channelIn.size());

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
