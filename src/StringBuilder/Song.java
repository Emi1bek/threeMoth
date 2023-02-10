package StringBuilder;

public class Song {
    String title;
    String author;
    String text;

    public Song(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public Song() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public CharSequence setText(String text) {
        this.text = text;
        return null;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
