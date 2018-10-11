package com.example.pai.dao;


import com.example.pai.entity.Buttons;
import com.example.pai.entity.Cards;
import com.example.pai.entity.Recommend;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class CardsDAO {
    public List<Cards> getCards(){
        Cards[] cards= {
                new Cards("http://pa4uq3179.bkt.clouddn.com/1.1.jpg", "th", "18小时前",
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1",
                        "如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。",
                        "http://pa4uq3179.bkt.clouddn.com/1.png"),
                new Cards("http://pa4uq3179.bkt.clouddn.com/2.2.jpg", "化学心情", "2天前",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "http://pa4uq3179.bkt.clouddn.com/2.jpg"),
                new Cards("http://pa4uq3179.bkt.clouddn.com/3.3.jpg", "th", "18小时前",
                        "Chrome 在 10 周年之际发布了新版，除了好看还更安全",
                        "Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。",
                        "http://pa4uq3179.bkt.clouddn.com/3.jpg"),
                new Cards("http://pa4uq3179.bkt.clouddn.com/4.4.jpg", "waychane", "2天前",
                        "他们做了这款 Kindle 标注管理工具，想为你带来更多读书的价值：专访 Knotes | 幕后",
                        "Knotes 是一款 macOS 和 Windows 平台上设计简洁、功能也非常实用的 Kindle 标注管理工具。软件支持按作者或者书籍等多种方式管理标注和笔记，并且有全文搜索、同步到印象笔记等实用功能，加上自动匹配书籍封面、导出 PDF 等特性，是一款 Kindle 爱好者不能错过的管理工具。",
                        "http://pa4uq3179.bkt.clouddn.com/4.png"),
                new Cards("http://pa4uq3179.bkt.clouddn.com/5.5.jpg", "Adventure", "2天前",
                        "除了课本，你还可以在这些 App 中「涨姿势」",
                        "对身处校园的你来说，与 9 月一同到来的，还有一个崭新的学期。即使你已经毕业，也许还依旧怀揣着遨游知识海洋的梦想。正值开学季，我为你们收集了一些应用，希望能让你无论在校园内外，都能再体验一次知识的趣味。",
                        "http://pa4uq3179.bkt.clouddn.com/5.jpg")
        };
        List<Cards> cardsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cardsList.add(cards[i]);
        }
        return cardsList;
    }
    public List<Buttons> getName(){
        Buttons[] buttons ={new Buttons("正版软件"),
                            new Buttons("付费栏目"),
                            new Buttons("Matrix"),
                            new Buttons("专题广场"),
                            new Buttons("热门文章"),
                            new Buttons("应用推荐"),
                            new Buttons("生活方式"),
                            new Buttons("新玩意")
        };
        List<Buttons> buttonsList = new ArrayList<>();
        for (int i =0;i<buttons.length;i++){
            buttonsList.add(buttons[i]);
        }
        return buttonsList;
    }
    public List<Recommend> getRecs(){
        Recommend[] recommend = {
                new Recommend("玩转Workflow","Workflow 是 iOS 上一款被称为「效率神器」的 App，它以直观的卡片形式大大简化了设置流.....","2020"),
                new Recommend("提升效率之路","一个优秀的工具，能让你在提升效率之路事半功倍。你是如何通过这些工具，技巧提高生产力，改善自己的效率？","1551")
        };
        List<Recommend> recs = new ArrayList<>();
        for (int i=0;i<recommend.length;i++){
            recs.add(recommend[i]);
        }
        return recs;
    }
}
