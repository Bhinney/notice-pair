package com.codestates.notice_project.Member.controller;

import com.codestates.notice_project.Member.dto.MemberDto;
import com.codestates.notice_project.Member.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/members")
@Validated
public class MemberController {

    private MemberService memberService;
//    private MemberMapper mapper;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //Member 생성
    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberDto.Post requestBody) {

        return null;
    }

    //Member 수정
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Positive long memberId,
                                      @Valid @RequestBody MemberDto.Patch requestBody) {
        return null;
    }

    //Member 조회
    @GetMapping("{/member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") @Positive long memberId) {
        return null;
    }

    //Member 목록 조회
    @GetMapping
    public ResponseEntity getMembers(@Positive @RequestParam int page,
                                     @Positive @RequestParam int size) {
        return null;
    }

    //Member 삭제
    @DeleteMapping("{/member-id}")
    public ResponseEntity deleteMember() {
        return null;
    }
}
