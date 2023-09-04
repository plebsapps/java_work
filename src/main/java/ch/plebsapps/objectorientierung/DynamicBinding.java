package ch.plebsapps.objectorientierung;

public class DynamicBinding {

    public static void main(String[] args) {

        KindClass c1 = new KindClass();
        ElternClass c2 = new KindClass();
        OpaOmaClass c3 = new KindClass();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}

class OpaOmaClass {
   public String toString(){
       return OpaOmaClass.class.toString();
   }
}

class ElternClass extends OpaOmaClass {
    public String toString(){
        return ElternClass.class.toString();
    }
}
class KindClass extends ElternClass {
    public String toString(){
        return KindClass.class.toString();
    }
}