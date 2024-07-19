(defproject org.cyverse/common-cli "2.8.3-SNAPSHOT"
  :description "Common CLI functions for the DE backend services and tools"
  :url "http://github.com/cyverse-de/common-cli"
  :license {:name "BSD"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[jonase/eastwood "1.4.3"]
            [lein-ancient "0.7.0"]
            [test2junit "1.4.4"]]
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [org.clojure/tools.cli "1.1.230"]
                 [trptcolin/versioneer "0.2.0"]])
