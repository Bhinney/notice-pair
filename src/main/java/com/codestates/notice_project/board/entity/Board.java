package com.codestates.notice_project.board.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardId;

    @Column(length = 100, nullable = false)
    private String writer;

    @NotBlank
    private String comment;

    @Enumerated(value = EnumType.STRING)
    @Column(length = 50, nullable = false)
    private BoardStatus boardStatus = BoardStatus.BOARD_PUBLIC;

    public Board(long boardId, String writer, String comment) {
        this.boardId = boardId;
        this.writer = writer;
        this.comment = comment;
    }

    public enum BoardStatus{
        BOARD_PUBLIC("게시물 공개"),
        BOARD_PRIVATELY("게시물 비공개"),
        BOARD_DELETE("게시물 삭제");

        @Getter
        private String status;

        BoardStatus(String status){this.status = status;}
    }
}
