package com.codestates.notice_project.board.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Board {
    private long boardId;
    private String writer;
    private String comment;
    private BoardStatus boardStatus;

    public Board(long boardId, String writer, String comment) {
        this.boardId = boardId;
        this.writer = writer;
        this.comment = comment;
    }

    public enum BoardStatus{
        BOARD_PUBLIC("게시물 공개"),
        BOARD_PRIVATELY("게시물 비공개"),
        BOARD_DELETE("게시물 삭제");

        private String status;

        BoardStatus(String status){this.status = status;}
    }
}
