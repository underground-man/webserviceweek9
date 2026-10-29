# 프로젝트명
week9
## 1. 프로젝트 소개
이번 프로젝트는 jpa를 사용하여 기존에는 개발자가 직접 만들던 repsotitory class를 jpa가 대신 관리해주는 프로젝트이다.
개발자에게 이점은 추상적인 interface만 제작해도 된다.

## 2. Entity 필드 구조
| 필드 | 자료형 | DB 컬럼 | 설정 |
|---|---|---|---|
| `id` | `Long` | `id` | PK, AUTO_INCREMENT |
| `title` | `String` | `title` | 필수, 최대 100자 |
| `director` | `String` | `director` | 필수, 최대 100자 |
| `genre` | `String` | `genre` | 최대 50자 |
| `releaseYear` | `Integer` | `release_year` | 개봉 연도 |
| `rating` | `Double` | `rating` | 영화 평점 |
| `runningTime` | `Integer` | `running_time` | 상영 시간 |

## 3. 프로젝트 구조 및 개발 환경
week9/
├─ Dockerfile
├─ build.gradle
├─ settings.gradle
├─ gradlew
├─ gradlew.bat
├─ README.md
│
├─ gradle/
│  └─ wrapper/
│     └─ gradle-wrapper.properties
│
└─ src/
├─ main/
│  ├─ java/
│  │  └─ org/example/webui/week9/
│  │     ├─ Week9Application.java
│  │     │
│  │     ├─ entity/
│  │     │  └─ Movie.java
│  │     │
│  │     ├─ repository/
│  │     │  └─ MovieRepository.java
│  │     │
│  │     ├─ service/
│  │     │  └─ MovieService.java
│  │     │
│  │     └─ controller/
│  │        └─ MovieController.java
│  │
│  └─ resources/
│     └─ application.properties
│
└─ test/
└─ java/
└─ org/example/webui/week9/
└─ Week9ApplicationTests.java

개발환경

Java: JDK 17
Spring Boot: 4.1.2
빌드 도구: Gradle 9.8.2
웹: Spring Web
ORM: Spring Data JPA, Hibernate
DB 드라이버: MariaDB
IDE: IntelliJ IDEA
DB 관리 도구: DBeaver
API 테스트: Postman
배포: Render, Dockerfile

## 4. GitHub 및 Render URL

## 5. Database SQL Practice



### 기존 테이블 조회 및 데이터 추가

### movie_sql 테이블 생성

![movie_sql 테이블 생성](<img/스크린샷 2026-10-30 053547.png>)

![movie_sql 테이블 구조 확인](<img/스크린샷 2026-10-30 053558.png>)

### INSERT

![movie_sql INSERT 실행](<img/스크린샷 2026-10-30 053608.png>)

![movie_sql INSERT 결과](<img/스크린샷 2026-10-30 053621.png>)

### UPDATE

![movie_sql UPDATE 실행](<img/스크린샷 2026-10-30 053632.png>)

![movie_sql UPDATE 결과](<img/스크린샷 2026-10-30 053721.png>)

### DELETE

![movie_sql DELETE 실행 결과](<img/스크린샷 2026-10-30 053734.png>)

### SELECT

![movie_sql 일부 컬럼 조회](<img/스크린샷 2026-10-30 053742.png>)

![movie_sql 조건 조회](<img/스크린샷 2026-10-30 053758.png>)

## 6. Spring Data JPA 구현



### Entity

![JPA movies 테이블 구조](<img/스크린샷 2026-10-30 053451.png>)

### JpaRepository
### REST API 목록
### 요청 및 응답 JSON

![POST 등록 요청 및 응답](<img/스크린샷 2026-10-30 052050.png>)

![GET 전체 조회 요청 및 응답](<img/스크린샷 2026-10-30 052114.png>)

![PUT 수정 요청 및 응답](<img/스크린샷 2026-10-30 052201.png>)

