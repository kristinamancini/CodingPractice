"""
Writing results from previous exercise to a text file
"""

import requests
from bs4 import BeautifulSoup

url = "https://www.nytimes.com/"
r = requests.get(url)
soup = BeautifulSoup(r.text, "html.parser")

filename = input("File to save to: ")

with open(filename, "w") as f:
  for story_heading in soup.find_all(class_="indicate-hover css-66vf3i"):
    if story_heading.a:
      f.write(story_heading.a.text.replace("\n", " ").strip())
    else:
      f.write(story_heading.contents[0].strip())