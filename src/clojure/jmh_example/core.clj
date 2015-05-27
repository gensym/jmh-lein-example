(ns jmh-example.core
  (:gen-class
   :name org.gensym.jmh.example
   :methods [#^{:static true}[foo [int] int]]))

(defn -foo
  "I don't do a whole lot."
  [x]
  (inc x))
