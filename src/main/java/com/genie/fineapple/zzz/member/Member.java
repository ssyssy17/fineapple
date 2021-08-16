package com.genie.fineapple.zzz.member;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String email;
}
