import java.util.Scanner;
class LandTract{
 private double length;
 private double width;
 public LandTract(double length, double width){
     this.length = length;
     this.width = width;
 }
 public double getArea(){
     return length * width;
 }
 public boolean equals(LandTract ohter){
     return this.getArea() == ohter.getArea();
 }
 public double getLength(){
     return length;
 }

 public String toString() {
    return String.format("LandTract [Length: %.2f, Width: %.2f, Area: %.2f]", length, width, getArea());
}
}

public class LandTractDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of first land tract: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter width of first land tract: ");
        double width1 = scanner.nextDouble();
        LandTract tract1 = new LandTract(length1, width1);
        
        System.out.print("Enter length of second land tract: ");
        double length2 = scanner.nextDouble();
        System.out.println("Enter width of second land tract: ");
        double width2 = scanner.nextDouble();

        LandTract tract2 = new LandTract(length2, width2);

        System.out.println("First Land Tract is "+tract1);
        System.out.println("Second Land Tract is "+tract2);

        if(tract1.equals(tract2)){
            System.out.println("Both land tracts have the same area.");
        }else{
            System.out.println("Both land tracts have different areas.");
        }
        scanner.close();

}
}


