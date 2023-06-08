# Le - Hotelier
Le Hotelier is a hotel management app which main design is focused on elegance. It has 4 options which can be used to manage the hotel. Those are:

## Installation Guide
1. Install the latest version of JDK (perferaby 20.0.1)
2. Install JavaFX (https://openjfx.io/), make sure that it's sdk matches with the JDK version. Further instruction in setting up javaFX can be found at (https://openjfx.io/openjfx-docs/) 
4. Open the project in Eclipse
5. Click "Build Path" -> "Configure Build Path"
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/57680da5-4dbf-48a2-84da-17fa3f14bd41" alt="Image" style="width: 50%;">

5. Don't forget to add the fontawesomefx-8.2.jar into the build path
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/47614654-1441-4b1a-a3a2-a9a01a49e39a" alt="Image" style="width: 50%;">

## Features
- Hotel Management:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/75ba90a1-9f21-4c50-9d1e-6486c610b466" alt="Image" style="width: 50%;">

- Restaurant Management:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/f512cd26-53a6-44a9-a6b9-9736beba61ed" alt="Image" style="width: 50%;">

- Room Management:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/5089233f-5f0f-48f6-87ee-05a7ba9d48ef" alt="Image" style="width: 50%;">

- Location Finder:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/98917d5a-f574-476d-8be3-3459d979a3dd" alt="Image" style="width: 50%;">

## Hotel Management
Hotel management is an option which can be used to manage the hotel in general. Here are the features which are available in this option:
- Add Employee
- Remove Employee

## Restaurant Management
Restaurant management is an option which can be used to manage the hotel's restaurant. Here are the features which are available in this option:
- Add Server/Chef: 
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/cf450f67-fc64-4305-a936-29aa471be05c" alt="Image" style="width: 50%;">

<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/5fdeedc3-09a0-4441-ae06-9898a542db65" alt="Image" style="width: 50%;">

- View Order List:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/797b1533-a23d-4e12-9a9b-3b63017a16bc" alt="Image" style="width: 50%;">

- View Available Menu:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/36ad5a0d-77b6-4247-8fbd-70281f4235d2" alt="Image" style="width: 50%;">

## Room Management
Room management is an option which can be used to assign room to guests based on the room type they order. Here are the features which are available in this option:

- Register Guest:
- Checkout Guest
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/33455aeb-c1e0-48bb-9b93-3890526324b4" alt="Image" style="width: 50%;">

## Location Finder
Location finder is an option to find all of the hotel's location/s.

<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/6a8bd99e-19c4-4b68-ad9b-9ad1de6f69e1" alt="Image" style="width: 50%;">

# Imported Libraries

Scene Controller Class:
- java.io.IOException;
- javafx.event.ActionEvent;
- javafx.scene.control.*;
- javafx.scene.image.ImageView;
- javafx.scene.input.MouseEvent;
- javafx.scene.transform.Scale;
- javafx.scene.*;
- javafx.stage.*;
- javafx.fxml.*;
- java.awt.Dimension;
- java.awt.Toolkit;
- javafx.scene.paint.Color;

Viewer Controller Class:
- javafx.scene.Parent;
- javafx.scene.Scene;
- javafx.scene.control.*;
- javafx.scene.image.ImageView;
- javafx.scene.input.MouseEvent;
- javafx.scene.transform.Scale;
- java.awt.Dimension;
- java.awt.Toolkit;
- java.io.IOException;
- java.util.ArrayList;
- javafx.stage.*;
- javafx.beans.property.ReadOnlyObjectWrapper;
- javafx.beans.property.SimpleStringProperty;
- javafx.collections.FXCollections;
- javafx.collections.ObservableList;
- javafx.event.ActionEvent;
- javafx.scene.control.cell.PropertyValueFactory;
- javafx.fxml.FXML;
- javafx.fxml.FXMLLoader;
- java.io.BufferedWriter;
- java.io.FileReader;
- java.io.FileWriter;
- java.nio.charset.StandardCharsets;
- java.io.BufferedReader;

# How to Use this App?
1. Login with the correct password (In this case it is admin and password 150603):
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/20bdbd62-3676-4e2f-9657-1965c4e41064" alt="Image" style="width: 50%;">

2. Once you are logged in, you are greeted with the homepage, feel free to select one of the menu:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/a2fce532-e602-430c-b1e3-662aaff06af8" alt="Image" style="width: 50%;">

## Hotel Management
1. You are greeted with this table view which displays the existing employees and 2 buttons which show the option to add and delete the employee:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/75ba90a1-9f21-4c50-9d1e-6486c610b466" alt="Image" style="width: 50%;">

2. To add the employee, simply click the add button and then enter the employee's name if done just click the add button then back:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/a9435694-393e-4a58-8f70-9509db5cf6c8" alt="Image" style="width: 50%;"> 

3. To delete, just click the employee from the table view and click the delete button.

## Restaurant Management
### Chef
1. You are greeted with this table view which displays the existing chefs and 2 buttons which show the option to add and delete the chef:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/cf450f67-fc64-4305-a936-29aa471be05c" alt="Image" style="width: 50%;">

2. To add the chef, simply click the add button and then enter the chef's name if done just click the add button then back:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/f0556c16-605c-4152-b21e-12eab38d237b" alt="Image" style="width: 50%;"> 

3. To delete, just click the chef from the table view and click the delete button.

### Server
1. You are greeted with this table view which displays the existing servers and 2 buttons which show the option to add and delete the server:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/8cf99405-f022-45a9-91fe-eac331bc5317" alt="Image" style="width: 50%;">

2. To add the server, simply click the add button and then enter the chef's name if done just click the add button then back:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/60fd02ae-7d56-4def-be34-636de3ca250b" alt="Image" style="width: 50%;">

3. To delete, just click the server from the table view and click the delete button.

### Menu
To view the menu, you can just click the menu icon in the restaurant management menu, this will display all of the available menu:

<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/36ad5a0d-77b6-4247-8fbd-70281f4235d2" alt="Image" style="width: 50%;">

### Order
To view/order orders, you can just click the order icon in the restaurant management menu, this will display all of the orders, but there are no orders right now:

<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/797b1533-a23d-4e12-9a9b-3b63017a16bc" alt="Image" style="width: 50%;">

## Room Management
1. You are greeted with these icons which display 2 options, those being Guest and Rooms. The Guest option is used to checkin and checkout guests, the Rooms option was planned to be able to see rooms which are empty and occupied but it is still under development, therefore let's focus to the Guest option:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/5089233f-5f0f-48f6-87ee-05a7ba9d48ef" alt="Image" style="width: 50%;">

2. You are greeted with this table view which displays the existing guests and 2 buttons which show the option to add and delete the guest:

<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/33455aeb-c1e0-48bb-9b93-3890526324b4" alt="Image" style="width: 50%;">

3. To add the guest, simply click the add button and then enter all the necessary details (Note that for the room type, there are only 3 supported. Those being: Economy, Deluxe, and Business), if done just click the add button then back:
<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/82f5075b-a3de-41ea-ad17-6226b17b7d4c" alt="Image" style="width: 50%;"> 

4. To checkout a guest, just click the guest inside the table view and click the delete button.

## Locations
1. You are greeted by the available locations of the hotel, just see them:

<img src="https://github.com/Tekn-drive/Le-Hotelier/assets/89509753/6a8bd99e-19c4-4b68-ad9b-9ad1de6f69e1" alt="Image" style="width: 50%;">






