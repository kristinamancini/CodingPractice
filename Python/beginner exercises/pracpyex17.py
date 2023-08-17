'''
Use the BeautifulSoup and requests Python 
packages to print out a list of all the 
article titles on the New York Times homepage.
Note: My first web scraper!
-you had to put html.parser in the soup object, 
check the documentation!
'''

import requests
from bs4 import BeautifulSoup

url = "https://www.nytimes.com/"
r = requests.get(url)
soup = BeautifulSoup(r.text, "html.parser")

for story_heading in soup.find_all(class_="indicate-hover css-66vf3i"):
  if story_heading.a:
    print(story_heading.a.text.replace("\n", " ").strip())
  else:
    print(story_heading.contents[0].strip())