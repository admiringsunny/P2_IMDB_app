package com.acadgild.P2.IMDB;

/* a POJO class */
public class Detail {

    private String mTextView;
    private String mTextView1;
    private String mTextView3;
    private String mTextView4;
    private String mTextView2;
    private String mImageView;

    public Detail(String textView, String textView1, String textView2, String textView3, String textView4, String imageView) {

        mTextView = textView;
        mTextView1 = textView1;
        mTextView2 = textView2;
        mTextView3 = textView3;
        mTextView4 = textView4;
        mImageView = imageView;
    }

    public String getTextView() {
        return mTextView;
    }

    public String getTextView1() {
        return mTextView1;
    }

    public String getTextView2() {
        return mTextView2;
    }

    public String getTextView3() {
        return mTextView3;
    }

    public String getmTextView4() {
        return mTextView4;
    }

    public String getimageView() {
        return mImageView;
    }
}
