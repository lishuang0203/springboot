package com.niit.shaoshu.dao;

import com.niit.shaoshu.entity.Cards;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Data
public class CardsDAO {
    public List<Cards> getCards(){
        Cards[] cards= {
                new Cards("1.jpeg", "th", "18小时前",
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1",
                        "如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。",
                        "3.png"),
                new Cards("2.jpg", "化学心情", "2天前",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "4.png"),
                new Cards("1.jpeg", "th", "18小时前",
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1",
                        "如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。",
                        "3.png"),
                new Cards("2.jpg", "化学心情", "2天前",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "4.png"),
                new Cards("1.jpeg", "th", "18小时前",
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1",
                        "如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。",
                        "3.png"),
                new Cards("2.jpg", "化学心情", "2天前",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "4.png")
        };
        List<Cards> cardsList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            cardsList.add(cards[i]);
        }
        return cardsList;
    }
}
