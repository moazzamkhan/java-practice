class MultiplesOf3And5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 1001; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) ;
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
