public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.dirthday = new FormDate();
        post.dirthday.day = 13;
        post.dirthday.month = 6;
        post.dirthday.year = 1999;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
