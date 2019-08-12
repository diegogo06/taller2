package signoZodiacal;
import static signoZodiacal.ZodiacalString.*;
public class ZodiacalLogica extends Zodiacal{
    public String zodiacal()  {
      if(getMes()==3 && getDia()<21)
      {return SIGNO_ARIES.getMensaje();}
      else
          if(getMes()==4&&getDia()<21)
          {return SIGNO_TAURO.getMensaje();}
          else
              if(getMes()==5&&getDia()<22)
              {return SIGNO_GEMINIS.getMensaje();}
              else
              if(getMes()==6&&getDia()<23)
              {return SIGNO_CANCER.getMensaje();}
              else
              if(getMes()==7&&getDia()<24)
              {return SIGNO_LEO.getMensaje();}
              else
              if(getMes()==8&&getDia()<24)
              {return SIGNO_VIRGO.getMensaje();}
              else
              if(getMes()==9&&getDia()<23)
              {return SIGNO_LIBRA.getMensaje();}
              else
              if(getMes()==10&&getDia()<23)
              {return SIGNO_ESCORPION.getMensaje();}
              else
              if(getMes()==11&&getDia()<23)
              {return SIGNO_SAGITARIO.getMensaje();}
              else
              if(getMes()==12&&getDia()<20)
              {return SIGNO_CAPRICORNIO.getMensaje();}
              else
              if(getMes()==1&&getDia()<20)
              {return SIGNO_ACUARIO.getMensaje();}
              else
              if(getMes()==2&&getDia()<21)
              {return SIGNO_PISIS.getMensaje();}
              else
              {return SIGNO_NO.getMensaje();}

    }

}
