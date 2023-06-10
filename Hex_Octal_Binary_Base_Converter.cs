```CSharp
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter a number:");
        string input = Console.ReadLine();
        Console.WriteLine("Enter the base of the number (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal):");
        int baseOfInput = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter the base to convert to (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal):");
        int baseToConvertTo = int.Parse(Console.ReadLine());

        int decimalNumber = ConvertToDecimal(input, baseOfInput);
        string convertedNumber = ConvertFromDecimal(decimalNumber, baseToConvertTo);

        Console.WriteLine("The converted number is: " + convertedNumber);
    }

    static int ConvertToDecimal(string number, int baseOfNumber)
    {
        return Convert.ToInt32(number, baseOfNumber);
    }

    static string ConvertFromDecimal(int decimalNumber, int baseToConvertTo)
    {
        return Convert.ToString(decimalNumber, baseToConvertTo);
    }
}
```