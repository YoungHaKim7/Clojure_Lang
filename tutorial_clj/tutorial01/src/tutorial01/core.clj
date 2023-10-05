(ns tutorial01.core
  (:gen-class))

(defn greet
  "I'll greet you"
  [s]
  (str "Hello " s "!!!"));


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (greet "World"))

  (def aString "Hello")
  (def aDouble 1.234)
  (def aLong 15)
  (format "This is string %s" aString)
  (format "Leading zeros %04d" aLong)
  (format "5 spaces and %5d" aLong)
  (format "%-4d left justified" aLong)
  (format "3 decimals %.3f" aDouble)

  (println "Hello, World!"))
