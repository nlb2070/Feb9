public class duplicatesinanarray {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 5, 4, 2, 7, 8, 8, 3, 7, 9};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}  