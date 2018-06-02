# coding=utf-8
import numpy as np
import matplotlib.pyplot as plt

# 输入数据

X = np.array([[3, 3],
              [4, 3],
              [1, 1]])
# 标签
# Y = np.array([1,1,-1])
Y = [1, 1, -1]

# 定义参数，初始化都是0,学习步长为1
# 权重
w = np.array([0, 0])
# 截距
b = 0
# 学习步长
o = 1
# 迭代次数
n = 0


# 更新参数
def update(w, b, x, y, o):
    global n
    b = b + o * y
    w = w + o * y * x
    n += 1
    list = [w, b]
    print ('b=', b)
    print ('w=', w)
    return list


temp_Y = Y[0]
temp_X = X[0]
# 设置要迭代的次数
de = 100;

for j in range(de):
    res = update(w, b, temp_X, temp_Y, o)
    for i in range(X.__len__()):
        # 终止条件
        if Y[i] * (np.dot(X[i], res[0]) + res[1]) <= 0:
            temp_X = X[i]
            temp_Y = Y[i]
            w = res[0]
            b = res[1]
            break

print res

# xdata = np.linspace(0,5)
#
# #正样本
# x1 = [3,4]
# y1 = [4,3]
# #负样本
# x2 = [1]
# y2 = [1]
# k=w[0]
# d=b
# plt.figure()
# plt.plot(xdata*w[0],xdata*k+d/w[1],'r')
# plt.plot(x1,y1,'bo')
# plt.plot(x2,y2,'yo')
# plt.show()