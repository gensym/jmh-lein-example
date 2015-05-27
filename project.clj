(defproject jmh-example "0.0.1"
  :description "Example of using JMH to benchmark Clojure code"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.openjdk.jmh/jmh-core "1.9.3"]
                 [org.openjdk.jmh/jmh-generator-annprocess "1.9.3"]]

  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :main org.gensym.jmh.Hello
  :prep-tasks [["compile" "jmh-example.core"] "javac" "compile"]

  :profiles { :benchmark { :main org.openjdk.jmh.Main}}

  )


