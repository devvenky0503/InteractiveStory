package com.dreamsolv.interactivestory.model;

/**
 * Created by Dream on 29/05/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(){}
    public Choice(String text, int nextPage) {
        mNextPage = nextPage;
        mText = text;
    }
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
