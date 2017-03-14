package com.capg.cardservices.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.cardservices.model.Card;
import com.capg.cardservices.model.Transaction;
import com.capg.cardservices.service.CardService;
/***
 * Controller for Card services
 * @author sujillel
 *
 */
@RestController
@ComponentScan("com.capg.cardservices")
@EnableAutoConfiguration
public class CardServicesController {
	static Logger logger = Logger.getLogger(CardServicesController.class);

	@Autowired
	private CardService cardService;
	
	@CrossOrigin
	@RequestMapping(value="/cardservices/{customerId}/cards",method = RequestMethod.GET)
	public List<Card> getCardList(@PathVariable  Integer customerId) {
		if(customerId == null) {
			logger.warn("Invalid customerId for getCardListByCustomerId : "+customerId);
			return null;
		}
		logger.info("Request Mapped");
    	return cardService.getCardListByCustomerId(customerId);
    }
	
	@CrossOrigin
	@RequestMapping(value="/cardservices/{cardNo}/card",method = RequestMethod.GET)
	public Card getCardDetails(@PathVariable  Long cardNo) {
		if(cardNo == null) {
			logger.warn("Invalid customerId for getCardByNo : "+cardNo);
			return null;
		}
		logger.info("Request Mapped");
    	return cardService.getCardByNo(cardNo);
    }
	
	@RequestMapping(value="/cardservices/{cardNo}/{startDate}/{endDate}/getRecentTransactions"
			,method = RequestMethod.POST)
	public List<Transaction> getRecentTransactions(@PathVariable Long cardNo
			, @PathVariable String startDate
			, @PathVariable String endDate) {
		logger.info("Request Mapped");
		return cardService.getRecentTransactions(cardNo, startDate, endDate);
	}
}