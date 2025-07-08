package BookOps;

import Book.Book;
import Book.BookManager;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:39
 *
 * @Author: 憨八嘎
 */
public class FindBook implements BookOperation{
    @Override
    public void operation(BookManager bookManager) {
        System.out.println("请输入要查找的图书名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Book book1 = bookManager.queryBookByName(name);
        if(book1 != null)
        {
            System.out.println("找到该图书：" + book1);
            return;
        }

        System.out.println("没有找到该图书！");
    }
}
