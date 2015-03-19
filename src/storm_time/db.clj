(ns storm-time.db
  (:require [clj-time.coerce :as coerce]
            [clojure.java.jdbc :as jdbc])
  (:import org.postgresql.util.PGobject))

(extend-protocol jdbc/ISQLValue
  org.joda.time.DateTime
  (sql-value [v]
    (coerce/to-sql-time v)))

(extend-protocol jdbc/IResultSetReadColumn
  java.sql.Date
  (result-set-read-column [date _meta _idx]
    (coerce/from-sql-time date))

  java.sql.Timestamp
  (result-set-read-column [tstamp _meta _idx]
    (coerce/from-sql-time tstamp)))
