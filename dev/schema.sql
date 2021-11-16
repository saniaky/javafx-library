create database if not exists library;
use library;

create table if not exists publisher
(
    name    varchar(100) not null,
    address varchar(100) null,
    phone   varchar(100) null,

    primary key (name)
);

create table if not exists book
(
    book_id        int auto_increment,
    title          varchar(100) null,
    publisher_name varchar(100) null,

    primary key (book_id),
    constraint fk_book_publisher foreign key (publisher_name) references publisher (name)
);

create table if not exists borrower
(
    card_no int auto_increment,
    name    varchar(100) null,
    address varchar(100) null,
    phone   varchar(100) null,

    primary key (card_no)
);

create table if not exists library_branch
(
    branch_id   int auto_increment,
    branch_name varchar(100) not null,
    address     varchar(100) not null,

    primary key (branch_id)
);

create table if not exists book_copies
(
    book_id      int not null,
    branch_id    int not null,
    no_of_copies int null,

    primary key (book_id, branch_id),
    constraint book_copies_ibfk_1 foreign key (book_id) references book (book_id),
    constraint book_copies_ibfk_2 foreign key (branch_id) references library_branch (branch_id)
);

create table if not exists book_loans
(
    book_id   int  not null,
    branch_id int  not null,
    card_no   int  not null,
    date_out  date null,
    due_date  date null,

    primary key (book_id, branch_id, card_no),
    constraint fk_book_loans_book foreign key (book_id) references book (book_id),
    constraint fk_book_loans_branch foreign key (branch_id) references library_branch (branch_id),
    constraint fk_book_loans_borrower foreign key (card_no) references borrower (card_no)
);

create table if not exists book_authors
(
    book_id     int          not null,
    author_name varchar(100) not null,

    primary key (book_id, author_name),
    constraint fk_book_authors_book foreign key (book_id) references book (book_id)
);

