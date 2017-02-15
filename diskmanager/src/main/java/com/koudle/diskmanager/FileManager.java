package com.koudle.diskmanager;

import java.io.File;

/**
 * Created by kl on 17-2-15.
 * file的管理类
 * 1.文件的大小记录
 * 2.文件的删除记录
 */

public class FileManager {
    private static FileManager sFileManagerInstance;

    public static FileManager getInstance(){
        if(sFileManagerInstance == null){
            synchronized (FileManager.class) {
                if(sFileManagerInstance == null) {
                    sFileManagerInstance = new FileManager();
                }
            }
        }
        return sFileManagerInstance;
    }

    public void saveFile(File file){

    }

    public void deleteFile(File file){

    }
}
