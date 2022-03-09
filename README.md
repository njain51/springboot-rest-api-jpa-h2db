# springboot-rest-api-jpa-h2db

# GET request
```text
curl --location --request GET 'http://localhost:9091/courses' \
--header 'Content-Type: application/json' \
--data-raw '{
        "id": 4300,
        "title": "Groovy Course",
        "description": "All about Java Groovy for Begineers"
    }'
```

output:
```text
[
    {
        "id": 4100,
        "title": "XML Course",
        "description": "All about XML Courses for Begineers"
    },
    {
        "id": 4200,
        "title": "Java Course",
        "description": "All about Java Courses for Begineers"
    },
    {
        "id": 4300,
        "title": "Groovy Course",
        "description": "All about Java Groovy for Begineers"
    }
]
```

- similarly, POST, UPDATE, DELETE should work