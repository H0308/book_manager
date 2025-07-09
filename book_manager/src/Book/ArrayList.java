package Book;

import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 20:26
 *
 * @Author: 憨八嘎
 */
public class ArrayList {
    private final int DEFAULT_CAPACITY = 5;

    private Object[] arr;
    private int size; // 有效数据个数
    private int capacity; // 容量

    public ArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.arr = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // 新增元素
    public boolean add(Object obj) {
        // 判断是否为满
        // 如果为满则进行扩容
        if(this.isFull()) {
            // 扩容两倍大小
            boolean ret = this.resize(2 * this.size);
            if(!ret)
                return false;
        }
        // 此处可以直接添加内容
        this.arr[this.size++] = obj;
        return true;
    }

    // 删除元素
    public boolean remove(Object obj) {
        if(this.isEmpty())
            return false;

        int pos = -1;
        // 判断元素是否存在
        if((pos = this.contains(obj)) == -1) {
            System.out.println("元素不存在，删除失败");
            return false;
        }

        // 元素存在
        // 再将当前位置之后的元素依次覆盖
        if(pos >= 0) {
            System.arraycopy(this.arr, pos + 1, this.arr, pos, this.size - pos - 1);
            // 更新size
            this.size--;
            return true;
        }

        return false;
    }

    // 扩容指定大小
    public boolean resize(int size) {
        Object[] newArr = new Object[size];
        System.arraycopy(this.arr, 0, newArr, 0, this.size);

        // 清空源数组防止内存泄漏
        for(int i = 0; i < this.size; i++)
            this.arr[i] = null;

        this.arr = newArr;
        this.capacity = size;

        return true;
    }

    // 判断是否含有某个元素
    public int contains(Object obj) {
        if(this.isEmpty())
            return -1;

        int pos = -1;
        // 遍历查找
        for(int i = 0; i < this.size; i++) {
            if(this.arr[i].equals(obj)) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    // 修改指定元素
    public boolean update(Object obj, Object newObj) {
        int pos = -1;
        if((pos = this.contains(obj)) != -1) {
            this.arr[pos] = newObj;
            return true;
        }

        return false;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return this.size == 0;
    }

    // 判断是否为满
    public boolean isFull() {
        return this.size == this.capacity;
    }

    // 获取有效数据个数
    public int getSize() {
        return this.size;
    }

    // 获取容量
    public int getCapacity() {
        return this.capacity;
    }

    // 获取到指定元素
    public Object getElement(int pos) {
        if(pos < 0 || pos >= this.size)
        {
            System.out.println("索引越界");
            return null;
        }

        return this.arr[pos];
    }
}
