(defproject org.cyverse/common-cli "2.8.0"
  :description "Common CLI functions for the DE backend services and tools"
  :url "http://github.com/cyverse-de/common-cli"
  :license {:name "BSD"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.2"]
                 [trptcolin/versioneer "0.1.0"]])
