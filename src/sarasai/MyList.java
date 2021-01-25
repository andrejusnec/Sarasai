package sarasai;

public class MyList {

    private Object[] list;

    public MyList() {
        this.list = new Object[0];
    }

    public void add(Object o) {
        Object[] newList = new Object[this.list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[newList.length - 1] = o;
        this.list = newList;
    }

    public Object get(int index) {
        if (index < 0 || index >= this.list.length) {
            return this.list[index];
        }
        return this.list[index];
    }

    public void set(int index, Object o) {
        if (index > 0 || index <= this.list.length) {
            Object[] newList1 = new Object[this.list.length];
            for (int i = 0; i < list.length; i++) {
                newList1[i] = list[i];
                if (i == index) {
                    newList1[i] = o;
                }

            }
            this.list = newList1;
        }
    }

    public void remove(int index) {
        if (index > 0 || index <= this.list.length) {
            Object[] newList = new Object[this.list.length - 1];
            for (int i = 0, j = 0; i < list.length; i++) {
                if (i != index) {
                    newList[j++] = list[i];
                }
            }
            this.list = newList;
        }
        //Galima keisti reiksme ne kuriant naujo masyvo!!!!!!
    }

    // gudriems
    public void insert(int index, Object o) {
        if (index >= 0 || index <= this.list.length + 1) {
            Object[] newList = new Object[this.list.length + 1];
            for (int i = 0, j = 0; i < newList.length; i++) {

                if (index == i) {
                    newList[i] = o;

                } else {
                    newList[i] = list[j++];
                }
            }
            this.list = newList;
        } else {
            System.out.println("ERROR:  YOU ENTERED WRONG INDEX");
        }
    }

    public int size() {
        return this.list.length;
    }

    @Override
    public String toString() {
        String test = "";
        for (int i = 0; i < this.list.length; i++) {
            if (i == 0) {
                test += this.list[i];
            } else {
                test += ", " + this.list[i];
            }

        }
        return "[" + test + "]";
    }

    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("");
        System.out.println("****************************");
    }
}
