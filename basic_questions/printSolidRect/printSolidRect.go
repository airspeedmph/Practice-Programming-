package main

import "fmt"

func main() {

	rows := 4
	column := 5

	for i := 1; i <= rows; i++ {
		for j := 1; j <= column; j++ {
			fmt.Print("*")
		}
		fmt.Println()

	}
}