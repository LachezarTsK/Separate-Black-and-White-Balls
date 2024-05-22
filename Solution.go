
package main

import "fmt"

func minimumSteps(input string) int64 {
	var ones int64 = 0
	var minSwapsZeroesAndOnes int64 = 0

	for _, digit := range input {
		if digit == '1' {
			ones++
		} else {
			minSwapsZeroesAndOnes += ones
		}
	}
	return minSwapsZeroesAndOnes
}
