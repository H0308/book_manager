package User;

import Book.BookManager;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:29
 *
 * @Author: 憨八嘎
 */
public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();
    public abstract void executeOp(int index, BookManager bookManager);
}
