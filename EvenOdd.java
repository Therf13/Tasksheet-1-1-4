class Controlflow
{
    public static void main(String[] args)
    {
        int check_number = 10;
        for (int i=1; i <=check_number; i++)
            if (i%2==0) {
                System.out.println(i + " is Even Number");
            }
            else {
                System.out.println(i + " is Odd Number");
            }
    }
}
