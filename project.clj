(defproject pigpen-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.netflix.pigpen/pigpen-pig "0.3.1"]]
  :profiles {:dev {:dependencies [[org.apache.pig/pig "0.13.0"]
                                  [org.apache.hadoop/hadoop-core "1.1.2"]]}}
                 )


