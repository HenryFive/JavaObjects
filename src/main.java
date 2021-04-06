import java.util.Random;
public class main {

    static Random rand = new Random();

    public static void main(String args[]){

        System.out.println(RandomBoyName()+" "+generateRelationships()+" "+generateGirlName());

    }

    public static String RandomBoyName(){

        boy[] boyObject;
        boyObject = new boy[5];

        boyObject[0] = new boy();
        boyObject[0].name = "Rey";

        boyObject[1] = new boy();
        boyObject[1].name = "Aron";

        boyObject[2] = new boy();
        boyObject[2].name = "Mike";

        boyObject[3] = new boy();
        boyObject[3].name = "Steve";

        boyObject[4] = new boy();
        boyObject[4].name = "John";

        return boyObject[rand.nextInt(5)].name;

    }

    public static String generateGirlName(){
        girl[] girlObject;
        girlObject = new girl[5];

        girlObject[0] = new girl();
        girlObject[0].name = "Olivia";

        girlObject[1] = new girl();
        girlObject[1].name = "Emma";

        girlObject[2] = new girl();
        girlObject[2].name = "Ava";

        girlObject[3] = new girl();
        girlObject[3].name = "Sophia";

        girlObject[4] = new girl();
        girlObject[4].name = "Isabella";

        return girlObject[rand.nextInt(5)].name;
    }

    static String generateRelationships()
    {
        relationship[] relObject;
        relObject = new relationship[5];

        relObject[0] = new relationship();
        relObject[0].status = "hates";

        relObject[1] = new relationship();
        relObject[1].status = "loves";

        relObject[2] = new relationship();
        relObject[2].status = "is indifferent to";

        relObject[3] = new relationship();
        relObject[3].status = "is angry with";

        relObject[4] = new relationship();
        relObject[4].status = "is apologetic to";

        return relObject[(int)(Math.random()*5)].status;
    }
}
