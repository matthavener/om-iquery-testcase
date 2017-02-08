(defproject compassus-wrapper-testcase "0.1.0-SNAPSHOT"
  :description "compassus-wrapper-testcase"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [org.clojure/clojurescript "1.9.293"]
                 [org.omcljs/om "1.0.0-alpha47"]
                 ]
  :repl-options {:init-ns user}
  :profiles {:dev {:source-paths ["env/dev"]}}
  )
