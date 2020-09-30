package Rooms;

public abstract class Room {

    private boolean isComplete;

    public Room(){
        isComplete = false;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void completeRoom() {
        isComplete = true;
    }
}
