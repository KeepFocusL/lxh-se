package day240512.p;

public class Room extends MyObjectUtil{
    //Room[]（按面积 area）
    int area;
    public Room(int area){
        this.area=area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                '}';
    }

    @Override
    public int compareTo(MyObjectUtil myObjectUtil) {
        return 0;
    }
}
