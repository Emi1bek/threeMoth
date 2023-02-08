public enum Kyrgyzstan {
    CHY("Бишкек"){
        @Override
        public void met() {
            System.out.println("Борбору: Бишкек, ");
        }
    },

    TALAS("Талас"){
        @Override
        public void met() {

            System.out.println("Борбору: Талас, Манас ордо");
        }
    },
    YSYKKOL("Ыссык кол"){
        @Override
        public void met(){
            System.out.println("Борбору: Кара-Кол, Жемчужина Кыргызстана!");
        }
    },
    NARYN("Нарын"){
        @Override
        public void met(){
            System.out.println("Борбору: Нарын, Эт, Кыргызстандын журогу!");
        }
    },
    JALALABAD("Жалал-абад"){
        @Override
        public void met() {
            System.out.println("Борбору: Жалал-абад, Шаркыратма, Жангак!");
        }
    },
    OSH("Ош"){
        @Override
        public void met() {
            System.out.println("Борбору: Ош, Сулайман-тоо");
        }
    },

    BATKEN("Баткен"){
        @Override
        public void met() {
            System.out.println("Борбору: Баткен, Айгул гулу, орук");
        }
    };

    private String name;

    Kyrgyzstan(String name) {
        this.name =name;
    }
    public abstract void met();

    @Override
    public String toString() {
        return "Kyrgyzstan{" +
                "name='" + name + '\'' +
                '}';
    }
}
