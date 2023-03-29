          //Your code here
            String s="";
          char temp=str.charAt(0);
          int count=0;
          for(int i=0;i<str.length();i++)
          {
              char ch=str.charAt(i);
              if(ch==temp)
               count++;
               else
              {
                  s+=temp+""+count+"";
                  temp=ch;
                  count=1;
              }
          }
          s+=temp+""+count+"";
          
          return s;
