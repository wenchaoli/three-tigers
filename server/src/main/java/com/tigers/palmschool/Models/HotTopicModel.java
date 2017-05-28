package com.tigers.palmschool.Models;

/**
 * Created by wenchaol on 5/23/2017.
 */
public class HotTopicModel {

    private Integer Rank;

    private String Forum;

    private String Title;

    private String Author;

    private Integer CommentCount;

    public HotTopicModel(Integer rank, String forum, String title, String author, Integer commentCount) {
        this.Rank = rank;
        this.Forum = forum;
        this.Title = title;
        this.Author = author;
        this.CommentCount = commentCount;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer rank) {
        Rank = rank;
    }

    public String getForum() {
        return Forum;
    }

    public void setForum(String forum) {
        Forum = forum;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Integer getCommentCount() {
        return CommentCount;
    }

    public void setCommentCount(Integer commentCount) {
        CommentCount = commentCount;
    }
}
