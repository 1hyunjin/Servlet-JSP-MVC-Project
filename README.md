# SpringMVC_Servlet - 회원 관리 웹 애플리케이션
## Servlet -> JSP -> MVC 패턴으로 리팩토링

### Servlet

- 동적인 HTML을 만드는 일이 불가능
- 매우 복잡, 비효율적

→ 템플릿 엔진이 나온 이유 (템플릿 엔진: JSP, Thymeleaf 등)

### JSP

- 뷰를 생성하는 HTML 작업을 깔끔하게 가져가고 중간중간 동적으로 변경이 필요한 부분만 자바 코드 적용
- 비즈니스 로직 영역과 뷰 영역이 함께 존재 → 모두 JSP 에 노출됨 → 너무 많은 역할

### Servlet과 JSP 는 너무 많은 역할을 수행

- 비즈니스 로직과 뷰 렌더링까지 모두 처리 → 유지보수 어려움

**→ MVC 패턴이 등장**

### MVC 패턴

- **Model**
    - view에 출력할 데이터를 담아둔다.
    - 모델이 있어 뷰는 비즈니즈 로직이나 데이터 접근을 몰라도 된다.
- **View**
    - 화면을 그리는 일 (HTML을 생성하는 부분)
- **Controller**
    - HTTP 요청을 받아서 파라미터를 검증
    - 비즈니스 로직을 실행
    - 뷰에 전달할 결과 데이터를 조회해서 모델에 담는다.

비즈니스 로직은 서비스(Service) 라는 계층을 별도로 만들어서 처리.
** MVC 패턴은 Servlet, JSP로 처리하던 것을 Controller와 View라는 영역으로 역할을 나눈 것.

### MVC 패턴 구조 
![Untitled (2)](https://user-images.githubusercontent.com/38430900/230017033-93e7316e-a82e-44cd-a7f3-79d0833fd247.png)

### MVC 패턴의 한계

#### MVC 컨트롤러의 단점

- forward 중복
    - View로 이동하는 코드가 항상 중복 호출되어야 한다.
- ViewPath에 중복
- **공통 처리가 어렵다.**

→ 이 문제를 해결하려면 controller 호출 전에 먼저 공통 기능을 처리해야 한다.

수문장 역할하는 기능이 필요 → **프론트 컨트롤러 패턴**

### Front Controller
#### Front Controller Pattern 특징

- 프론트 컨트롤러 서블릿 하나로 클라이언트의 요청을 받음
- 프론트 컨트롤러가 요청에 맞게 컨트롤러를 찾아서 호출
- 입구 하나 → 공통 처리가 가능
- 프론트 컨트롤러를 제외한 나머지 컨트롤러는 서블릿을 사용하지 않아도 됨

#### 스프링 웹 MVC와 Front Controller

- 스프링 웹 MVC의 핵심 = Front Controller
- DispatcherServlet이 Front Controller 패턴으로 구현되어 있음

### Refactoring

[Front Contoller_V1](https://www.notion.so/Front-Contoller_V1-a37f12eb20454f778a6c6b7692752bad)

[Front Controller_V2](https://www.notion.so/Front-Controller_V2-273927d3a6de467aa08532b61af6852e)

[Front Controller_V3](https://www.notion.so/Front-Controller_V3-6153c47272a24e558f69dbe655bdf448)

[Front Controller_V4](https://www.notion.so/Front-Controller_V4-02fceeffd7f645d9bd1dab38b317b058)

[Front Controller_V5](https://www.notion.so/Front-Controller_V5-87812d35a09e4d26a14889fc69a98a7b)

notion 
servlet, JSP : https://leah-space.notion.site/JSP-94cc62a805c54e85b9051d2c24fbba06
MVC Pattern : https://leah-space.notion.site/MVC-dced10ed87064c7389c7cdc89d716d3b
FrontController : 위 버전들 클릭 
강의 : https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1/dashboard
