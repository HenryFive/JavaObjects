import java.util.Random;
public class main {

    static Random rand = new Random();

    public static void main(String args[]){

        System.out.println(RandomBoyName()+" "+generateRelationships()+" "+generateGirlName());

    }

    public static String RandomBoyName(){

        boy[] boyObject;
        boyObject = new boy[5];

        boyObject[0] = new boy("Rey");

        boyObject[1] = new boy("Aron");

        boyObject[2] = new boy("Mike");

        boyObject[3] = new boy("Steve");

        boyObject[4] = new boy("John");


        return boyObject[rand.nextInt(5)].name;

    }

    public static String generateGirlName(){
        girl[] girlObject;
        girlObject = new girl[5];

        girlObject[0] = new girl("Olivia");

        girlObject[1] = new girl("Emma");

        girlObject[2] = new girl("Ava");

        girlObject[3] = new girl("Sophia");

        girlObject[4] = new girl("Isabella");

        return girlObject[rand.nextInt(5)].name;
    }

    static String generateRelationships()
    {
        relationship[] relObject;
        relObject = new relationship[5];

        relObject[0] = new relationship(null);
        relObject[0].status = "hates";

        relObject[1] = new relationship(null);
        relObject[0].status = "loves";

        relObject[2] = new relationship(null);
        relObject[0].status = "is indifferent to";

        relObject[3] = new relationship(null);
        relObject[0].status = "is angry with";

        relObject[4] = new relationship(null);
        relObject[0].status = "is apologetic to";

        return relObject[(int)(Math.random()*5)].status;
    }
}
