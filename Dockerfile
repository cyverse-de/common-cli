FROM clojure
COPY . /usr/src/common-cli
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/common-cli
RUN lein deps
CMD ["lein", "test"]
