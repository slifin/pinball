(ns game.core
  (:require [arcadia.core :refer :all]
            [game.control :as control])
  (:import [UnityEngine Vector3]))

(defn setup []
 (let [back (create-primitive :plane "back")
       bottom (create-primitive :cube "bottom")])
 (control/move! bottom (Vector3. 0 -5 0))
 (control/scale! bottom (Vector3. 1 1 15))

 (control/move! back (Vector3. 0 0 0))
 (control/rotate! back (Vector3. 0 0 -90)))

(defn setdown []
 ())

