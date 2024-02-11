# BlogShot Blogging App

## Requirements

Users
Articles
Comments

#### Additional Requirements

Likes
Follows

## JSON Entities

### User

```json
{
    "id":52335,
    "usersname": "swvaibhav",
    "email": "swvaibhav@google.com",
    "password": "saltedhashed",
    "authToken": "jdsfih2h432nf2ien345h2fini234h",
    "bio": "Creator of the app",
    "image": "https://imgur.com/myphoto.png
}
```

### Article

```json
{
    "id": 134342,
    "title": "How this app came into being",
    "slug": "how-blogshot-was-made",
    "subtitle": "An article about creting this app",
    "body": "This is an article about... <b>the app</b>...",
    "createdAt": "2022-02-06 03:40:55",
    "tage": ["technology", "spring boot"]
}
```

### Comments

```json
{
    "id":24524,
    "title": "great article",
    "body": "loved reading this",
    "createdAt": "2022-02-07 04:34:43"
}
```

## API Endpoints

### `POST /users`

#### Description

Add a user.

### `POST /users/login`

### `GET /profiles`

### `GET /profiles/{username}`

### `GET /articles` [📃](## "Pagination Supported")

#### Description
Get all articles matching the given filters.
- Default page size = 10

#### Parameters

- ##### tag - `OPTIONAL`
    *String*\
    Filter results by Tag
- #### author - `OPTIONAL`
    *String*\
    Filter results by Author
- #### page - `OPTIONAL`
    *Integer*\
    Pagination page
- #### size - `OPTIONAL`
    *Integer*\
    Pagination size

### `POST /articles` [🔑](## "Login Required")

#### Description
Create a new article.

### `PATCH /articles/{article-slug}` [🔑](## "Login Required")[👤](## "Personalization")

#### Description
Edit an article.

### `GET /article/{article-slug}/comments` [📃](## "Pagination Supported")

#### Description
Get all the comments on an article.

### `POST /article/{article-slug}/comments` [🔑](## "Login Required")

#### Description
Post a comment on an article.

### `DELETE /article/{article-slug}/comments/{comment-id}` [🔑](## "Login Required")[👤](## "Personalization")

#### Description
Delete a comment on an article.
