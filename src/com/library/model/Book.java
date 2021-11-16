package com.company.model;

import javafx.beans.property.StringProperty;

public class Book {

    public final StringProperty id;
    public final StringProperty title;
    public final StringProperty publisher;

    public Book(StringProperty id, StringProperty title, StringProperty publisherName) {
        this.id = id;
        this.title = title;
        this.publisher = publisherName;
    }

}
