# E-Commerce RESTful API

A Spring Boot RESTful API for managing products in an e-commerce system with full CRUD operations.

## Features

- ✅ Create new products
- ✅ Retrieve all products
- ✅ Retrieve product by ID
- ✅ Update existing products
- ✅ Delete products
- ✅ Search products by category

## Technologies Used

- **Java 17**
- **Spring Boot 4.0.2**
- **Spring Data JPA**
- **PostgreSQL Database**
- **Maven**

## Prerequisites

Before running this application, ensure you have:

- Java 17 or higher installed
- PostgreSQL installed and running
- Maven installed
- Git installed

The application will start on `http://localhost:8089`

## API Endpoints

### Base URL: `http://localhost:8089/api/products`

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/addProduct` | Create a new product |
| GET | `/` | Get all products |
| GET | `/{id}` | Get product by ID |
| PUT | `/{id}` | Update a product |
| DELETE | `/{id}` | Delete a product |
| GET | `/search?category={category}` | Search products by category |

## API Usage Examples

### 1. Create a Product
```bash
POST http://localhost:8089/api/products/addProduct
Content-Type: application/json

{
  "name": "Laptop",
  "description": "High-performance laptop",
  "price": 999.99,
  "category": "Electronics",
  "stockQuantity": 50,
  "brand": "Dell"
}
```

### 2. Get All Products
```bash
GET http://localhost:8089/api/products
```

### 3. Get Product by ID
```bash
GET http://localhost:8089/api/products/1
```

### 4. Update a Product
```bash
PUT http://localhost:8089/api/products/1
Content-Type: application/json

{
  "name": "Laptop Pro",
  "description": "Updated high-performance laptop",
  "price": 1299.99,
  "category": "Electronics",
  "stockQuantity": 30,
  "brand": "Dell"
}
```

### 5. Delete a Product
```bash
DELETE http://localhost:8089/api/products/1
```

### 6. Search by Category
```bash
GET http://localhost:8089/api/products/search?category=Electronics
```

## Product Model

```json
{
  "id": "Long (Auto-generated)",
  "name": "String (Required, Unique)",
  "description": "String",
  "price": "Double",
  "category": "String",
  "stockQuantity": "Integer",
  "brand": "String"
}
```

## Project Structure

```
restfullApiAssignment/
├── src/
│   └── main/
│       ├── java/
│       │   └── auca/ac/rw/restfullApiAssignment/
│       │       ├── controller/
│       │       │   └── ProductController.java
│       │       ├── modal/
│       │       │   └── ecommerce/
│       │       │       └── Product.java
│       │       ├── repository/
│       │       │   └── ProductRepository.java
│       │       ├── service/
│       │       │   └── ProductService.java
│       │       └── RestfullApiAssignmentApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

## Testing with Postman

1. Import the API endpoints into Postman
2. Set the base URL to `http://localhost:8089/api/products`
3. Test each CRUD operation using the examples above

## Error Handling

The API returns appropriate HTTP status codes:

- `200 OK` - Successful GET, PUT, DELETE
- `201 CREATED` - Successful POST
- `404 NOT_FOUND` - Resource not found
- `302 FOUND` - Search results found

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Author

Ntwari Guillain
- GitHub: [ntwariguillain](https://github.com/ntwariguillain)

## License

This project is created as an academic assignment.

## Acknowledgments

- AUCA (Adventist University of Central Africa)
- Spring Boot Documentation
- PostgreSQL Documentation
