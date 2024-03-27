package com.hero;

public abstract class Hero {
    protected String name; // ini hanya bisa diakses sama subClass nya saja, beda halnya dengan private,
    // hanya bisa diakases jika dia diberi otoritas seperti memasuki method yang bersifat public (getter setter)
    // protected pada atribut sangat tidak disarankan, karena akan mengunci nilai pada atribut,protected ini sebenernya lebih untuk Method..
    private int level;
    public Hero(String name){
        this.name = name;this.level=1;
    }
    public abstract void display();

    protected java.lang.String getName() {
        String string = "Namaku adalah "+ this.name +" Aku Level "+ this.level;
        return string;
    }
    protected void setName(String name){
        this.name = name;
    }
}
