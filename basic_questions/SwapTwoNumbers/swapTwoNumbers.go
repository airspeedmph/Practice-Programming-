package main

import "fmt"

func main() {

	a := 10
	b := 20
	fmt.Println("the old values of a and b are ", a, b )
	//swap
	a = a + b
	b = a - b
	a = a - b

	fmt.Printf("the new values of a is %v and b is %v", a, b)
}