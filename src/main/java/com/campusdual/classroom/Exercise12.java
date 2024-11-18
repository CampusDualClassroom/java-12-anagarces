package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car myCar = new Car("seat", "leon", "diesel");

        //encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        myCar.start();

        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        myCar.start();

       //Apagar el coche comprobando que el valor del tacómetro es correcto
       do {
           myCar.stop();
       } while (myCar.isTachometerGreaterThanZero());

        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        do{
            myCar.start();
            myCar.accelerate();
            myCar.stop();
        } while(!myCar.isTachometerGreaterThanZero());

        //Acelerar el coche
        myCar.accelerate();

       //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        while (myCar.speedometer < myCar.MAX_SPEED) {
            myCar.accelerate();
            if (myCar.speedometer == myCar.MAX_SPEED) {
                myCar.accelerate();
            }
        }

        //Frenar la velocidad
        myCar.brake();

        //Frenar hasta un valor negativo (y comprobar que no se puede)
           do{
               myCar.brake();
               if(myCar.speedometer == 0){
                   myCar.brake();
               }
           } while(myCar.speedometer > 0);

       // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);

       // Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        myCar.turnAngleOfWheels(100);
        myCar.turnAngleOfWheels(-100);

    //Detener el coche y poner marcha atrás
        myCar.brake();
        myCar.setReverse(true);


    //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
      do{
          myCar.setReverse(true);
          break;
      } while(myCar.gear.equals("N"));

    }

        }


