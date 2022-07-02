package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller view 반환
@Slf4j
@RestController // 메시지바디 데이터 반환, restAPI에서 사용
public class LogTestController {
    
//    private final Logger log = LoggerFactory.getLogger(getClass()); -> @Slf4j

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        System.out.println("name = " + name);
        log.info(" info log=" + name);//info log=spring 다음 info 실행, 비권장
        
        
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);
        log.info(" info log={}", name);// 파라미터만 보내서 info 실행

        return "ok";
    }
}
