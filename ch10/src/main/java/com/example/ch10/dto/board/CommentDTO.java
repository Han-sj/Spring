package com.example.ch10.dto.board;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CommentDTO {

    private int cno;
    private int parent;     // 댓글의 부모 글 번호
    private String content;
    private String writer;

    private String wdate;




}
