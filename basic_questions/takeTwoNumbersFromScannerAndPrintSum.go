package main

import "fmt"

func main() {
	var int1 int
	fmt.Println("enter the first number")
	fmt.Scan(&int1)

	var int2 int
	fmt.Println("enter the second number")
	fmt.Scan(&int2) 

	fmt.Printf("the sum of first and second number is %v", int1+int2)
}