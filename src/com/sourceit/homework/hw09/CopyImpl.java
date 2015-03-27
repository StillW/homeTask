        package com.sourceit.homework.hw09;

        import com.sourceit.hometask.io.CopyFileStrategy;
        import com.sourceit.hometask.io.FileCopyFailedException;
        import com.sourceit.hometask.threads.CopyFileTask;
        import com.sourceit.hometask.threads.TaskExecutionFailedException;

        import java.io.PrintStream;

        /**
 * Created by Still on 24.03.2015.
 */
public class CopyImpl implements CopyFileTask{

    private int tryCountCopy;
    private String sourse;
    private String destiny;
    private CopyFileStrategy copyFileStrategy;

            public CopyImpl(CopyFileStrategy channelsCopyFileStrategy, PrintStream ps, String s) {
            }

            @Override
    public void setFileCopyUtils(CopyFileStrategy copyFileStrategy) {
        this.copyFileStrategy = copyFileStrategy;

    }

    @Override
    public void setSourceFilePath(String s) {
        this.sourse = s;

    }

    @Override
    public void setDestinyFilePath(String s) {
        this.destiny = s;

    }

    @Override
    public int getTryCount() {
        return tryCountCopy;
    }

    @Override
    public void incTryCount() {
            ++tryCountCopy;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyFileStrategy.copyFile(sourse,destiny);
        } catch (FileCopyFailedException e) {
            throw new TaskExecutionFailedException("Error");
        }
    }
}

