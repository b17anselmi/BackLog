mssg ="Enter temperature you would to convert to Celsius, or type -333 to exit: "
temp=int(input(mssg))
float(temp)

while True:
    if temp % -333.0 != 0.0:
        c = ((5.0/9.0) * (temp - 32))
        print(str(temp) + " degrees Fahrenheit is " + str(c) + " degrees Celsius.")
        temp=float(input(mssg))
   