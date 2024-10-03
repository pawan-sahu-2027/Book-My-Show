package com.scaler.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Theater extends BaseModel{
    @OneToMany
    private List<Screens> screensList;

    @ManyToOne
    private Region region;
    private String name;
}
