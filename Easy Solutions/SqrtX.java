//Runtime: 36 ms
//Memory Usage: 14.3 MB

class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:  return x
        low = 1
        high = x/2

        while (low<=high):
            mid = low + int((high-low)/2)
            guess = mid*mid
            if (guess == x):        return mid
            
            elif (guess < x):       low = mid+1
                
            elif (guess > x):       high = mid-1
                
    
            
        
        return low-1
