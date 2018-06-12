temp=0

while temp != -333:
     temp=int(input("Enter temperature you would to convert to Celsius, or press -333 to exit: "))
    c = ((5.0/9.0) * (float(temp) - 32))
    print(str(temp) + " degrees Fahrenheit is, " + str(c) + " degrees Celsius.")
   