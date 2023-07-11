# spring-level4
Spring Security를 적용한 나만의 블로그 백엔드 서버 만들기

## Convention
### code
- setter 사용을 제한한다.
- 변수명은 CamelCase로 한다.
- 변수명이나 메서드명에 줄임말을 사용하지 않는다.
- 한 줄에 점을 2~3개 이내로 찍는다.
- 메서드와 메서드 사이에 공백 라인을 한 라인 둔다.
- DTO는 협의 후에 추가 및 수정한다.

### commit message
[커밋 메세지 컨벤션](https://velog.io/@archivvonjang/Git-Commit-Message-Convention)을 참고하자

## ERD
<img width="737" alt="스크린샷 2023-07-04 오후 11 27 45" src="https://github.com/thing-zoo/spring-level3/assets/62596783/aca3d645-64ef-464c-b691-817f0da7f1f1">

## API 명세
[GitBook API 명세서](https://thing-zoo-world.gitbook.io/my-blog/)

## 코드리뷰
1. Spring Security를 적용했을 때 어떤 점이 도움이 되셨나요?
    
    ```
    로그인을 Spring Security가 알아서 처리해준다.
    JWT 토큰 인증 및 인가 과정이 단순해졌다.
    토큰에 있는 정보를 가져오기 쉽다.
    ```
    
2. IoC / DI 에 대해 간략하게 설명해 주세요!  - Lv.2의 답변을 Upgrade 해 주세요!
    
    ```
    싱글턴으로 생성해 메모리와 중복 생성을 막고 의존성 주입을 통해 클래스마다 객체성을 부여해주는 것
    ```
    
3. JWT를 사용하여 인증/인가를 구현 했을 때의 장점은 무엇일까요? - Lv.2의 답변을 Upgrade 해 주세요!
    
    ```
    Sercurity코드 하나로 모든 걸 해결할 수 있기 때문에,
    여러 서버에서 동일한 토큰을 사용하기가 쉽고, 패킹과 해체가 간단하다.
    동시 접속자가 많을 때 서버 측 부하를 낮출 수 있다.
    ```
    
4. 반대로 JWT를 사용한 인증/인가의 한계점은 무엇일까요? - Lv.2의 답변을 Upgrade 해 주세요!
    
    ```
    보안성이 없어 아무 정보나 넣을 수 없고, 탈취 당했을 때, 보안의 의미가 사라진다는 단점,
    여러 토큰을 사용해 보안성을 높여야 하므로, 헤더가 무거워지는 등의 단점이 있습니다.
    ```
