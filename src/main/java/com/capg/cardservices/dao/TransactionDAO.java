package com.capg.cardservices.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.cardservices.model.Transaction;

@Repository
@Transactional
public interface TransactionDAO extends JpaRepository<Transaction ,Long> {
	
	@Query("SELECT p FROM Transaction p WHERE cardNo = ?1 "
			+ "and transactionDate between ?2 AND ?3 ORDER BY transactionDate DESC ")
	List<Transaction> getTransactions(Long cardNo, Date startDate, Date endDate);
}