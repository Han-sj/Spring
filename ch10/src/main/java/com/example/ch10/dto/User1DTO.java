package com.example.ch10.dto;

import com.example.ch10.entity.User1;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User1DTO {
    private String userid;
    private String name;
    private String hp;
    private int age;

    // Entity 변환 메서드
    public User1 toEntity(){
        return User1.builder()
                .userid(userid)
                .name(name)
                .hp(hp)
                .age(age)
                .build();
    }
}