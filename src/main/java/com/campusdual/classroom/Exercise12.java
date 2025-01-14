package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
    Car myCar = new Car();

    System.out.println("\nUn metodo booleano que verifique si el valor del tacómetro es cero: ");
        System.out.println(myCar.isTachometerEqualToZero());

    System.out.println("\nEncender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto): ");
    if(myCar.isTachometerEqualToZero()){
        myCar.start();
    }

    System.out.println("\nEncender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido): ");
       if(myCar.isTachometerGreaterThanZero()){
           myCar.start();
       }

    System.out.println("\nApagar el coche comprobando que el valor del tacómetro es correcto: ");
     myCar.stop();
        System.out.println(myCar.isTachometerEqualToZero());

     System.out.println("\nApagar el coche mientras todavía está en movimiento (y comprobar que no se puede): ");
        myCar.start();
        myCar.accelerate();
        myCar.stop();

     System.out.println("\nAcelerar el coche: ");
        myCar.accelerate();

     System.out.println("\nAcelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede): ");
        myCar.speedometer = 120;
        myCar.accelerate();

     System.out.println("\nFrenar la velocidad: ");
      myCar.brake();

       System.out.println("\nFrenar hasta un valor negativo (y comprobar que no se puede): ");
        myCar.speedometer = 0;
        myCar.brake();

        System.out.println("\nGirar el volante 20 grados: ");
        myCar.turnAngleOfWheels(20);
        System.out.println(myCar.showSteeringWheelDetail());

     System.out.println("\nGirar el volante más de 45 grados ó -45 grados (y comprobar que no se puede): ");
     myCar.turnAngleOfWheels(200);
     myCar.turnAngleOfWheels(-200);


     System.out.println("\nDetener el coche y poner marcha atrás");
        myCar.setReverse(true);

     System.out.println("\nPoner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)");
        myCar.speedometer = 20;
        myCar.setReverse(true);


    }
}


