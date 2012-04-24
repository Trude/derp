(ns derp.logix (:use clojure.test))

(def farger ["red" "green" "yellow" "blue" "purple" "pink"])

(with-test
  (defn testmetode [] "Gerp")
  
  (is (= 1 1)))


(defn mekk-option [farge]
  [:option {:value farge} farge])

(defn mekk-options []
  (map mekk-option farger))

(defn solveit [map]
  (def farge1 (map "farge1"))
  farge1
  )

(run-tests)
