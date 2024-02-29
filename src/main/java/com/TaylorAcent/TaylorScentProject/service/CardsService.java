package com.TaylorAcent.TaylorScentProject.service;

import com.TaylorAcent.TaylorScentProject.models.CardModels;
import com.TaylorAcent.TaylorScentProject.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CardsService {
    @Autowired
    private CardsRepository cardsRepository;

    public List<CardModels> findAllCards() {
        return cardsRepository.findAll();
    }
    public CardModels saveNewCard(CardModels cardModels){
       return cardsRepository.save(cardModels);
    }
   public Optional<CardModels> cardSearch(Integer id){
        return cardsRepository.findById(id);
   }
}
