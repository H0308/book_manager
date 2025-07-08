import Book.BookManager;
import Book.Book;
import User.AdminUser;
import User.CommonUser;
import User.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/07
 * Time: 10:34
 *
 * @Author: 憨八嘎
 */
public class Main {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份（1：管理员 2：普通用户）：");
        int choice = scanner.nextInt();
        User user = switch (choice) {
            case 1 -> new AdminUser(name);
            case 2 -> new CommonUser(name);
            default -> null;
        };

        return user;
    }

    public static void addBook() {

    }

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.addBook(new Book("Java从入门到放弃", "小王", 99.9, false));
        bookManager.addBook(new Book("云边有个小卖部", "张嘉佳", 19.9, false));
        bookManager.addBook(new Book("天堂旅行团", "张嘉佳", 39.9, false));
        User user = login();
        while (true) {
            int choice = user.menu();
            user.executeOp(choice, bookManager);
        }
    }
}
