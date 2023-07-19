import java.util.Scanner;

public class Restorent {
    public static void main(Question104[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("press 1 to indian food/ press 2 for russian food/ press 3 for italian food");
            ch=sc.nextInt();
            switch (ch){
                case 1->{
                    System.out.println("welcome to indian food");
                    System.out.println("this food is available upto 70 rupees");
                    System.out.println("press 1 for biryani/ press 2 for makke di roti &sarso da saag/press 3 for gujrati dhokla");
                    int a=sc.nextInt();
                    switch (a){

                        case 1->{
                            System.out.println("biryani= "+80);
                        }
                        case 2->{
                            System.out.println("makke di roti &sarso da saag= "+100);
                        }
                        case 3->{
                            System.out.println("gujrati dhokla= "+120);
                        }
                    }
                }
                case 2->{
                    System.out.println("welcome to russian food");
                    System.out.println("this food is available uto 50 rupees");
                    System.out.println("press 1 for pelmani/ press 2 for perozhki/press 3 for kotlety");
                    int b=sc.nextInt();
                    switch (ch){
                        case 1->{
                            System.out.println("pelmani="+158);
                        }
                        case 2->{
                            System.out.println("perozhki= "+170);
                        }
                        case 3->{
                            System.out.println("kotlety= "+200);
                        }

                    }

                }
                case 3->{
                    System.out.println("welcome to italian food");
                    System.out.println("this food is available upto 200 rupees");
                    System.out.println("press 1 for Gnocchi sorrento/ press 2 for spaghetti carbonara/press 3 for cavatelli");
                    int c=sc.nextInt();
                    switch (c){
                        case 1->{
                            System.out.println("Gnocchi sorrento= "+250);
                        }
                        case 2->{
                            System.out.println("spaghetti carbonara= "+300);
                        }
                        case 3->{
                            System.out.println("cavatelli..= "+400);
                        }
                    }
                }
            }
            System.out.println("press 1 to repeat");
            ch=sc.nextInt();
        }while(ch==1);

    }
}
