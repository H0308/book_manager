package User;

import Book.BookManager;
import BookOps.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:31
 *
 * @Author: 憨八嘎
 */
public class CommonUser extends User{
    private final BookOperation[] bookOperations = {
            new ExitBookManager(),
            new FindBook(),
            new BorrowBook(),
            new ReturnBook()
    };

    public CommonUser(String name) {
        super(name);
    }

    @Override
    public int menu() {
        System.out.println("******普通用户菜单*****");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
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
