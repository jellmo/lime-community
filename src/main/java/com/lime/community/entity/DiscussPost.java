package com.lime.community.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 讨论贴实体类
 * </p>
 *
 * @author mohe
 * @date 2022-02-21 09:01:23
 */
public class DiscussPost implements Serializable {

    private int id;
    private int userId;
    private String title;
    private String context;
    /**
     * 帖文类型：0-普通; 1-置顶
     **/
    private int type;
    /**
     * 帖文状态：0-正常; 1-精华; 2-拉黑
     **/
    private int status;
    private Date createTime;
    private int commentCount;
    /**
     * 帖文评分：排序标准
     **/
    private double score;

    public DiscussPost() {
    }

    public DiscussPost(int id, int userId, String title, String context, int type, int status, Date createTime, int commentCount, double score) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.context = context;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.commentCount = commentCount;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "DiscussPost{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", createTime=" + createTime +
                ", commentCount=" + commentCount +
                ", score=" + score +
                '}';
    }
}
