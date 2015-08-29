(ns base.core
    (:gen-class))

(defn -main
    "info for class"
    [& args]
    (println "count: " (count args) " :" args))
