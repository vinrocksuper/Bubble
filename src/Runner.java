public class Runner {
    public static void main(String[] args)
    {
        int[] arr = new int[1000];
        for(int i=0;i<1000;i++)
        {
            arr[i] = (int)(Math.random()*1000);
        }
        int check = arr.length-1;
        String str ="";
        for(int i=0;i<arr.length;i++)
        {
            str += "[ " + arr[i] + " ]";
        }
        System.out.println(str);
        int sortCount =0;
        boolean swap = true;
        long time = System.nanoTime();
        while(swap) {

            int j = 1;
            swap = false;
            if (check == arr.length - 1) {
                for (int i = 0; i < arr.length - 1; i++) {

                    if (arr[j] < arr[i]) {
                        swap(arr, i, j);
                        swap = true;
                        for(int z = 0; z < arr.length;z++) {
                            str ="";
                            for(int u=0;u<arr.length;u++)
                            {
                                str += "[ " + arr[u] + " ]";
                            }



                        }
                        sortCount++;
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
                            for(int z = 0; z < arr.length-1;z++) {
                                str = "";
                                for(int u=0;u<arr.length;u++)
                                {
                                    str += "[ " + arr[u] + " ]";
                                }
                                sortCount++;
                            }

                        }
                        if (arr[j] > arr[i]) {
                            check = j;
                        }
                        j++;
                    }
            }

        }
        System.out.println((System.nanoTime() - time)/(1000000000) +  "Seconds");

        System.out.println(str +"  " + sortCount);
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

}
