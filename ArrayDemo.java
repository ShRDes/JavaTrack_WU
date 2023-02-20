public class ArrayDemo {
    public static void main(String[] args) {
       int arr[]  = new int[5];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 450;
        arr[4] = 700;

        for(int ele : arr)
            System.out.println(ele);

       /*  //traditional for loop, when i want index postions
        for(int i=0; i< arr.length; i++)
            System.out.println(arr[i]);

        //Java 5 : enhanced for loop
        for(int ele : arr)
            System.out.println(ele);

        int[] arr = {10,20,30,40,50};

        for(int i : arr)
            System.out.println(i*i);

       // float temp[] = new float[10];
        float temp[] = {8.4f, 12.4f, 10.1f};
        for(float f : temp)
            System.out.println(f);

        char[] carr = {'a','-','|',' ','^','6'};
        for(char ch : carr)
            System.out.println(ch);

        boolean barr[] = {true, false, false, true};
        for(boolean b : barr)
            System.out.println(b);*/

        String[] names = new String[3];
        names[0] = "Sejal";
        names[1] = "Gauri";
        names[2] = "Avinash";

        String[] empnames = {"Rishabh","Sarang","Hiral","Mihir"};

        for(String s : empnames)
            System.out.println(s);


    }
}
