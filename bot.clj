;; First bot. Started 062516 for Battlebots hackathon

(defn run
  [{:keys [arena state bot_id energy spawn-bot?] :as step-details}]
  {:commands [{:cmd "MOVE"
               :metadata {:direction (rand-nth [0 1 2 3 4])}}
              {:cmd "SET_STATE"
               :metadata {:foo "bar"}}]})
