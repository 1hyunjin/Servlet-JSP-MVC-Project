package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    // 밑의 주석 만드는 방법 : /** + enter
    /**
     *
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
