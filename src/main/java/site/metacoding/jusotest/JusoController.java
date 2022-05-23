package site.metacoding.jusotest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JusoController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/juso/popup", method = { RequestMethod.GET, RequestMethod.POST })
    public String jusoPopup(Model model, String roadFullAddr) {

        String jusoUrl = "https://www.juso.go.kr/addrlink/addrLinkUrl.do";
        String confmKey = "devU01TX0FVVEgyMDIyMDUyMzEwNDgzNTExMjYwMDA=";
        String returnUrl = "http://localhost:8080/juso/popup";
        String resultType = "4";

        if (roadFullAddr == null) {
            roadFullAddr = "N";
        }

        model.addAttribute("roadFullAddr", roadFullAddr);
        model.addAttribute("jusoUrl", jusoUrl);
        model.addAttribute("confmKey", confmKey);
        model.addAttribute("returnUrl", returnUrl);
        model.addAttribute("resultType", resultType);

        return "jusoPopup";
    }

    @PostMapping("/juso/callback")
    public void jusoCallback(String roadFullAddr) {
        System.out.println(roadFullAddr);
    }
}
