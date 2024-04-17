public class Place {

    private String name;
    private String description;

    private Place[] doors = new Place[4];

    public Place(String name){
        this.name = name;
    }

    public void addDoor(Place f,Place r,Place l,Place d) {
        doors[0] = f;
        doors[1] = r;
        doors[2] = l;
        doors[3] = d;
    }

    public String writeDoors(){

        String door = "";
        if(doors[0] != null)door += "[F]orward ";
        if(doors[1] != null)door += "[R]ight ";
        if(doors[2] != null)door += "[L]eft ";
        if(doors[3] != null)door += "[D]own ";

        return door;

    }
    public Place selectPlace(int i){
        return doors[i];
    }
    public String getName(){
        return name;
    }
    public void setDoors(Place[] doors){
        this.doors = doors;
    }
    public String getDescription(){
        return description;
    }
}
