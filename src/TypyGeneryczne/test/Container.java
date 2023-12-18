package TypyGeneryczne.test;

class Container <T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for (T t : array) {
            System.out.println(t);
        }
    }

}

/*    private Object[] array;

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public void printArray() {
        for (Object o : array) {
            System.out.println(o);
        }
    }
}*/
