(ns user
  (:require
    [clojure.main]
    [cljs.build.api :as cljsbuild]
    [om.next :as om]
    ))

(defn doit []
  (println "building")
  (cljsbuild/build (cljsbuild/ns->source 'testcase.web)
                   {:output-to "testcase.js"
                    :main 'testcase.web
                    :optimizations :advanced}))