package homework.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            } else if ((i == this.data.length - 1) && !(this.data[i] == null)) {
                data = Arrays.copyOf(data, data.length + 1);
            }
        }
        return -1;
    }

    public T get(int index) {
        return this.data[index];
    }

    public T[] getItems() {
        return this.data;
    }

    public boolean delete(int index) {
        if (index < data.length) {
            for (int i = index; i < this.data.length - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else return false;
    }

    public boolean deleteItem(T item) {
        int countOfItemInData = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == item) {
                for (int j = i; j < this.data.length - 1; j++) {
                    this.data[j] = this.data[j + 1];
                }
                countOfItemInData++;
            }
        }
        this.data = Arrays.copyOf(data, data.length - countOfItemInData);
        if (countOfItemInData > 0) return true;
        else return false;
    }

    public void sort(Comparator<T> compar) {
        withoutNull();
        T tmp;
        for (int j = 0; j < this.data.length - 1; j++) {
            for (int i = 0; i < this.data.length - 1; i++) {
                int h = compar.compare(this.data[i], this.data[i + 1]);
                if (h > 0) {
                    tmp = this.data[i];
                    this.data[i] = this.data[i + 1];
                    this.data[i + 1] = tmp;
                }
            }
        }
    }

    public String toString() {
        withoutNull();
        return Arrays.toString(this.data);
    }

    public void withoutNull() {     ////костыль( не знаю как убрать нулы)
        int countOfNull = 0;
        for (int n = 0; n < this.data.length; n++) {
            if (this.data[n] == null) {
                countOfNull++;
            }
        }
        this.data = Arrays.copyOf(data, this.data.length - countOfNull);
    }
}
