package pl.triskelion.countryinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.triskelion.countryinfo.entity.Country;
import pl.triskelion.countryinfo.repository.CountryRepository;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Country getCountry(String code) {
        return countryRepository.findOneByCode(code);
    }
}
