public class SummedMatrix 
{
    public static long query(long n, long q) 
    {
        int T= 0;
      for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if (i + j == q) 
                {
                    T++;
                }
            }
        }
        return T;
    }
}
