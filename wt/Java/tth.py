#text to handwritten

import pytesseract
from PIL import Image
import cv2
import numpy as np
import os

def text_to_handwritten(img_path, output_path):
    img = cv2.imread(img_path)
    img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    img = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU)[1]
    img = cv2.medianBlur(img, 3)
    kernel = np.ones((1, 1), np.uint8)
    img = cv2.dilate(img, kernel, iterations=1)
    img = cv2.erode(img, kernel, iterations=1)
    cv2.imwrite(output_path, img)
    return pytesseract.image_to_string(Image.open(output_path))

def main():
    img_path = './test.jpg'
    output_path = './output.jpg'
    text = text_to_handwritten(img_path, output_path)
    print(text)

if __name__ == '__main__':
    main()
