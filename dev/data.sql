INSERT INTO library.publisher (name, address, phone) VALUES ('O''Reilly Media', 'Newton, MA', '1 (800) 889-8969');
INSERT INTO library.publisher (name, address, phone) VALUES ('Simon & Schuster', 'New York, NY', '1 (800) 223-2336');

INSERT INTO library.book (book_id, title, publisher_name) VALUES (1, 'The Captain''s Daughter', 'Simon & Schuster');
INSERT INTO library.book (book_id, title, publisher_name) VALUES (2, 'Head First Java', 'O''Reilly Media');

INSERT INTO library.book_authors (book_id, author_name) VALUES (1, 'Alexander Pushkin');
INSERT INTO library.book_authors (book_id, author_name) VALUES (2, 'Bert Bates');
INSERT INTO library.book_authors (book_id, author_name) VALUES (2, 'Kathy Sierra');


INSERT INTO library.library_branch (branch_id, branch_name, address) VALUES (1, 'Independence Branch', '4024 N Elston Ave, Chicago, IL 60618');
INSERT INTO library.library_branch (branch_id, branch_name, address) VALUES (2, 'Harold Washington Library Center', '400 S State St, Chicago, IL 60605');

INSERT INTO library.book_copies (book_id, branch_id, no_of_copies) VALUES (1, 1, 2);
INSERT INTO library.book_copies (book_id, branch_id, no_of_copies) VALUES (1, 2, 0);
INSERT INTO library.book_copies (book_id, branch_id, no_of_copies) VALUES (2, 1, 3);
INSERT INTO library.book_copies (book_id, branch_id, no_of_copies) VALUES (2, 2, 19);

INSERT INTO library.borrower (card_no, name, address, phone) VALUES (1, 'Hanna K', 'Chicago, IL', '872 000 000');
INSERT INTO library.borrower (card_no, name, address, phone) VALUES (2, 'Jeremy Smith', 'Dallas, TX', '777 777 777');
INSERT INTO library.book_loans (book_id, branch_id, card_no, date_out, due_date) VALUES (2, 2, 1, '2021-11-08', null);
