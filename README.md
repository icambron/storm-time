# storm-time

Minimal reproduction of an AOT compilation error, which has something do with `storm-core` and `clj-time`. I can't make sense of it at all, but it works like this:

 1. `lein uberjar` -> "java.lang.RuntimeException: No such var: coerce/to-sql-time, compiling:(storm_time/db.clj:9:5)"
 2. Open project.clj and comment out the storm-core dependency
 3. `lein uberjar` -> works fine

I would *love* some help understanding what's going on here and how to fix it.
