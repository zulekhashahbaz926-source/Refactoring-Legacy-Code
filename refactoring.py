class ComputeStatistics:

    def __init__(self, file):
        self.file = file

    def read_numbers(self):
        numbers = []
        with open(self.file, "r") as f:
            for line in f:
                numbers.append(int(line.strip()))
        return numbers

    def count(self):
        return len(self.read_numbers())

    def summation(self):
        return sum(self.read_numbers())

    def average(self):
        numbers = self.read_numbers()
        return sum(numbers) / len(numbers)

    def minimum(self):
        return min(self.read_numbers())

    def maximum(self):
        return max(self.read_numbers())


file = "random_nums.txt"

cs = ComputeStatistics(file)

print("Values:", cs.read_numbers())
print("Total:", cs.count())
print("Sum:", cs.summation())
print("Average:", cs.average())
print("Minimum:", cs.minimum())
print("Maximum:", cs.maximum())
