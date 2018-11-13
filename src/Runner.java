public class Runner {
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,4,3,6,5};
        int check = arr.length-1;

        boolean swap = true;
        while(swap) {
            int j = 1;
            swap = false;
            if (check == arr.length - 1) {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[j] < arr[i]) {
                        swap(arr, i, j);
                        swap = true;
                        for(int z = 0; z < arr.length;z++) {
                            System.out.println(arr[z]);
                        }
                    }
                    if (arr[j] > arr[i]) {
                        check = j;
                    }
                    j++;
                }
            }
            if(check != arr.length-1)
            {
                    for (int i = 0; i < check; i++) {
                        if (arr[j] < arr[i]) {
                            swap(arr, i, j);
                            swap = true;
                            for(int z = 0; z < arr.length;z++) {
                                System.out.println(arr[z]);
                            }
                        }
                        if (arr[j] > arr[i]) {
                            check = j;
                        }
                        j++;
                    }
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

}
