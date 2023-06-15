package main

import (
	"fmt"
	"math/rand"
	"strings"
)

func main() {
	var answer = "y"


	for strings.EqualFold(answer, strings.ToLower("Y")) {
		min := 1
    	max := 6
		var numbers = rand.Intn(max-min+1) + min
		diceRoll(numbers)
		fmt.Println("_______________________________")
		fmt.Println("Press 'Y' or 'y' to continue and to quite press any key except 'y'")
		fmt.Scanln(&answer)
	}

}

func diceRoll(num int) {
	switch num {
	case 1:
		fmt.Println("[       ]")
		fmt.Println("[   *   ]")
		fmt.Println("[       ]")
	case 2:
		fmt.Println("[   *   ]")
		fmt.Println("[       ]")
		fmt.Println("[   *   ]")
	case 3:
		fmt.Println("[   *   ]")
		fmt.Println("[   *   ]")
		fmt.Println("[   *   ]")
	case 4:
		fmt.Println("[*     *]")
		fmt.Println("[       ]")
		fmt.Println("[*     *]")
	case 5:
		fmt.Println("[*     *]")
		fmt.Println("[   *   ]")
		fmt.Println("[*     *]")
	case 6:
		fmt.Println("[*     *]")
		fmt.Println("[*     *]")
		fmt.Println("[*     *]")
	}
}