package com.koudle.diskmanager.data;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by kl on 17-2-15.
 * 磁盘文件pojo
 */
@Entity
public class DiskFile {
    @Id
    private Long id;

    //文件名
    private String fileName;
    //文件路径
    private String filePath;
    //文件大小
    private String fileSize;
    //文件的MD5
    private String fileMD5;
    //文件的过期时间
    private String expireTime;
    @Generated(hash = 865889933)
    public DiskFile(Long id, String fileName, String filePath, String fileSize,
            String fileMD5, String expireTime) {
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
        this.fileMD5 = fileMD5;
        this.expireTime = expireTime;
    }
    @Generated(hash = 1157369851)
    public DiskFile() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFileName() {
        return this.fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFilePath() {
        return this.filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public String getFileSize() {
        return this.fileSize;
    }
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
    public String getFileMD5() {
        return this.fileMD5;
    }
    public void setFileMD5(String fileMD5) {
        this.fileMD5 = fileMD5;
    }
    public String getExpireTime() {
        return this.expireTime;
    }
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
