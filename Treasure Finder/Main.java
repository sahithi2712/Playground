a = int(input())
b = int(input())
c = int(input())
x = []
x.append(a)
x.append(b)
x.append(c)
x.sort()
code = 0
print("The treasure is in box which has number",x[1])
for i in range(1,max(x)):
  if(a%i==0):
    if(b%i==0):
      if(c%i ==0):
        code = i
print("The code to open the box is",code)
  