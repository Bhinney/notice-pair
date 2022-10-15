package com.codestates.notice_project.Member.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private long memberId;
    private String name;
    private String password;
    private String email;
}
