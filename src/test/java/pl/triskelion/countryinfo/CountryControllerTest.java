package pl.triskelion.countryinfo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.triskelion.countryinfo.repository.CountryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CountryInfoApplication.class)
public class CountryControllerTest {

    @Autowired
    CountryRepository countryRepository;

    @Test
    public void countryCodeExists() {
        String code = "BHR";
        Assert.assertNotNull(countryRepository.findOneByCode(code));
    }

    @Test(expected = AssertionError.class)
    public void countryCodeNotExists() {
        String code = "qwerty";
        Assert.assertNotNull(countryRepository.findOneByCode(code));
    }
}
