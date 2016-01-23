-- Project Euler - Problem7
--
-- 10001st prime:
--
-- Find the 10001st prime.
--
-- Author: Rex Cummings
-- Date: 1/23/16

primes = 2 : filter (null . tail . primeFactors) [3,5..]
 
primeFactors n = factor n primes
  where
    factor n (x:xs) 
        | x*x > n        = [n]
        | n `mod` x == 0 = x : factor (n `div` x) (x:xs)
        | otherwise      =     factor n xs

problem7 = primes !! 10000
