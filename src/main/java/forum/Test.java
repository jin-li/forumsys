package forum;

import forum.bean.Comment;
import forum.dao.iCommentDAO;
import forum.service.CommentDAO;


public class Test {
  public static void main(String[] args) throws Exception {
    iCommentDAO icommentdao = new CommentDAO();
    Comment comment = new Comment();
    comment.setPost_id(14);
    comment.setAuthor("user1");
    comment.setContent("怎么有人没水啊？！");
    icommentdao.create(comment);
  }
}