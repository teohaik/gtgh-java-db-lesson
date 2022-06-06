create table vaccination
(
    insured         varchar(11) not null,
    vacc_date       date        not null,
    expiration_date date        not null,
    vaccine_brand   varchar(20) null
);

INSERT INTO javauser.vaccination (insured, vacc_date, expiration_date, vaccine_brand) VALUES ('1234', '2022-06-03', '2022-09-02', 'Pfizer');
INSERT INTO javauser.vaccination (insured, vacc_date, expiration_date, vaccine_brand) VALUES ('12345666', '2022-06-01', '2022-09-01', 'Astra Zeneca');
INSERT INTO javauser.vaccination (insured, vacc_date, expiration_date, vaccine_brand) VALUES ('1112141254', '2022-05-05', '2022-09-01', 'Pfizer');
INSERT INTO javauser.vaccination (insured, vacc_date, expiration_date, vaccine_brand) VALUES ('1112141444', '2021-11-15', '2022-05-31', 'Pfizer');
INSERT INTO javauser.vaccination (insured, vacc_date, expiration_date, vaccine_brand) VALUES ('1124512', '2022-04-01', '2022-10-02', 'Pfizer');
INSERT INTO javauser.vaccination (insured, vacc_date, expiration_date, vaccine_brand) VALUES ('224520154', '2022-06-01', '2022-05-05', 'Astra Zeneca');