package CodingTest_1;

abstract  class Vehicle {
    String modelName;
    int maxSpeed;

    public Vehicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    abstract void drive();
    final void displayInfo(){
        System.out.println("Model : " + modelName + ", " + "Max Speed : " + maxSpeed);

    }
}
