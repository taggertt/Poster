public class Poster {
    public int id;
    public String name;
    public String genre;

    public Poster() {
    }

    public Poster(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public Poster[] films = new Poster[0];

    public void save(Poster film) {
        Poster[] tmp = new Poster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Poster[] findAll() {
        return films;
    }

    public int countRecord = 10;

    public Poster[] findLast() {
        Poster[] tmp = new Poster[0];
        if (films.length < countRecord) {
            tmp = new Poster[films.length];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
        } else {
            tmp = new Poster[countRecord];
            for (int i = 0; i < countRecord; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
        }
        return tmp;
    }

    public Poster[] findLast(int countRecord) {
        Poster[] tmp = new Poster[0];
        if (films.length < countRecord) {
            tmp = new Poster[films.length];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
        } else {
            tmp = new Poster[countRecord];
            for (int i = 0; i < countRecord; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
        }
        return tmp;
    }
}
