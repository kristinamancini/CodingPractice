'''
Use the BeautifulSoup and requests Python packages to print out all of the article text on the given URL.
'''

import requests
from bs4 import BeautifulSoup

base_url = "https://www.vanityfair.com/style/society/2014/06/monica-lewinsky-humiliation-culture"
r = requests.get(base_url)
soup = BeautifulSoup(r.text, features="html.parser")

all_text_body = soup.select("div.body__inner-container > p")

for elem in all_text_body:
  print(elem.text)