![DELETE 요청 및 204 응답](<img/스크린샷 2026-10-30 052225.png>)

![삭제된 ID 404 응답](<img/스크린샷 2026-10-30 052240.png>)

### JPA Entity와 MariaDB 테이블 비교

![POST 이후 MariaDB 저장 확인](<img/스크린샷 2026-10-30 052056.png>)

![PUT 이후 MariaDB 수정 확인](<img/스크린샷 2026-10-30 052209.png>)

![DELETE 이후 MariaDB 삭제 확인](<img/스크린샷 2026-10-30 052231.png>)

## 7. JPA와 SQL 비교

### save()

![save INSERT SQL](<img/스크린샷 2026-10-30 053300.png>)

### findAll()

![findAll SELECT SQL](<img/스크린샷 2026-10-30 053303.png>)

### findById()

![findById SELECT WHERE SQL](<img/스크린샷 2026-10-30 053306.png>)

### deleteById()

![deleteById DELETE SQL](<img/스크린샷 2026-10-30 053311.png>)

### Hibernate SQL 확인

![Hibernate UPDATE 및 SELECT SQL](<img/스크린샷 2026-10-30 052850.png>)

![Hibernate UPDATE SQL](<img/스크린샷 2026-10-30 053309.png>)

## 8. 배포 및 환경 설정

### IntelliJ 환경변수
### Render 환경변수
### Render 배포 과정
### 배포 URL CRUD 결과
### MariaDB 저장 확인
### 발생한 문제와 해결 방법

## 9. Weekly Report

### Key Learning
이번 프로젝트에서 jpa를 사용하는 방법과 또 그 과정을 알수 있었다. postman, mariaDB, Dbeaver를 사용하면서 url간의 사용방식을 
더 자세하게 알수 있었다. 이번 과제중 가장 기억나는 핵심은 사실 맨처음 mariaDB를 사용하기 위해 선행되어야 했던 구성편집, 환경변수
작업이였다. 코딩외에 따로 찾아봐야 할정도의 밑작업은 처음이였다.

### Problem & Solution
postman으로 테스트중 캡쳐찍는거 까먹어서 다시 진행했다.
import 작성중 *가 하위 패키지는 가져오지 않는다는 것을 몰라서. 상위패키지에 *을 사용해 실행이 불가능했었다. 하위 패키지가 있는경우는 
다시 직접 지정하였다.


### Code Review
http 요청 코드나 다른 핵심 알고리즘은 이미 저번 과제들에서 서술했으니. 이번 과제의 특징인 Jpa의 코드 부분에 대해서 설명하고싶다.
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String director;

    @Column(length = 50)
    private String genre;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column
    private Double rating;

    @Column(name = "running_time")
    private Integer runningTime;
}


기존에는 Movie가 단순한 java객체로서 프로그램 종료시 데이터가 소멸되었다.
또 이전 sql/jdbc 방식에서는 CRUD 핵심 작업을 직접 매핑해야했다.
jpa에서는 Movie 클래스에 매칭 정보 작성시 Hibernate가 직점 Maria DB 테이블을 매핑해준다.

@Entity는 jpa에서 처음 보는 어노테이션인데,
이것은 객체가아닌 jpa 관리하의 entity로 지적시킨다.
@Id는 Entity와 테이블의 기본키를 지정하는 어노테이션이다.


### AI Usage
ai는 pdf를 보여준뒤 pdf에서 사용되는 코드로만 나에게 조언을 해줄것을 
부탁하였다. 또 밑작업중 세팅시 막혔을시, 해결법을 물어보았다.


### Reflection
이번에는 Jpa를 사용해 프로그램 종료 시에도 내용이 사라지지 않고
더 나아가 repository 관리 및 매핑을 개발자 대신 
맡아주는 방식을 배웠다.

프로그램이 한층더 깔끔해지고 확실히 파일이 줄어든건 좋은데, 주차 마다 배우는게 달라지니 머리아프다

