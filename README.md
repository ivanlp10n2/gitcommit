CLI application which allows you to create commits from any date range

    requirements:
     - input date range commit (from-to)
     - input range commit for randomizer (min-max)
     - input git repository url
     - input credentials (token)
   

    steps: 
        - clone repository outside this folder
        - create folder inside repository fro changes
        - runloop (
             - create/modify file inside folder to generate new changes
             - add changes
             - commit changes
        )
        - push changes
        - return successful code
   
    + maybe later:
       - create new branch
       - merge branch
       - delete branch after