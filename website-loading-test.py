import unittest
from selenium import webdriver

class WebsiteLoadingTest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome('/usr/bin/chromedriver')  # Change the driver based on your preferred browser

    def test_website_load(self):
        self.driver.get('https://atg.world')
        title = self.driver.title
        print("Website Title:", title)
        self.assertTrue("ATG.World" in title)

    def tearDown(self):
        self.driver.quit()

if __name__ == '__main__':
    unittest.main() 
