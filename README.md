Here's your README with additional ASCII box decorations for the code snippets:

---

# 🚀 SuperSuciveApi 🌐

Welcome to **SuperSuciveApi**, a mock application of a national payment system built with Jakarta, Maven, and deployed on WildFly. This project showcases a SOAP web service implementation that allows users to submit payment details and receive a response indicating the success or failure of the payment processing.

## 🌟 Features

- **SOAP Web Service**: Implementation of a SOAP web service for submitting payments.
- **Jakarta EE**: Utilizes Jakarta EE for building robust and scalable enterprise applications.
- **WildFly**: Deployed on WildFly application server for high performance and reliability.
- **Maven**: Managed with Maven for easy project build and dependency management.
- **JUnit**: Unit tests implemented using JUnit 5.

## 🛠 Technologies Used

- **Jakarta EE**: For building the enterprise application.
- **SOAP**: For the web service communication.
- **WildFly**: As the application server.
- **Maven**: For project build and dependency management.
- **JUnit**: For testing the application.

## 📂 Project Structure

```
SuperSuciveApi
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── sucive
│   │   │       ├── Sucive.java
│   │   │       └── SuciveImp.java
│   │   └── resources
│   │       └── web.xml
│   └── test
│       └── java
│           └── sucive
│               └── SuciveTest.java
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- **JDK 11**: Ensure you have JDK 11 installed.
- **Maven**: Ensure you have Maven installed.
- **WildFly**: Ensure you have WildFly application server installed and running.

### Installation

1. **Clone the repository**:


   ```
   ┌─────────────────────────────────────────────────────────────┐
   │ git clone https://github.com/lucianorosalasiu/SuperSuciveApi │
   │ cd SuperSuciveApi                                            │
   └─────────────────────────────────────────────────────────────┘
   ```

2. **Build the project**:


   ```
   ┌──────────────────────────┐
   │ mvn clean install        │
   └──────────────────────────┘
   ```

3. **Deploy the application on WildFly**:



   ```
   ┌──────────────────────────┐
   │ mvn wildfly:deploy       │
   └──────────────────────────┘
   ```

## 🌐 SOAP Web Service

### WSDL

The WSDL for the `SubmitPayment` service is available at:
```
http://localhost:8080/SuciveMockU-1.0-SNAPSHOT/SuciveImp?wsdl
```

### Example SOAP Request

Here is an example of a SOAP request to submit a payment:



```
┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
│ <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns="http://unknown.namespace/">        │
│    <soapenv:Header/>                                                                                                     │
│    <soapenv:Body>                                                                                                        │
│       <ns:SubmitPayment>                                                                                                 │
│          <arg0>ABC123</arg0>                                                                                             │
│          <arg1>123.45</arg1>                                                                                             │
│       </ns:SubmitPayment>                                                                                                │
│    </soapenv:Body>                                                                                                       │
│ </soapenv:Envelope>                                                                                                      │
└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘
```

### Example SOAP Response

If the service processes the payment successfully, the response will be:



```
┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
│ <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">                                             │
│    <soapenv:Header/>                                                                                                     │
│    <soapenv:Body>                                                                                                        │
│       <ns:SubmitPaymentResponse xmlns:ns="http://unknown.namespace/">                                                    │
│          <ns:return>Payment processed successfully.</ns:return>                                                         │
│       </ns:SubmitPaymentResponse>                                                                                        │
│    </soapenv:Body>                                                                                                       │
│ </soapenv:Envelope>                                                                                                      │
└─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘
```

## 🧪 Running Tests

To run the unit tests, use the following command:


```
┌──────────────────────────┐
│ mvn test                 │
└──────────────────────────┘
```

## 🎉 Conclusion

This project demonstrates a basic implementation of a SOAP web service using Jakarta EE, Maven, and WildFly. Feel free to explore and contribute to enhance the functionality!

---

Feel free to replace `lucianorosalasiu` with your actual GitHub username or repository URL if needed. This README should give a comprehensive overview of your project, including how to set it up and use it.
