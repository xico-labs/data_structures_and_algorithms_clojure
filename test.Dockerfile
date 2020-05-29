
FROM clojure

RUN mkdir /code

COPY project.clj /code
COPY . /code

WORKDIR /code
