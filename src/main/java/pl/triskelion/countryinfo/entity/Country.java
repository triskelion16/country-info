package pl.triskelion.countryinfo.entity;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private Integer population;
    @Column(name = "life_expectancy")
    private Double lifeExpectancy;
    @Transient
    private String language;

    public Country() {}

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(Double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
