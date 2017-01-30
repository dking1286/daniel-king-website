(ns daniel-king-website.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [daniel-king-website.views :as views]))

(defroutes main-routes
  (GET "/" [] (views/index))
  (route/resources "/")
  (route/not-found (views/not-found)))