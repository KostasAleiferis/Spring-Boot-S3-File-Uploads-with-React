package com.kostas.aws_image_upload.bucket;

public enum BucketName {

    PROFILE_IMAGE("kostas-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
