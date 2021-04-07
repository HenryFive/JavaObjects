import classes.boy;
import classes.girl;
import classes.relationship;
import StudentClass.Student;

import java.util.Random;
public class main {

    static Random rand = new Random();

    public static void main(String args[]){

        Student studyante = new Student();

        studyante.setter("Clark", 123, "1st Semester");

        System.out.println(studyante.get());

        System.out.println(RandomBoyName()+" "+generateRelationships()+" "+generateGirlName());

    }

    public static String RandomBoyName(){

        boy[] boyObject = new boy[5];

        boyObject[0] = new boy();
        boyObject[0].setName("Rey");

        boyObject[1] = new boy();
        boyObject[1].setName("Aron");

        boyObject[2] = new boy();
        boyObject[2].setName("Mike");

        boyObject[3] = new boy();
        boyObject[3].setName("Steve");

        boyObject[4] = new boy();
        boyObject[4].setName("John");

        return boyObject[rand.nextInt(5)].getName();

    }

    public static String generateGirlName(){

        girl[] girlObject;
        girlObject = new girl[5];

        girlObject[0] = new girl();
        girlObject[0].setName("Olivia");

        girlObject[1] = new girl();
        girlObject[1].setName("Emma");

        girlObject[2] = new girl();
        girlObject[2].setName("Ava");

        girlObject[3] = new girl();
        girlObject[3].setName("Sophia");

        girlObject[4] = new girl();
        girlObject[4].setName("Isabella");

        return girlObject[rand.nextInt(5)].getName();
    }

    static String generateRelationships()
    {
        relationship[] relObject;
        relObject = new relationship[5];

        relObject[0] = new relationship();
        relObject[0].setStatus("hates");

        relObject[1] = new relationship();
        relObject[1].setStatus("loves");

        relObject[2] = new relationship();
        relObject[2].setStatus("is indifferent to");

        relObject[3] = new relationship();
        relObject[3].setStatus("is angry with");

        relObject[4] = new relationship();
        relObject[4] .setStatus("is apologetic to");

        return relObject[(int)(Math.random()*5)].getStatus();
    }
}
