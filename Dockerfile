FROM clojure
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/common-cli

COPY project.clj /usr/src/common-cli/
RUN lein deps

COPY . /usr/src/common-cli
CMD ["lein", "test"]
