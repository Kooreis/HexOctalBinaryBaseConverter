# Python Documentation

# Base Conversion Script

This Python script provides a simple interface for converting numbers between different bases. The supported bases are decimal (base 10), hexadecimal (base 16), octal (base 8), and binary (base 2).

## Functionality

The script provides the following conversion options:

1. Hexadecimal to Decimal
2. Hexadecimal to Octal
3. Hexadecimal to Binary
4. Decimal to Hexadecimal
5. Decimal to Octal
6. Decimal to Binary
7. Octal to Decimal
8. Octal to Hexadecimal
9. Octal to Binary
10. Binary to Decimal
11. Binary to Hexadecimal
12. Binary to Octal

The user can select the desired conversion option, input the number to be converted, and the script will output the converted number.

## Code Explanation

The script contains two main functions: `convert_base` and `main`.

### `convert_base` Function

This function takes three parameters: `num` (the number to be converted), `to_base` (the base to convert to), and `from_base` (the base to convert from). The default values for `to_base` and `from_base` are 10 (decimal).

The function first checks if `num` is a string. If it is, it converts `num` to an integer using the `from_base`. If `num` is not a string, it is directly converted to an integer.

The function then uses a recursive algorithm to convert the number to the desired base. It uses the division method for base conversion, which involves repeatedly dividing the number by the base and appending the remainder to the result.

### `main` Function

This function provides an interface for the user to interact with the script. It displays the available conversion options and prompts the user to select an option and input a number. It then calls the `convert_base` function with the appropriate parameters based on the user's selection.

## Libraries

This script does not import any external libraries. It only uses built-in Python functions and features.

---

# C# Documentation

# Number Base Converter in C#

This C# script is a simple console application that converts a number from one base to another. The user is prompted to input a number, the base of the input number, and the base to which the number should be converted. The script then performs the conversion and outputs the result.

## Libraries Used

The script uses the `System` namespace from the .NET Framework Class Library. This namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.

## Code Explanation

The script contains a `Main` method and two helper methods: `ConvertToDecimal` and `ConvertFromDecimal`.

- `Main` method: This is the entry point of the script. It prompts the user to enter a number, the base of the number, and the base to which the number should be converted. It then calls the helper methods to perform the conversion and outputs the result.

- `ConvertToDecimal` method: This method takes a string representation of a number and its base as arguments. It uses the `Convert.ToInt32` method from the `System` namespace to convert the number to a decimal (base 10) number.

- `ConvertFromDecimal` method: This method takes a decimal number and a base as arguments. It uses the `Convert.ToString` method from the `System` namespace to convert the decimal number to a number in the specified base.

## Usage

To use this script, you need to have a C# compiler installed on your machine. You can then compile and run the script from the command line. When prompted, enter a number, the base of the number, and the base to which the number should be converted. The script will then output the converted number.

---

# Java Documentation

# Base Converter in Java

This Java script is a base converter that allows the user to convert numbers between different bases: binary, decimal, hexadecimal, and octal. The script provides a menu for the user to select the conversion they want to perform. The user can continue to perform conversions until they choose to exit the program.

## Script Explanation

The script begins by importing the `java.util.Scanner` class, which is a simple text scanner that can parse primitive types and strings using regular expressions. It is used in this script to read the user's input from the standard input (keyboard).

The script then defines a `BaseConverter` class with a `main` method. This method is the entry point for any Java application.

The `main` method starts by creating a `Scanner` object to read the user's input. It then enters a loop where it presents a menu to the user and performs the conversion selected by the user. The loop continues until the user chooses to exit the program.

The menu is implemented as a `switch` statement that checks the user's choice and performs the corresponding conversion. The conversions are performed using the `Integer.parseInt`, `Integer.toBinaryString`, `Integer.toHexString`, and `Integer.toOctalString` methods from the `java.lang.Integer` class.

## Imported Libraries

- `java.util.Scanner`: This class is a simple text scanner which can parse primitive types and strings. It breaks its input into tokens using a delimiter pattern, which by default matches whitespace. It's used in this script to read the user's input from the standard input (keyboard).

## Usage

To use this script, compile it with a Java compiler and run it. When the menu appears, enter the number of the conversion you want to perform, then enter the number you want to convert. The script will display the result of the conversion. You can perform as many conversions as you want. To exit the program, enter `13` at the menu.

---
