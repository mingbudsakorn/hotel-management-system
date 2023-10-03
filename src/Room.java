package src;

import java.util.concurrent.atomic.AtomicInteger;

public class Room {
    private static final AtomicInteger count = new AtomicInteger(0);
    private long id; //for number room
    private String name;
    private String size;
    private int nOfBed;
    private int numberofbathroom;

    public Room(String name, String size, int nOfBed, int numberofbathroom){
        this.id = count.incrementAndGet();
        this.name = name;
        this.size = size;
        this.setNofBed(nOfBed);
        this.setNofbathroom(numberofbathroom);
    }
        public int setNofBed(int nOfBed){
            if (nOfBed < 0) { // if - room we setting 0
                this.nOfBed = 0;
            } else {
            this.nOfBed = nOfBed;
            }
            return this.nOfBed; //want to know 
        }

        public int setNofbathroom(int numberofbathroom){
            if (numberofbathroom < 0) {
                this.numberofbathroom = 0;
            } else{
                 this.numberofbathroom = numberofbathroom;
            }
            return this.numberofbathroom;
        }

        public Long getId(){
            return this.id;
        }

        public String getName(){
            return this.name;
        }

        public String getsize(){
            return this.size;
        }

        public int getNumberofBed(){
            return this.nOfBed;
        }

        public int getNumberofBathroom(){
            return this.numberofbathroom;
        }

        @Override //การเขียนทับ   
        public String toString(){
            return String.format("id: %s, Name: %s, size: %s, NumberOfBed: %s, NumberOfBathroom: %s", this.id, this.name, this.size, this.nOfBed, this.numberofbathroom);
        }


}
