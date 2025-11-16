package main

import "fmt"

func main() {

	rows := 4
	column := 5

	for i := 1; i <= rows; i++ {
		for j := 1; j <= column; j++ {
			if i==1|| j==1 || i==rows|| j==column{

				fmt.Print("*")
			}else{

				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
