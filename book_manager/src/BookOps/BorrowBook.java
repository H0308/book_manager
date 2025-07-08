package BookOps;

import Book.Book;
import Book.BookManager;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:42
 *
 * @Author: 憨八嘎
 */
public class BorrowBook implements BookOperation{
    @Override
    public void operation(BookManager bookManager) {
        System.out.println("请输入要借阅的图书名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Book book1 = bookManager.queryBookByName(name);
        if(book1 != null && !book1.isBorrowed()) {
            book1.setBorrowed(true);
            System.out.println("借阅成功！");
            return;
        }

        System.out.println("借阅失败！");
    }
}
