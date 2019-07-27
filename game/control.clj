(ns game.control)


(defn move! [obj vector]
 (set! (.. obj transform position)
       vector))

(defn scale! [obj vector]
 (set! (.. obj transform localScale)
       vector))

(defn rotate! [obj vector]
 (.. obj transform (Rotate vector)))
