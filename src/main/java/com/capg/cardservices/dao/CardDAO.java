
package com.capg.cardservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.cardservices.model.Card;

@Repository
@Transactional
public interface CardDAO extends JpaRepository<Card,Long> {
	 	
	public List<Card> findByCustomerId(Integer customerId);
	public Card findByCardNo(Long cardNo);
}
