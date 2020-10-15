package com.example.restfulapi.web.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//setter, getter, toString 자동 생성
@AllArgsConstructor // 클래스 안에 존재하는 모든 필드에 대한 생성자를 자동 생성
@NoArgsConstructor // 파라미터가 없는 기본생성자를 자동 생성
public class HelloWorldBean {
    private String message;


}
