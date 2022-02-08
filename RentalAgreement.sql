SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Contract;
DROP TABLE IF EXISTS Office;




/* Create Tables */

CREATE TABLE Contract
(
	Contract_no varchar(255) NOT NULL,
	Contract_car_num varchar(255) NOT NULL,
	Contract_start_office_no char(3),
	Contract_start_km varchar(255) NOT NULL,
	Contract_end_office_no char(3),
	Contract_end_km varchar(255) NOT NULL,
	PRIMARY KEY (Contract_no)
);


CREATE TABLE Office
(
	Office_no char(3) NOT NULL,
	Office_addr varchar(255) NOT NULL,
	Office_tel_num varchar(11) NOT NULL,
	PRIMARY KEY (Office_no)
);



/* Create Foreign Keys */

ALTER TABLE Contract
	ADD FOREIGN KEY (Contract_start_office_no)
	REFERENCES Office (Office_no)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Contract
	ADD FOREIGN KEY (Contract_end_office_no)
	REFERENCES Office (Office_no)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



