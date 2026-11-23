a = int(input())
b = int(input())

b1 = b%10
b2=((b%100)-b1)/10
b3=(b-b2*10-b1)/100

print(b1*a)
print(int(b2*a))
print(int(b3*a))
print(a*b)