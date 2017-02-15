package com.koudle.diskmanager;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kl on 17-2-15.
 * FileOutPutStream的包装类
 */

public class MyFileOutPutStream extends FileOutputStream {
    private File mTempFile;

    public MyFileOutPutStream(String name) throws FileNotFoundException {
        super(name);
    }

    public MyFileOutPutStream(String name, boolean append) throws FileNotFoundException {
        super(name, append);
    }

    public MyFileOutPutStream(File file) throws FileNotFoundException {
        super(file);
    }

    public MyFileOutPutStream(File file, boolean append) throws FileNotFoundException {
        super(file, append);
        mTempFile = file;
    }

    public MyFileOutPutStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    @Override
    public void close() throws IOException {
        super.close();
        //存储文件
        FileManager.getInstance().saveFile(mTempFile);
    }
}
