package src;

import java.util.concurrent.atomic.AtomicInteger;

public class Room {

    private static final AtomicInteger count = new AtomicInteger(0);
    private long id;
    private String name;
    private String size;
    private int nBed;
    private int nBathRoom;

    public Room(String name, String size, int nBed, int nBathRoom) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.size = size;
        this.setNBed(nBed);
        this.setNBathroom(nBathRoom);
    }

    // Setter
    public int setNBed(int nBed) {
        if (nBed < 0) {
            this.nBed = 0;
        } else {
            this.nBed = nBed;
        }
        return this.nBed;
    }

    public int setNBathroom(int nBathRoom) {
        if (nBathRoom < 0) {
            this.nBathRoom = 0;
        } else {
            this.nBathRoom = nBathRoom;
        }
        return this.nBathRoom;
    }

    // Getter
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public int getNumberOfBed() {
        return this.nBed;
    }

    public int getNumberOfBathroom() {
        return this.nBathRoom;
    }
}
