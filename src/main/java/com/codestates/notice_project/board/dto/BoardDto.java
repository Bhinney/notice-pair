package com.codestates.notice_project.board.dto;

import com.codestates.notice_project.board.entity.Board;
import lombok.*;

public class BoardDto {

    @Getter
    public static class Post{
        private String writer;
        private String comment;
    }

    @Getter @Setter
    public static class Patch{
        private long boardId;
        private String writer;
        private String comment;
        private Board.BoardStatus boardStatus;
    }

    @Getter
    public static class Response{
        private long boardId;
        private String writer;
        private String comment;
        private Board.BoardStatus boardStatus;
    }
}
