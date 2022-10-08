package com.codestates.notice_project.board.controller;

import com.codestates.notice_project.board.dto.BoardDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/boards")
public class boardController {

    // 게시글 게시
    @PostMapping
    public ResponseEntity postBoard(@RequestBody BoardDto.Post postDto){
        return new ResponseEntity<>(postDto, HttpStatus.CREATED);
    }

    // 게시글 수정
    @PatchMapping("/{board-id}")
    public ResponseEntity patchBoard(@PathVariable("board-id") long boardId,
                                     @RequestBody BoardDto.Patch patchDto){
        return new ResponseEntity<>(patchDto, HttpStatus.OK);
    }

    // 게시글 조회
    @GetMapping("/{board-id}")
    public ResponseEntity getBoard(@PathVariable("board-id") long boardId){
        System.out.println("# boardId : " + boardId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 게시글 전체 조회
    @GetMapping
    public ResponseEntity getBoards(){
        System.out.println("# get Boards");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 게시글 삭제
    @DeleteMapping("/{board-id}")
    public ResponseEntity deleteBoard(@PathVariable("board-id") long boardId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
