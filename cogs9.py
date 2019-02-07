import pandas as pd

admissions = pd.read_csv("C:/Users/Stanley/Desktop/Scratch/Admission_Predict.csv")
print(admissions.head)
print(admissions.loc[admissions["Research"] == 1])
print(admissions.iloc[1])
