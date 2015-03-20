# storm-time

**Nevermind this.** It's caused by `storm-core` packaging ancient versions of its dependencies, which means they take precedence over my dependencies. Apparently Storm thinks the rest your code base is unimportant: *having* Storm is the goal; actually *doing* anything with it is out of scope.

 ------

Minimal reproduction of an AOT compilation error, which has something do with `storm-core` and `clj-time`. I can't make sense of it at all, but it works like this:

 1. `lein uberjar` -> "java.lang.RuntimeException: No such var: coerce/to-sql-time, compiling:(storm_time/db.clj:9:5)"
 2. Open project.clj and comment out the storm-core dependency
 3. `lein uberjar` -> works fine

I would *love* some help understanding what's going on here and how to fix it.
