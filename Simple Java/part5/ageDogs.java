package part5;

public class ageDogs {
    public static void main(String[] args){
        int winter = 3;
        int maxy = 7;
        boolean wmSame = winter == maxy;
        boolean wOlder = winter > maxy;
        boolean mOlder = winter < maxy;
        System.out.println("윈터와 맥시는 동갑인가? " + wmSame);
        System.out.println("윈터가 맥시보다 연상인가? " + wOlder);
        System.out.println("맥시가 윈터보다 연상인가? " + mOlder);
    }
}
