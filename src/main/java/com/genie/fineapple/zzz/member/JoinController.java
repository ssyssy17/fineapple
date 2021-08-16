package com.genie.fineapple.zzz.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/join")
@RequiredArgsConstructor
@Slf4j
public class JoinController {

    private final MemberRepository memberRepository;

    @GetMapping(value = "/")
    public String joinPage() { return "member/join"; }

    @PostMapping(value = "/new")
    public String newMember(MemberDto memberDto) {
        log.debug(memberDto.toString());

        Member member = memberDto.toEntity();
        memberRepository.save(member);

        return "";
    }
}
