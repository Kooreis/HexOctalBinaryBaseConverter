def convert_base(num, to_base=10, from_base=10):
    if isinstance(num, str):
        n = int(num, from_base)
    else:
        n = int(num)
    alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    if n < to_base:
        return alphabet[n]
    else:
        return convert_base(n // to_base, to_base) + alphabet[n % to_base]

def main():
    while True:
        print("\n1. Hexadecimal to Decimal")
        print("2. Hexadecimal to Octal")
        print("3. Hexadecimal to Binary")
        print("4. Decimal to Hexadecimal")
        print("5. Decimal to Octal")
        print("6. Decimal to Binary")
        print("7. Octal to Decimal")
        print("8. Octal to Hexadecimal")
        print("9. Octal to Binary")
        print("10. Binary to Decimal")
        print("11. Binary to Hexadecimal")
        print("12. Binary to Octal")
        print("13. Exit")
        choice = int(input("Enter your choice: "))
        if choice == 13:
            break
        num = input("Enter a number: ")
        if choice == 1:
            print(convert_base(num, from_base=16))
        elif choice == 2:
            print(convert_base(convert_base(num, from_base=16), to_base=8))
        elif choice == 3:
            print(convert_base(convert_base(num, from_base=16), to_base=2))
        elif choice == 4:
            print(convert_base(num, to_base=16))
        elif choice == 5:
            print(convert_base(num, to_base=8))
        elif choice == 6:
            print(convert_base(num, to_base=2))
        elif choice == 7:
            print(convert_base(num, from_base=8))
        elif choice == 8:
            print(convert_base(convert_base(num, from_base=8), to_base=16))
        elif choice == 9:
            print(convert_base(convert_base(num, from_base=8), to_base=2))
        elif choice == 10:
            print(convert_base(num, from_base=2))
        elif choice == 11:
            print(convert_base(convert_base(num, from_base=2), to_base=16))
        elif choice == 12:
            print(convert_base(convert_base(num, from_base=2), to_base=8))

if __name__ == "__main__":
    main()