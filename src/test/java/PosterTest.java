import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    Poster film1 = new Poster(1, "Bloodshot", "action movie");
    Poster film2 = new Poster(2, "Forward", "animation");
    Poster film3 = new Poster(3, "Hotel Belgrad", "comedy");

    Poster testFilms = new Poster();


    @Test
    public void addFilms() {

        testFilms.save(film1);
        testFilms.save(film2);
        testFilms.save(film3);

        Poster[] expected = {film1, film2, film3};
        Poster[] actual = testFilms.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeFindAll(){

        testFilms.save(film1);
        testFilms.save(film2);
        testFilms.save(film3);

        Poster [] expected = {film1, film2, film3};
        Poster [] actual = testFilms.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //public void shouldBeFindLast(){

    //Poster [] actual = testFilms.findLast();
    //}
}