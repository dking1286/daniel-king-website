(ns daniel-king-website.core
  (:require 
    [reagent.core :as r]
    [daniel-king-website.components.app-container :refer [app-container]]))

(enable-console-print!)

(println "Hello world!")

(defn run []
  (r/render
    [app-container]
    (js/document.getElementById "app")))

(js/document.addEventListener "DOMContentLoaded" run)

