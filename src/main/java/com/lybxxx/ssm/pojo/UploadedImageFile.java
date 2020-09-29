package com.lybxxx.ssm.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author lybxxx
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
