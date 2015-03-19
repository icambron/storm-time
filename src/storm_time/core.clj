(ns storm-time.core
  (:require [clj-time.coerce :as coerce]
            [storm-time.db :as db])
  (:gen-class))

(defn -main [& args]
  (println (coerce/to-sql-date (org.joda.time.DateTime.))))
