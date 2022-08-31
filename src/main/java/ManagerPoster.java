public class ManagerPoster {

    int countRecord = 10;
    public Poster[] films = new Poster[0];

    public ManagerPoster(){
    }

    public ManagerPoster(int countRecord) {
        this.countRecord = countRecord;
    }

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

    public Poster[] getFilms() {
        return films;
    }

    public void setFilms(Poster[] films) {
        this.films = films;
    }

    public Poster[] findLast() {
        Poster[] tmp = new Poster[0];
        if (films.length < this.countRecord) {
            tmp = new Poster[films.length];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
        } else {
            tmp = new Poster[this.countRecord];
            for (int i = 0; i < this.countRecord; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
        }
        return tmp;
    }
}
