import math

import datascience
import numpy as np

# rice_6 = 2 ** np.arange(0, 6)
# print(rice_6)

# #print(2 ** 64)

# rice_grains = 2 ** np.arange(0, 64)
# # print(rice_grains)

# sum = np.sum(rice_grains)
# print(sum)
# print(np.arange(1930, 2019, 4))

# cat = Table().with_columns(
#     "cat", [1, 2, 3],
#     "dog", [3, 2, 1]
# )
# print(np.random.choice(np.arange(1, 21)))
#observed = np.array(3)
# for
#     roll_result = np.random.choice(np.arange(7))
#     observed = np.append(observed, roll_result)
# print(roll_result)

# observed = []


# def simulate_observations():
#     """Produces an array of 7 simulated modified die rolls"""
#     #roll_result = np.random.choice(np.arange(7))
#     print("Works")
#     for i in range(7):
#         print("Works")
#         roll_result = np.random.choice(np.arange(1, 21))
#         modified_result = roll_result + 11
#         print(modified_result)
#         observed = np.append(observed, modified_result)
#         print(observed)
#     return observed


# print(simulate_observations())

# from urllib.parse import urlencode
# from urllib.request import Request, urlopen

# url = 'https://web.spin.pm/api/v1/auth_tokens'  # Set destination URL here
# post_fields = {'https://web.spin.pm/api/v1/auth_tokens': 'bar'}     # Set POST fields here

# request = Request(url, urlencode(post_fields).encode())
# json = urlopen(request).read().decode()
# print(json)
import requests
import json
userdata = {"device": {"mobileType": "ios", "uid":":“123E4567-E89B-12D3-A456-426655440000"}, "grantType": "device"}
response = requests.post("https://web.spin.pm/api/v1/auth_tokens", json=userdata)

#print(response)
print json.dumps(response, indent=4)
