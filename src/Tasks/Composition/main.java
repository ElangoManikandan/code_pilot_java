package Tasks.Composition;

class Engine{
    String engineType;
    double horsePower;
    Engine(String engineType,double horsePower){
        this.horsePower=horsePower;
        this.engineType=engineType;
    }
}

class Car{
    String carModel;
    Engine engine;
    Car(String carModel,String engineType,double horsePower){
        this.carModel=carModel;
        this.engine=new Engine(engineType,horsePower);
    }

    void carDetails(){
        System.out.println("Car Model:"+carModel+ "\nCar Engine: "+engine.engineType+"\nEngine HorsePower: "+(int)engine.horsePower+"HP");
    }
}


public class main {
    public static void main(String[] args) {
        Car car=new Car("THAR","BS6",150);
        car.carDetails();
    }
}
