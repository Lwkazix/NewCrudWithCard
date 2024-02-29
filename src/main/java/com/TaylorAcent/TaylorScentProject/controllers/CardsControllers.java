package com.TaylorAcent.TaylorScentProject.controllers;

import com.TaylorAcent.TaylorScentProject.models.CardModels;
import com.TaylorAcent.TaylorScentProject.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/homeCard")
public class CardsControllers {
    @Autowired
    private CardsService cardsService;


    @GetMapping("/list")
    public String showCardDBA(Model model) {
        List<CardModels> cardsNew = cardsService.findAllCards();
        model.addAttribute("cardsNew", cardsNew);
        return "scent/scent";
    }

    @GetMapping("/addCardList")
    public String addCardList(Model model){
        CardModels cardModels = new CardModels();
        model.addAttribute("cards",cardModels);
        return "scent/addScent";
    }
    @PostMapping("/postNewCard")
    public String postnewCard(@ModelAttribute("cards")CardModels cardModels){
        cardsService.saveNewCard(cardModels);
        return "redirect:/homeCard/list";
    }
    @GetMapping("/searchCard/{id}")
    public String search(@PathVariable("id") Integer id, Model model) {
       Optional<CardModels> card = cardsService.cardSearch(id);
       if (card.isPresent()){
           model.addAttribute("cards",card.get());
           return "scent/addScent";
       }else {
           return "redirect:/homeCard/list";
       }
    }
}
