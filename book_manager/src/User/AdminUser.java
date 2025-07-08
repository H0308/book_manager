package User;

import Book.BookManager;
import BookOps.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:30
 *
 * @Author: 憨八嘎
 */
public class AdminUser extends User {
    private final BookOperation[] bookOperations = new BookOperation[]{
            new ExitBookManager(),
            new FindBook(),
            new AddBook(),
            new DeleteBook(),
            new ShowBooks()
    };

    public AdminUser(String name) {
        super(name);
    }

    @Override
    public int menu() {
        System.out.println("******管理员菜单*****");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("*******************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void executeOp(int index, BookManager bookManager) {
        if(index < 0 || index > bookOperations.length)
            return;

        bookOperations[index].operation(bookManager);
    }
}
