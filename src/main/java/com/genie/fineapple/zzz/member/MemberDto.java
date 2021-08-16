package com.genie.fineapple.zzz.member;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberDto {

    private String name;
    private String email;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .email(email)
                .build();
    }
}
