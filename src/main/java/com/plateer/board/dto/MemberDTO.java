package com.plateer.board.dto;

import lombok.Data;

@Data
public class MemberDTO {
    private int id;
    private String email;
    private String password;
    private String name;
    private String authority;
}
