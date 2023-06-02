import java.util.Scanner;

class Ui {

    static Scanner sc = new Scanner(System.in);

    static boolean flage = false;

    static boolean b = true;

    static Bag bag1;
    static Bag bag2;

    public static void main(String[] args) {

        do {

            flage = true;

            System.out.println("Welcome to My Programming World");

            System.out.println(
                    "\n1. Add ball\n2.Remove ball\n3.Checkbox is Empty or not\n4.Show game that can be Played\n5.Exit");
            System.out.println("Enter your Choice");
            int user_home_select = sc.nextInt();

            switch (user_home_select) {

                case 1: {

                    do {
                        b = true;

                        System.out.println("\n1.Tennis Ball \n2.Basketball \n3.Exit");

                        System.out.println("Enter Your add Ball");
                        int balladd = sc.nextInt();

                        switch (balladd) {

                            case 1: {

                                if (bag1 == null) {

                                    System.out.println("Enter Ball Name");
                                   
                                    sc.nextLine();
                                    String ballname = sc.nextLine();
                                   
                                    System.out.println("Enter Ball Radius");
                                    double ballradius = sc.nextDouble();

                                    bag1 = new Bag(ballname, ballradius);

                                    System.out.println("Sucessfully added");

                                    bag1.detailsofbag();

                                } else {
                                    System.out.println("Can't added");
                                }

                                break;
                            }
                            case 2: {

                                if (bag2 == null) {

                                    System.out.println("Enter Ball Name");
                                    String ballname = sc.nextLine();
                                    sc.nextLine();

                                    System.out.println("Enter Ball Radius");
                                    double ballradius = sc.nextDouble();

                                    bag2 = new Bag(ballname, ballradius);

                                    System.out.println("Sucessfully added");
                                    bag2.detailsofbag();

                                } else {
                                    System.out.println("Can't added");
                                }

                                break;
                            }
                            case 3: {

                                b = false;

                                break;
                            }

                        }

                    } while (b);

                    break;
                }
                case 2: {

                    boolean rem = true;

                    

                    System.out.println("\n1.Tennis Ball \n2.Basketball \n3.Exit");

                    System.out.println("Enter Your Remove Ball");
                    int ballremove = sc.nextInt();

                    switch (ballremove) {

                        case 1: {

                            if (bag1 != null) {
                                bag1 = null;
                                System.out.println("Succesfully Removed");
                            } else {
                                System.out.println("Can't Remove");
                            }

                            break;
                        }
                        case 2: {

                            if (bag2 != null) {
                                bag2 = null;
                                System.out.println("Succesfully Removed");
                            } else {
                                System.out.println("Can't Remove");
                            }

                            break;
                        }
                        case 3: {
                            b=false;
                            break;
                        }
                    }

                    break;
                }
                case 3: {
                    b= true;


                    do {

                        


                        System.out.println("\n1.Bag One \n2.Base two \n3.Exit");

                        System.out.println("Enter Your Bag is full or not");
                        int bagempty = sc.nextInt();


                        switch(bagempty) {


                            case 1: {

                                if(bag1==null) {
                                    System.out.println("Bag one is Empty");
                                }else {
                                    System.out.println("Bag one Not Empty");
                                }
                                
                                
                                break;}
                            case 2: {


                                if(bag2==null) {
                                    System.out.println("Bag two is Empty");
                                }else {
                                    System.out.println("Bag two Not Empty");
                                }
                                
                                
                                
                                
                                break;}
                            case 3: {

                                b=false;
                                
                                break;}
                        }
    












                       
                    }while(b);











                    break;
                }
                case 4: {

                    Ball ch = new Tennis();
                    Tennis tennis = (Tennis)ch;

                    Ball ch2 = new Basketball();
                       Basketball basketball = (Basketball) ch2;

                    if(bag1!=null && bag2!=null) {
                        System.out.println("Currenty Both Game are played : " +tennis.Game + " "+ "and" +basketball.Game );


                       
                        
                    }else if(bag2!=null) {

                        
                       System.out.println( "Currenty Playing Games is : "+basketball.Game);


                    }

                    else if(bag1!=null ) {
                        System.out.println( "Currenty Playing Games is : "+tennis.Game);

                        


                    }
                    
                    
                    else {
                        System.out.println("Not Game to be Played");
                    }

                   









                    break;
                }
                case 5: {

                    flage = false;

                    break;
                }
            }

        } while (flage);

    }

}
