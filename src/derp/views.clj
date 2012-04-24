(ns derp.views
  (:require [noir.response :as response])
  (:use [noir.core]
        [hiccup.page-helpers :only [html5]]
        [hiccup.form-helpers]
        [derp.logix]
        [clojure.test]))




(defpage "/" []
  (html5
   [:head
    [:title "Mastermind"]]
   [:body
    [:h1 "Mastermind"]
     (form-to [:post "/solveit"]
               [:select {:name="farge1"} (mekk-options) ]
               [:select {:name="farge2"} (mekk-options) ]
               [:select {:name="farge3"} (mekk-options) ]
               [:select {:name="farge4"} (mekk-options) ]
               (submit-button "Finn løsning!!!")
     )]))

(defpage [:post "/solveit"] {:as input}
  (html5
   [:head
    [:title "Mastermind"]]
   [:body
    [:h1 "Mastermind"]
    [:h2 farger]]))

(run-tests)