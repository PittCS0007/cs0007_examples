def main():
    print("this is in main")

    a = 5
    print(a - 5)

    a = "foo"
    # print(a - 5)

    a_list = []
    a_list.append(5)
    a_list.append(10)
    a_list.append("foo")
    a_list.append(2.5)

    for item in a_list:
        print(item)

    print(double_even(4))
    print(double_even(5))

    print(repeater("bar", 5))
    print(repeater(10, 5))

def double_even(x):
    if x % 2 == 0:
        return x * 2
    else:
        None

def repeater(s: str, r: int) -> str:
    return s * r

print("this is not")

main()
