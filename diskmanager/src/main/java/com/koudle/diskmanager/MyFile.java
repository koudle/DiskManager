package com.koudle.diskmanager;

import java.io.File;
import java.net.URI;

/**
 * Created by kl on 17-2-15.
 * File的包装类
 */

public class MyFile extends File {
    public MyFile(String pathname) {
        super(pathname);
    }

    public MyFile(String parent, String child) {
        super(parent, child);
    }

    public MyFile(File parent, String child) {
        super(parent, child);
    }

    public MyFile(URI uri) {
        super(uri);
    }

    @Override
    public boolean delete() {
        //删除文件
        FileManager.getInstance().deleteFile(this);
        return super.delete();
    }
}
