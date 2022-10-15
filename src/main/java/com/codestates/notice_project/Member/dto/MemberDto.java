package com.codestates.notice_project.Member.dto;

import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class MemberDto {

    public class Post {

        @NotBlank(message = "이름을 입력하세요.")
        private String name;

        @NotBlank
        private String password;

        @NotBlank
        @Email
        private String email;
    }

    @Setter
    public class Patch {

        private long memberId;

        @NotBlank(message = "이름을 입력하세요.")
        private String name;

        @NotBlank
        private String password;

        @NotBlank
        @Email
        private String email;
    }

    public class Response {

        private long memberId;
        private String name;
        private String email;
    }
}
