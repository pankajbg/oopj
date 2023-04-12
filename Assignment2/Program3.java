 import java.util.Scanner;
 class Bill {
    String name;
    double units;
    double bill;
    public Bill(){

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name =name;
    }
    public double getUnits(){
        return this.units;
    }
    public void setUnits(double units){
        this.units =units;
    }


    public double getBill(){
        if(this.units<100) {
            return this.units*5;
        }
        else if((this.units>100)&&(this.units<200)){
            return this.units*7;
        }
        else if(this.units>200){
            return this.units*10;
        }
        return this.bill;
    }
    }
    

    
class Program3{
    public static void main (String args[]){
    Bill B = new Bill();
    System.out.print("Name: ");
    Scanner sc = new Scanner(System.in);
    B.setName(sc.nextLine());
    System.out.print("Enter units consumed : ");
    B.setUnits(sc.nextDouble());
    System.out.println("Bill is : "+B.getBill());
    


}
}
