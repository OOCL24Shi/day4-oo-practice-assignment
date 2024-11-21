package oo;

import java.util.Objects;

public class Klass {

    public int number;

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public int getClassNumber(){
        return number;
    }
}
