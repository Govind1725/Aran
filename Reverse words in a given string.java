  // code here 
        S+='.';
        String w="";
        String last= "";
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch !='.'){
                w+=ch;
            }
            else{
                if(i!=S.length()-1){
                last= '.'+ w +last;
                w="";
            }
            else{
                last = w + last;
            }
        }
        }
        return last;
    }
}
