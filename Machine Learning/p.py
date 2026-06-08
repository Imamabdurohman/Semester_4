import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Data sederhana (contoh data car/penjualan di materi)
data = {'Tahun': [2010, 2011, 2012, 2013, 2014],
        'Penjualan': [213, 210, 205, 203, 202]}
df = pd.DataFrame(data)

X = df[['Tahun']]
y = df['Penjualan']

model = LinearRegression()
model.fit(X, y)
y_pred = model.predict(X)

print(f"R-Square: {r2_score(y, y_pred)}")
plt.scatter(X, y, color='blue')
plt.plot(X, y_pred, color='red')
plt.title("Linear Regression: Tahun vs Penjualan")
plt.show()