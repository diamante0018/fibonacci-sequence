using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fibonacci_1._2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter n:");
            int n = Convert.ToInt32(Console.ReadLine());

            if (n < 0)
            {
                Console.WriteLine("Invalid parameters, n must be at least 0.\n No negative Fibonaccis here");
                return;
            }

            Console.Write("Fn is: " + fibonacci(n));
        }

        public static ulong fibonacci(int n)
        {

            if (n == 0)
            {
                return 0L;
            }

            int a = 0, b = 1, c;
            int i = 2;

            while (i <= n)
            {
                c = a + b;
                a = b;
                b = c;
                i++;
            }

            return (ulong) b;
        }
    }
}
