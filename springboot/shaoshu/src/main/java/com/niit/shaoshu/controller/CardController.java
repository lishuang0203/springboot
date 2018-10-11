package com.niit.shaoshu.controller;


import com.niit.shaoshu.entity.Cards;
import com.niit.shaoshu.dao.CardsDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
public class CardController {
    @Resource
    private CardsDAO cardsDAO;

    @GetMapping("/pai")
    public String getAll(ModelMap map){
        List<Cards> cardsList = cardsDAO.getCards();

        map.addAttribute("cardsList",cardsList);
        return "pai";
    }
}
