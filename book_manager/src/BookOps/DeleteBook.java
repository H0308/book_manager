package BookOps;

import Book.Book;
import Book.BookManager;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:40
 *
 * @Author: 憨八嘎
 */
public class DeleteBook implements BookOperation{
    @Override
    public void operation(BookManager bookManager) {
        System.out.println("请输入要删除的图书名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        boolean ret = bookManager.deleteBookByName(name);
        if (!ret){
            System.out.println("删除失败！");
            return;
        }

        System.out.println("删除成功！");
    }
}
