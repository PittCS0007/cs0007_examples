def main():
    fname = input("Enter a filename to read: ")

    try:
        with open(fname) as input_file:
            with open("copy_of_" + fname, "w") as output_file:
                for line in input_file:
                    output_file.write(line)
    except FileNotFoundError as e:
        print(f"File not found: {e}")

main()
