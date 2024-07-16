package com.smart.lostandfound;

public interface OnImageUploadCallback {
    void onSuccess(String imageUrl);

    void onFailure();
}
