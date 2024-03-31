
public class exm{
	public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int max = getMax(a, b);
        System.out.println("The maximum of is"+ max);
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }
}