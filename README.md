# jpa-query-builder

- SQL 쿼리 빌더 구현
  - Step1
    - 요구 사항
      - [x] 1 : 클래스 정보 출력
      - [x] 2 : test로 시작하는 메소드 실행
      - [x] 3 :  @PrintView 애노테이션 메소드 실행
      - [x] 4 : private field에 값 할당
      - [x] 5 : 인자를 가진 생성자의 인스턴스 생성
  - Step2
    - 요구 사항
      - [x] 1 : Entity 클래스에 @Entity, @Id 가 있는 클래스 Create 쿼리 만들기
      - [x] 2 : Entity 클래스에 @Enttiy, @Id, @GeneratedValue, @Column이 있는 클래스 Create 쿼리 만들기 (Column DDL은 따로 클래스를 만들어서 처리)
      - [x] 3 : Entity 클래스에 @Enttiy, @Id, @GeneratedValue, @Column, @Transient이 있는 클래스 Create 쿼리 만들기
      - [x] 4 : Entity를 가지고 Drop Table 쿼리 만들기
    - 추가 구현
      - [x] 테스트 코드 추가
      - [x] 인터페이스 추가
  - Step3
    - 요구 사항 및 기능 구현
      - [x] 1 : insert 구현해보기
        - [x] 테스트코드 작성
        - [x] EntityColumnName 클래스 추가로 인한 Step2 ColumnName 객체 활용 및 테스트 코드 에러 수정
        - [x] ColumnValue가 String일 경우 추가 처리 ('' 추가)
      - [x] 2 : 모두 조회(findAll) 기능 구현해보기
        - [x] EntityColumnNames 추가
      - [x] 3 : 단건 조회(findById) 기능 구현해보기
      - [x] 4 : delete 쿼리 구현
  - Step4
    - 요구사항 및 기능 구현
      - [x] 1 : Entity find 구현
      - [x] 2 : Entity Persists 구현
      - [x] 3 : Entity Remove 구현
      - [] 4 : Entity Update 구현
