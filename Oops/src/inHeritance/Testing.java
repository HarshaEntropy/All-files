package inHeritance;

class Testing {
    public static void main(String[] args) {
        Bycycle bycycle = new Bycycle(20,10,1);
        System.out.println("gear is : " + bycycle.gear);
        System.out.println("Seat height is: " + bycycle.seatHeight);
        System.out.println("Bike speed is: " + bycycle.speed);
        bycycle.speedup(1+6);
        System.out.println("bike speed after applying break is: " + bycycle.speed);
    }

}
