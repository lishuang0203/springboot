package com.example.pai.controller;



import com.example.pai.dao.CardsDAO;
import com.example.pai.entity.Buttons;
import com.example.pai.entity.Cards;
import com.example.pai.entity.Recommend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CardController {
    @Resource
    private CardsDAO cardsDAO;

    @GetMapping("pai")
    public String getAll(ModelMap map){
        List<Cards> cardsList = cardsDAO.getCards();
        List<Buttons> buttonsList =cardsDAO.getName();
        List<Recommend> recs =cardsDAO.getRecs();
        map.addAttribute("name",buttonsList);
        map.addAttribute("cardsList",cardsList);
        map.addAttribute("recs",recs);
        return "pai";
    }
}
