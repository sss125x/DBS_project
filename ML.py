import joblib
import pandas as pd
from joblib import load
import sys

pd.set_option('display.max_columns', None)
# Read data
data = pd.read_csv("D:/ObesityDataSet_raw_and_data_sinthetic.csv")
# Drop missing data
data.dropna(inplace=True)
X = data.drop('NObeyesdad', axis=1)  # Features
y = data['NObeyesdad']  # Target variable

# if len(sys.argv) == 2:
tstr = sys.argv[1]
tstr = tstr.replace("=", "\":\"")
tstr = tstr.replace(", ", "\", \"")
tstr = tstr.replace("{", "{\"")
tstr = tstr.replace("}", "\"}")
# print(tstr)
tdict = eval(tstr)
tdict['Gender'] = 'Male'
tdict['Age'] = float(tdict['Age'])
tdict['Height'] = float(tdict['Height'])
tdict['FCVC'] = float(tdict['FCVC'])
tdict['NCP'] = float(tdict['NCP'])
tdict['CH2O'] = float(tdict['CH2O'])
tdict['FAF'] = float(tdict['FAF'])
tdict['TUE'] = float(tdict['TUE'])
tdict['Weight'] = float(tdict['Weight'])

X = X[0:200]
X.iloc[0] = pd.Series(tdict)

X = pd.get_dummies(X)
# print(X.columns)
clf = load('D:/clf.joblib')
# print("开始函数")
y_pred = clf.predict([X.iloc[0]])
# print("执行完成")
print(y_pred)
