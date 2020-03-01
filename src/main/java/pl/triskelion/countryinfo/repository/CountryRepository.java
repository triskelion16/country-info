package pl.triskelion.countryinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.triskelion.countryinfo.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findOneByCode(String code);
}
