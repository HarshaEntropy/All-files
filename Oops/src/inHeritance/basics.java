package inHeritance;

class basics {
    protected int gear;
    protected int speed;

    public basics(int statSpeed,int startgear){
        gear = startgear;
        speed = statSpeed;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedup( int increment){
        speed += increment;
    }

    public int getGear() {
        return gear;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
