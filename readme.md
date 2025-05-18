# Lost and Found App

A mobile application that helps users report and find lost or found items. Built using **Android Studio (Java)** and **Firebase** services for backend support.

---

## Features

- Upload lost/found item details with image  
- View and search reported items  
- Firebase Authentication (Login/Register)  
- Firebase Realtime Database for item storage  
- Firebase Storage for image hosting  
- Navigation Drawer and Bottom Navigation integration  
- Session management using SharedPreferences  

---

## Tech Stack

- **Frontend**: Android Studio (Java)  
- **Backend**: Firebase (Authentication, Realtime Database, Storage)  
- **Tools**: SharedPreferences, Glide (for image loading)

---

## Image Storage

- Images are uploaded to **Firebase Storage** under the folder `/item_images/`  
- Each image is given a unique name (usually timestamp-based)  
- The image URL is
