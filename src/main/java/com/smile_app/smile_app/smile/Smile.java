package com.smile_app.smile_app.smile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class Smile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean isCrying;
    private Boolean isLaughing;

    public Smile() {

    }

    public Smile(Boolean isCrying, Boolean isLaughing) {
        this.isCrying = isCrying;
        this.isLaughing = isLaughing;
    }

    public Long getId() {
        return id;
    }

    public Boolean getIsCrying() {
        return isCrying;
    }

    public Boolean getIsLaughing() {
        return isLaughing;
    }

}
