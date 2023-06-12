using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter a number:");
        string input = Console.ReadLine();
        Console.WriteLine("Enter the base of the number (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal):");
        int baseOfInput = int.Parse(Console.ReadLine());
    }
}