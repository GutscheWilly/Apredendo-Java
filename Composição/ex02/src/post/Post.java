package post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import post.compositions.*;

public class Post {
    
    private LocalDateTime date;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comment> comments;

    public Post(LocalDateTime date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
        comments = new ArrayList<Comment>();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("%s\n%d likes - %s\n%s", title, likes, date.format(formatter), content);
    }

    public void showAllComments() {
        System.out.println("Comments:");
        for (Comment comment : comments) {
            System.out.println(comment.getText());
        }
    }
}
