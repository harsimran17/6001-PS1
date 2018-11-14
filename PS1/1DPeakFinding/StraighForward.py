user_input = input("Please enter five numbers separated by a single space only: ")
input_numbers = [int(i) for i in user_input.split(' ') if i.isdigit()]
peak = 0

if input_numbers[0]>input_numbers[1]:
    peak=input_numbers[0]

for i in input_numbers[1:-2]:
    if i > input_numbers[i-1] and input_numbers[i]>input_numbers[i+1]:
        peak = input_numbers[i]
        break

if peak==0 and input_numbers[len(input_numbers)-1]>input_numbers[len(input_numbers)-2]:
    peak=input_numbers[len(input_numbers)-1]


print("peak is " + str(peak))