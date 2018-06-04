package jhaywoo2.depaul.studentlife.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comment {
    String commentId;
    String professorId;
    String comment;

    public Comment() {
    }

    public Comment(String commentId, String professorId, String comment) {
        this.commentId = commentId;
        this.professorId = professorId;
        this.comment = comment;
    }


    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comment{");
        sb.append("commentId='").append(commentId).append('\'');
        sb.append(", professorId='").append(professorId).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
