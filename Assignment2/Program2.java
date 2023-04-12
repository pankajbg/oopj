class BMI {
    double height ;
    double weight;
    public BMI(){

    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
         this.height= height;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getFormulae(){
        return (this.weight/(this.height*this.height));
    
    }
}
class Program2{
    public static void main(String args[]){
        BMI B = new BMI();
        B.setHeight(30.06);
        B.setWeight(45.86);
        System.out.println("Height :"+B.getHeight());
        System.out.println("Weight :"+B.getWeight());
        System.out.println("BMI is :"+B.getFormulae());


    }
}
