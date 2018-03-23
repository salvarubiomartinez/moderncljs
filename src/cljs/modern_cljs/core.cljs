;; create the main project namespace
(ns modern-cljs.core)

;; enable cljs to print to the JS console of the browser
(enable-console-print!)

;; print to the console

(def num (* 3 (+ 3 4)))
(println num)
(println num)
(println "ppp")
