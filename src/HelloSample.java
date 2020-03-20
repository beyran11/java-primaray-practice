

import mth.numeric.functions.MyNumber;
import ug.joshh.animal.Dog;

public class HelloSample {

    public static void main(String[] args){

        //Person person=new Person();
        Studend studend=new Studend();

        //person.setName("Hamzeh Beyranvand");
        //person.setEmail("beyran11@gmail.com");
        //person.setPhone("09106559060");

        studend.setName("Hamzeh Beyranvand");
        studend.setEmail("beyran11@gmail.com");
        studend.setPhone("09106559060");

        studend.setField("Electrical Engineering");
        studend.setStudentnumber("09106559060");

        //System.out.println(person.getName());
        //System.out.println(person.getEmail());
        //System.out.println(person.getPhone());

        //System.out.println(studend.getStudentnumber());

        studend.show();

        //Package Tester
        Dog dog=new Dog();

        MyNumber number=new MyNumber();

        System.out.println(number.isPrime(5));


    }


}
