package com.sourceit.homework.Output;

import com.sourceit.hometask.io.*;
import com.sourceit.hometask.io.CopyFileStrategy;

/**
 * Created by Still on 17.03.2015.
 */
public class CopyFileFactoryImpl implements CopyFileFactory {
    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return  new com.sourceit.homework.Output.CopyFileStrategy();
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategyTwo();
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategyThree();
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategyFour();
    }
}
