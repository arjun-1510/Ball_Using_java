import java.util.Scanner;

class Bag {

    static Scanner sc = new Scanner(System.in);

    String ballname;
    double ballradius;

    
    public Bag(String ballname, double ballradius) {
        this.ballname = ballname;
        this.ballradius = ballradius;
    }


    public void detailsofbag() {
        System.out.println("Ball Name is : " + ballname);
        System.out.println("Ball Radius is : " + ballradius);
        System.out.println("=================================");
    }

    

   




}
