
public class GetMultiple {
	public static void main(String[] args){
		System.out.println(getMultiple(428,16));
	}
    private static int getMultiple(int x, int n){
        int count = 1;
        int temp = n;
    	while(n < x){
        	n = temp * count;
        	count++;
        }
        return n;
    }
}
//428,16
//518,64
//2009,128
//1585,1024
//1769,8
//402,2
//1696,4
//404,32
//1424,256
//1728,512