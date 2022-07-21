package inHeritance;

class Bycycle extends basics{
    public int seatHeight;

    public Bycycle(int startHight,int startSpeed,int startGear){
        super(startSpeed,startGear);
        this.seatHeight = startHight;
    }
    public void setHeight(int newvalue){
        this.seatHeight = newvalue;
    }
}
