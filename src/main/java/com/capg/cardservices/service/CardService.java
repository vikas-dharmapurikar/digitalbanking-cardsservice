package com.capg.cardservices.service;

import java.util.List;

import com.capg.cardservices.model.Card;


public interface CardService {

	public List<Card> getCardListByCustomerId(Integer customerId);
	public Card getCardByNo(Long cardNo);
}
