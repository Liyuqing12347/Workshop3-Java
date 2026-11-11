public class Exercise4Squares {
    public static void main(String[] args) {
        //4A sum of squares first 100 integers
        long sumSquare = 0;
        for(int i=1;i<=100;i++){
            sumSquare = sumSquare + (long)i*i;
        }
        System.out.println("4A Sum of squares from 1-100 = " + sumSquare);

        //4B perfect squares 1-100
        System.out.println("\n4B Perfect squares between 1-100:");
        for(int x=1;x<=100;x++){
            double sqrtVal = Math.sqrt(x);
            int rootInt = (int) sqrtVal;
            if(rootInt * rootInt == x){
                System.out.print(x + " ");
            }
        }
    }
}
