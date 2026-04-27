# KenKen Game (Java)

## 📌 Description

Desktop application developed in Java that implements the KenKen puzzle game.  
The system dynamically generates and solves boards based on configurations defined in XML files.

---

## ⚙️ Technologies

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![XML](https://img.shields.io/badge/XML-005FAD?logo=xml&logoColor=white)

- Java  
- XML (game configuration)  
- Data structures (lists, parsing)  
- Basic concurrency handling (threads)  

---

## 🧩 Project Structure

- `controlador/` → Main execution logic (entry point)  
- `modelo/` → Game logic and data handling  
- `vista/` → UI components (Swing)  

---

## 🚀 How to Run

### ⚙️ Requirements
- Java JDK (version 8 or higher recommended)

---

### ▶️ Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/SrSenior/KenKen.git
   cd KenKen
   ````

2. Compile the project:

   ```bash
   javac controlador/Main.java
   ```

3. Run the application:

   ```bash
   java controlador.Main
   ```

---

### 💡 Notes

* The main class is located at:
  `controlador/Main.java`
* The project follows an MVC structure (Model–View–Controller) for better organization
* Make sure you are running the commands from the root folder of the project
* A sample XML configuration file is included in the project

---

## 🧠 Features

* Load multiple game configurations from XML files
* Dynamic board generation based on size and constraints
* Real-time validation of KenKen rules
* Game customization options:

  * Board size
  * Difficulty level

---

## 📷 Demo

<img width="732" height="499" alt="image" src="https://github.com/user-attachments/assets/fb79b0cc-7e73-4f4c-a3da-59d329efcef2" /><br><br>

<img width="595" height="491" alt="image" src="https://github.com/user-attachments/assets/9f2546aa-7d03-4893-ba8c-b75123e17ffb" /><br><br>

<img width="895" height="631" alt="image" src="https://github.com/user-attachments/assets/47a02ac3-28bf-4487-89d7-5b67f55f4a02" /><br><br>

---

## 💡 What I Learned

* Reading and processing XML files in Java
* Separation between business logic and data configuration
* Structuring a modular Java project
* Using threads for concurrent processes

---

## 📌 Notes

* The XML configuration file is included within the project
* A user manual is provided to facilitate usage

---

## 👤 Author

José Pablo Vega Solano
[GitHub](https://github.com/SrSenior)

```
