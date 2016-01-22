-- Project Euler Problem 4 (Haskell Program)
--
-- Largest palidromic number:
--  
-- A palindromic number reads the same both ways. The largest palindrome made
-- from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
-- palindrome made from the product of two 3-digit numbers.
-- 
-- Author: Rex Cummings
-- Date: 1/22/16


problem4 = 
  maximum [x | y<-[100..999], z<-[y..999], let x=y*z, let s=show x, s==reverse s]
