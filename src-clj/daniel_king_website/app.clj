(ns daniel-king-website.app
  (:require [compojure.handler :as handler]
            [hiccup.middleware :refer [wrap-base-url]]
            [daniel-king-website.routes :as routes]))

(def app
  (-> (handler/site routes/main-routes)
      (wrap-base-url)))