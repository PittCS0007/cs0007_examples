fn main() {
    let x = 5;
    let y: i32 = 7;

    let res = add(x, y);
    println!("{x} + {y} = {res}");

    let mut v = Vec::new();
    v.push("foo");
    v.push("bar");
    v.push("baz");

    for i in v {
        println!("{i}");
    }
}

fn add(a: i32, b: i32) -> i32 {
    a + b
}
