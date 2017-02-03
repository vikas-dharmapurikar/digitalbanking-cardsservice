package com.capg.cardservices.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.cardservices.dao.CardDAO;
import com.capg.cardservices.model.Card;
import com.capg.cardservices.service.CardService;
import com.capg.cardservices.web.CardServicesController;
/***
 * Service layer for getting the card details from DB
 * @author sujillel
 *
 */
@Service
public class CardServiceImpl implements CardService {
	static Logger logger = Logger.getLogger(CardServicesController.class);

	@Autowired
	private CardDAO cardDao;
	
	@Override
	public List<Card> getCardListByCustomerId(Integer customerId){
		if(customerId == null) {
			logger.warn("Invalid customerId for finding card list By CustomerId : "+customerId);
			return null;
		}
		
		List<Card> cardList= cardDao.findByCustomerId(customerId);
		int size=cardList.size();
		logger.info("Cards count found for the customer : "+size);
		return cardList;
	}
	
	@Override
	public Card getCardByNo(Long cardNo){
		if(cardNo == null) {
			logger.warn("Invalid CardNo for finding card By CardNo : "+cardNo);
			return null;
		}
		return cardDao.findByCardNo(cardNo);
	}
}