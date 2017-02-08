(ns testcase.web
  (:require
   [goog.dom :as gdom]
   [om.dom :as dom]
   [om.next :as om :refer-macros [defui]]
   ))

(defui ^:once Wrapper
  static om/IQuery
  (query [this] [:foo])
  Object
  (render [this]
          nil))

(js/console.log "check1 " (om/iquery? Wrapper))
(js/console.log "check2 " (implements? om/IQuery Wrapper))
