INSERT INTO publisher (name, address, phone)
VALUES ('ABC publishing', '173 Spring street', '123-837-6673'),
       ('Wonders publishing house', '20 North Dogwood st.', '123-382-3787');

INSERT INTO book (book_id, title, publisher_name)
VALUES (123456, 'Java 123', 'ABC publishing'),
       (222878, 'Let do Java', 'ABC publishing'),
       (234765, 'How to Java', 'Wonders publishing house'),
       (232323, 'Java for beginners', 'Wonders publishing house');

INSERT INTO book_authors (book_id, author_name)
VALUES (123456, 'Tom R. Kendel'),
       (123456, 'Randy John'),
       (123456, 'Sandy Mark'),
       (222878, 'William Nader'),
       (234765, 'Dany Scot'),
       (232323, 'Linda Thomas');

INSERT INTO library_branch (branch_id, branch_name, address)
VALUES (111, 'West Park ', '525 down town'),
       (222, 'North Park', '77 Springs av.');

INSERT INTO book_copies (book_id, branch_id, no_of_copies)
VALUES (123456, 111, 20),
       (222878, 111, 19),
       (234765, 111, 2),
       (232323, 111, 3),
       (123456, 222, 24),
       (222878, 222, 2),
       (234765, 222, 6),
       (232323, 222, 8);

INSERT INTO borrower (card_no, name, address, phone)
VALUES (1234, 'Tom John', '123 Spring st.', '123-456-7890'),
       (1256, 'Sandra Thomas', '234 Williams St.', '123-983-8847'),
       (2453, 'Sarah Dallas', '674 North Park St.', '123-738-0938');

INSERT INTO book_loans(book_id, branch_id, card_no, date_out, due_date)
VALUES (123456, 111, 1234, '2021-10-10', '2021-12-02'),
       (222878, 111, 1234, '2021-10-10', '2021-12-02'),
       (234765, 111, 1234, '2021-10-20', '2021-12-12'),
       (232323, 222, 2453, '2021-12-03', '2022-02-02');
