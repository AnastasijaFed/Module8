import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("C:\\Final8", "Text1.txt");
        File f2 = new File("C:\\Final8", "Text2.txt");
       boolean doesExist1 = f1.exists();
       boolean doesExist2 = f2.exists();
        long f1Size = f1.length();
        long f2Size = f2.length();
       if(doesExist1 == true) System.out.println("File's " +f1.getName()+ " size is " +f1Size+ " bytes");
       else System.out.println("File " +f1.getName()+ " doesn't exist");
        if(doesExist2 == true) System.out.println("File's " +f2.getName()+ " size is " +f2Size+ " bytes");
        else System.out.println("File " +f2.getName()+ " doesn't exist");
    }

}
