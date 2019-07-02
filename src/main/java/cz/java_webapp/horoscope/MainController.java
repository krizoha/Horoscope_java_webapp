package cz.java_webapp.horoscope;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class MainController {

    ZodiacRepository repo = new ZodiacRepository();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView zobrazIndex() {
        ModelAndView dataHodler = new ModelAndView("index");
        return dataHodler;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView zobrazResult(IndexForm entryData) {
        ModelAndView dataHodler = new ModelAndView("result");

        dataHodler.addObject("signOfZodiac", entryData.getSign());
        dataHodler.addObject("prediction", repo.findHoroscope(entryData.getSign()));

        return dataHodler;
    }

}
