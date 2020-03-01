package pl.triskelion.countryinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.triskelion.countryinfo.domain.Country;
import pl.triskelion.countryinfo.repository.CountryRepository;
import pl.triskelion.countryinfo.repository.LanguageRepository;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    LanguageRepository languageRepository;

    public Country getCountry(String code) {
        String codeUpperCase = code.toUpperCase();
        String language = languageRepository.findAllByCode(codeUpperCase).get(0).getLanguage();

        Country country = countryRepository.findOneByCode(codeUpperCase);
        country.setLanguage(language);

        return country;
    }
}
