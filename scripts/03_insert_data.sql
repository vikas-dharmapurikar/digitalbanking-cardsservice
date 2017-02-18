INSERT INTO customer (customer_id, customer_name, password, last_login, mobile_no, email_id) VALUES
(556677,	'Raja',	'capg123',	NULL,	NULL,	'raja@capgemini.com');

INSERT INTO customer (customer_id, customer_name, password, last_login, mobile_no, email_id) VALUES
(556678,	'Mahesh',	'capg123',	NULL,	NULL,	'mahesh@capgemini.com');

INSERT INTO card (card_no, cvv, expiry_date, card_type, customer_id, card_company, credit_limit, card_status) VALUES
(3624978443870993,	6502,	'2020-12-31',	'CREDIT',	556677,	'VISA',	250000.00,	1);

-- Card transactions inserts 
INSERT INTO public.cards_transaction ( reward_points, tx_date, sno, tx_value, tx_description, tx_type, card_no) VALUES ( '10'::numeric, '2017-02-02'::date, '1'::numeric, '4500'::numeric, 'South India Shopping Mall'::character varying, 'DR'::character varying, '3624978443870993'::numeric);	
INSERT INTO public.cards_transaction ( tx_date, sno, tx_value, tx_description, tx_type, card_no) VALUES ( '2017-02-10'::date, '2'::numeric, '3000'::numeric, 'By Cash'::character varying, 'CR'::character varying, '3624978443870993'::numeric);	
INSERT INTO public.cards_transaction ( reward_points, tx_date, sno, tx_value, tx_description, tx_type, card_no) VALUES ( '10'::numeric, '2017-02-13'::date, '3'::numeric, '6000'::numeric, 'Toys World'::character varying, 'DR'::character varying, '3624978443870993'::numeric);	

