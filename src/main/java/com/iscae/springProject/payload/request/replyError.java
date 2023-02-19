package com.iscae.springProject.payload.request;

public class replyError {
    private String reply;

    public replyError(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
