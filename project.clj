(defproject storm-time "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :main storm-time.core
  :aot :all
  :uberjar :all

  :dependencies [[clj-time "0.8.0"]
                 [org.apache.storm/storm-core "0.9.3"]
                 [postgresql/postgresql "9.3-1102.jdbc4"]
                 [org.clojure/java.jdbc "0.3.5"]])
