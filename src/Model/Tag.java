package Model;

import java.util.Objects;

public class Tag {
    private String name;

    public Tag(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Tag tag = (Tag) object;
        return Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

/* @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        Tag tag = (Tag) o;
        return name.equals(tag.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }*/

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                '}';
    }

}
