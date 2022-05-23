# Instabug Challenge


## First Part: Test Plan for "Yalla Kora" Mobile App.
### Most important scenarios needs to be covered:

| ID | Scenario                                                                                    | Priority |
| -- | ------------------------------------------------------------------------------------------- | -------- |
| 1  | Make sure that the home page contain latest news, the now playing match with updated score. | High     |
| 2  | Mke sure that the dates of matches appear in the user's time zone.                          | High     |
| 3  | Make sure that ads are opening correctly.                                                   | Meduim   |
| 4  | Check all navigations between screens.                                                      | High     |
| 5  | Check the app design                                                                        | Meduim   |
| 6  | Check the notifications                                                                     | Meduim   |
| 7  | Check screen orientation                                                                    | Low      |
| 8  | Check favorite teams and their crud operations                                              | Meduim   |
| 9  | Check the live streaming                                                                    | High     |
| 10 | Check champions screen and champion data                                                    | Meduim   |
| 11 | Check Matches tab and filteration                                                           | Meduim   |
| 12 | Check news tab.                                                                             | Meduim   |
| 13 | Check pagination in all lists                                                               | High     |
| 14 | Use the app in wifi and cellular networks                                                   | Meduim   |

## Second Part: Defects for "Yalla Kora" Mobile App.

All bugs are tested on Infinix Android device, Android version 10, Network wifi and cellular data.

| ID | Title                                                     | Steps                                                                                                                                       | Attachement                                                                                                                                                                          | Priority | Severity | Impact                                                                                            |
| -- | --------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------- | -------- | ------------------------------------------------------------------------------------------------- |
| 1  | Tapping on the notification doesn't open the app          |                                                                                                                                             | [https://drive.google.com/<br>file/d/1mdxMSELXzBzOb<br>BQbLx0UAmQtQsXqhb6z/<br>view?usp=sharing](https://drive.google.com/file/d/1mdxMSELXzBzObBQbLx0UAmQtQsXqhb6z/view?usp=sharing) | High     | Meduim   | The traffic on the app will be reduced as the users<br>won't open the app by themselves for news. |
| 2  | The app doesn't follow the metrial design                 | 1- Open any screen from the app<br>2- compare it with the matrial design https://material.io/                                               |                                                                                                                                                                                      | Low      | Low      | The app won't be attracktive to users.                                                            |
| 3  | Can't close the calendar by any way except selecting date | 1- Open the matches screen.<br>2- Tap on the calendar icon on the top right corner<br>3- try to tap the back button or dismiss the calendar |                                                                                                                                                                                      | Meduim   | Low      | Bad user experience.                                                                              |
| 4  | Too many adds                                             |                                                                                                                                             |                                                                                                                                                                                      | High     | Meduim   | Bad user experience.                                                                              |
| 5  | App size is very big                                      |                                                                                                                                             | [https://drive.google.com/file/d<br>/1mjYoOS6bpR4wyXTsEYL4U<br>OJaaiyy2Z3M/view?usp=sharing](https://drive.google.com/file/d/1mjYoOS6bpR4wyXTsEYL4UOJaaiyy2Z3M/view?usp=sharing)     | Meduim   | Meduim   | Users may uninstall the app                                                                       |
| 6  | A crash happened once while tapping on the calendar       |                                                                                                                                             |                                                                                                                                                                                      | Low      | Critical | Bad user experience.                                                                              |
## Third Part: FaceBook login and signup automation
I have used the page object model design pattern with data driven testing through reading the input data from excell sheet.
It's more like a proof of conncet for using automation in the most priority test cases without covering all cases to save time.


## Fourth Part: Automated tests for Best Buy APIs
I couldn't run the project to get the API requests as recently it seems that the project has an issue

![image](https://user-images.githubusercontent.com/68188476/169729953-86262aaa-228e-4a53-86a8-c252448d211c.png)

But I have searched for Best Buy API Playground postman collection to know the business at least and list the test cases.

Test cases proposed for automation:
- Get all products request.
- Add product.
- Edit product.
- Delete prodcut attached to an order (API should respond with error forbidden 403)
- Delete product belong to anothe user (API should respond with error unauthorized 401)
- Delete product not attached with and other dependencies.

and those cases should be applied on the services and stores APIs.
