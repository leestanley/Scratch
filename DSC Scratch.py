from datascience import *

import matplotlib.pyplot as plots
plots.style.use('fivethirtyeight')

import numpy as np

from client.api.notebook import Notebook
ok = Notebook('project01.ok')
_ = ok.auth(inline=True)
