import pandas as pd

admissions = pd.read_csv('../scratch/Admission_Predict.csv')
print(admissions.loc[0:10, 'GRE Score'])
print(admissions)
