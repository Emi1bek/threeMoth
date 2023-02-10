package Enum;

public enum HWweek {
    Monday("Дуйшомбу"),
    Tuesday("Шейшемби"),
    Wednesday("Шаршемби"),
    Thursday("Бейшемби"),
    Friday("Жума"),
    Saturday("Ишемби"),
    Sunday("Жекшемби");

    private String name;

   // public abstract void met();

    HWweek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
