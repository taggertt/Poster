import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterTest {

    Poster film1 = new Poster(1, "Bloodshot", "action movie");
    Poster film2 = new Poster(2, "Forward", "animation");
    Poster film3 = new Poster(3, "Castle", "novel");
    Poster film4 = new Poster(4, "Hotel Belgrad", "comedy");
    Poster film5 = new Poster(5, "Pulp fiction", "criminal");
    Poster film6 = new Poster(6, "Titanic", "romantic, dram");
    Poster film7 = new Poster(7, "American History X", "drama, criminal");
    Poster film8 = new Poster(8, "Silence of the Lambs", "horrors");
    Poster film9 = new Poster(9, "Forest Gump", "comedy-dram");
    Poster film10 = new Poster(10, "Catch me if you can", "comedy");
    Poster film11 = new Poster(11, "Fight club", "battle, thriller, dram");
    Poster film12 = new Poster(12, "Peter Pan", "cartoon");
    Poster film13 = new Poster(13, "101 dalmatians", "comedy");
    Poster film14 = new Poster(14, "Back to the future", "comedy");
    Poster film15 = new Poster(15, "Card house", "serial");


    ManagerPoster testFilms = new ManagerPoster();
    ManagerPoster testCinema = new ManagerPoster(12);

    @BeforeEach
    public void setup() {
        testFilms.save(film1);
        testFilms.save(film2);
        testFilms.save(film3);
        testCinema.save(film1);
        testCinema.save(film2);
        testCinema.save(film3);
        testCinema.save(film4);
        testCinema.save(film5);
        testCinema.save(film6);
        testCinema.save(film7);
        testCinema.save(film8);
        testCinema.save(film9);
        testCinema.save(film10);
        testCinema.save(film11);
        testCinema.save(film12);
        testCinema.save(film13);
        testCinema.save(film14);
        testCinema.save(film15);
    }

    @Test
    public void addFilms() {

        Poster[] expected = {film1, film2, film3};
        Poster[] actual = testFilms.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeDefaultFindLastUnderLimit() {

        Poster[] expected = {film3, film2, film1};
        Poster[] actual = testFilms.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeSetFindLastMoreLimit() {

        Poster[] expected = {film15, film14, film13, film12, film11, film10, film9,
                film8, film7, film6, film5, film4};
        Poster[] actual = testCinema.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}