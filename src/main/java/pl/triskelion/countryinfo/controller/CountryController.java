package pl.triskelion.countryinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.triskelion.countryinfo.entity.Country;
import pl.triskelion.countryinfo.service.CountryService;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}
