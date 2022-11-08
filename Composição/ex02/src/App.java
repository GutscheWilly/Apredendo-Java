import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import post.Post;
import post.compositions.Comment;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDateTime date = LocalDateTime.parse("21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String title = "Traveling to Zealand";
        String content = "I'm going to visit this wonderful country";
        Integer likes = 12;
        Post post1 = new Post(date, title, content, likes);
        Comment comment = new Comment("Have a nice trip");
        post1.addComment(comment);
        comment = new Comment("Wow that is awesome!");
        post1.addComment(comment);

        date = LocalDateTime.parse("28/07/2018 23:14:19", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        title = "Good night guys!";
        content = "See you tomorrow!";
        likes = 5;
        Post post2 = new Post(date, title, content, likes);
        comment = new Comment("Good night");
        post2.addComment(comment);
        comment = new Comment("May the force be with you!");
        post2.addComment(comment);
        
        System.out.println(post1);
        post1.showAllComments();
        System.out.println();
        System.out.println(post2);
        post2.showAllComments();
    }
}
