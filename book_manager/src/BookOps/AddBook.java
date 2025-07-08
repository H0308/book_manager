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
public class AddBook implements BookOperation{
    public void operation(BookManager bookManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新增的图书名称：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        double price = scanner.nextDouble();
        Book book = new Book(name, author, price, false);

        boolean ret = bookManager.addBook(book);
        if(!ret) {
            System.out.println("添加失败！");
            return;
        }

        System.out.println("添加成功！");
    }
}
