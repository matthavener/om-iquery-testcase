(ns user
  (:require
    [cljs.build.api :as cljsbuild]))

#_(Thread/setDefaultUncaughtExceptionHandler
 (reify Thread$UncaughtExceptionHandler
   (uncaughtException [_ thread ex]
     (println "uncaught exception: " (.getMessage ex) (.getName thread))
     (.printStackTrace ex)
     (log/error ex "Uncaught exception on thread: " (.getName thread)))))


(defn doit []
  (println "building")
  (require '[om.next :as om])
  (cljsbuild/build (cljsbuild/ns->source 'testcase.web)
                   {:output-to "testcase.js"
                    :main 'testcase.web
                    :optimizations :advanced}))