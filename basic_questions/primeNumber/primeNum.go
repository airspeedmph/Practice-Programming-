package main

import "fmt"

func main() {

	fmt.Println("enter the number")
	var a int 
	var temp int 

	fmt.Scan(&a)

	if(a<=1){
		fmt.Println("the number is not prime ")
		return
	}

	if (a == 2 ){
		fmt.Println("the number is prime")
		return
	}

	for x:= 2 ; x<= 9;x++ {
		if (a%x==0){
			temp++
		}
	}

	if temp >0{
		fmt.Println("the number is not  prime ")
	}else{
		fmt.Println("the number is  prime ")
	}

}