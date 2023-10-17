def compute(n):
   if n < 10:
       out = n ** 2
#    Here we are making the condition n less than equal to because as the question says
#    take the range from 10 to 20
   elif n <= 20:
       out = 1
#        Here we are adding +1 because the default behaviour of the range is it will go 1 <=i <= n - 9
#        so to make (n - 10) we have to add +1 to the range
       for i in range(1, n-10+1):
           out *= i
   else:
       lim = n - 20
        out = lim * lim
        # Here we are changing the sign from - to + because the formula to calculate sum of all the numbers
        # from 1 to n is = (n * (n + 1)) / 2  i.e by using this formula we can conclude that we just have to change
        # the sing from -  to +
        out = out + lim
        out = out / 2
   print(out)
n = int(input("Enter an integer: "))
compute(n)






