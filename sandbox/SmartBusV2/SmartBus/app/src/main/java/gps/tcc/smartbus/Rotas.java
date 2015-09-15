package gps.tcc.smartbus;

import android.content.Context;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Rafael on 21/08/2015.
 */
public class Rotas
{



   Context context;

    public Rotas (Context context)
    {
        this.context = context;
    }
    public ArrayList<LatLng> pontoVolta = new ArrayList<LatLng>();

   public static ArrayList<LatLng> linha154Ida()
    {

        ArrayList<LatLng> pontoIda = new ArrayList<LatLng>();
        // ArrayList<LatLng> pontoVolta = new ArrayList<LatLng>();
         //ArrayList<LatLng> pontoIda = new ArrayList<LatLng>();

        pontoIda.add(new LatLng(-23.938046, -46.384522));//ida RADIO CLUBE FAZENDINHA I
        pontoIda.add(new LatLng(-23.938535, -46.387567));//Ida AV BRIGADEIRO FARIA LIMA 1280
        pontoIda.add(new LatLng(-23.9409, -46.384483));//Ida AV VEREADOR aLVARO GUIMARaES 436 LO
        pontoIda.add(new LatLng(-23.942135, -46.382644));//Ida AV VEREADOR aLVARO GUIMARaES 209
        pontoIda.add(new LatLng(-23.9438, -46.380266));//Ida AV VEREADOR aLVARO GUIMARaES 49 09
        pontoIda.add(new LatLng(-23.942537, -46.377472));//Ida AV DOM JAIME DE BARROS CaMARA 193
        pontoIda.add(new LatLng(-23.941, -46.3768));//Ida RUA PROFESSOR MaRIO G C BRITO 31*/
        pontoIda.add(new LatLng(-23.939966,-46.3761));//Ida RUA JOSe DIAS DE MORAES 783
        return pontoIda;

       /** pontoVolta.add(new LatLng(-23.971535, -46.324082));//volta AV CONSELHEIRO NeBIAS 833 B
        pontoVolta.add(new LatLng(-23.968689, -46.323829));//Volta AV CONSELHEIRO NeBIAS 786
        pontoVolta.add(new LatLng(-23.965267, -46.323552));//Volta AV CONSELHEIRO NeBIAS 699
        pontoVolta.add(new LatLng(-23.962031, -46.323182));//Volta AV CONSELHEIRO NeBIAS 640
        pontoVolta.add(new LatLng(-23.95997, -46.323022));//Volta AV CONSELHEIRO NeBIAS 588
        pontoVolta.add(new LatLng(-23.958096, -46.322832));//Volta AV CONSELHEIRO NeBIAS 549
        pontoVolta.add(new LatLng(-23.954978, -46.322517));//Volta AV CONSELHEIRO NeBIAS 473*/

    }





           /*
        {"lat":-23.939966,"lng":-46.3761}Ida RUA JOSÉ DIAS DE MORAES, 783
        {"lat":-23.95117,"lng":-46.322159}Volta AV. CONSELHEIRO NÉBIAS, 390
        {"lat":-23.940783,"lng":-46.3745}Ida AV. JOVINO DE MELO HORTO MUNICIPAL
        {"lat":-23.948139,"lng":-46.321887}Volta AV. CONSELHEIRO NÉBIAS, 327
        {"lat":-23.942066,"lng":-46.372366}Ida AV. JOVINO DE MELO, 519
        {"lat":-23.946775,"lng":-46.321739}Volta AV. CONSELHEIRO NÉBIAS, 300 (02)
        {"lat":-23.943383,"lng":-46.370333}Ida AV. JOVINO DE MELO, 283
        {"lat":-23.944394,"lng":-46.321501}Volta AV. CONSELHEIRO NÉBIAS, 251
        {"lat":-23.944316,"lng":-46.3688}Ida AV. JOVINO DE MELO, 80
        {"lat":-23.942527,"lng":-46.321331}Volta AV. CONSELHEIRO NÉBIAS, 227
        {"lat":-23.943737,"lng":-46.367209}Ida AV. NOSSA SENHORA DE FÁTIMA, 625
        {"lat":-23.940643,"lng":-46.321193}Volta AV. CONSELHEIRO NÉBIAS, 187
        {"lat":-23.942129,"lng":-46.36591}Ida AV. NOSSA SENHORA DE FÁTIMA, 551
        {"lat":-23.937789,"lng":-46.32087}Volta AV. CONSELHEIRO NÉBIAS, 107
        {"lat":-23.940495,"lng":-46.364597}Ida AV. NOSSA SENHORA DE FÁTIMA, 495
        {"lat":-23.935957,"lng":-46.322191}Volta AV. JOÃO PESSOA, 325
        {"lat":-23.93683,"lng":-46.362804}Ida AV. NOSSA SENHORA DE FÁTIMA, 353LO - SESI
        {"lat":-23.935813,"lng":-46.322806}Volta AV. JOÃO PESSOA, 307
        {"lat":-23.934756,"lng":-46.361164}Ida AV. NOSSA SENHORA DE FÁTIMA, 271
        {"lat":-23.935509,"lng":-46.324278}Volta RUA JOÃO PESSOA, 257
        {"lat":-23.932614,"lng":-46.357376}Ida AV. NOSSA SENHORA DE FÁTIMA, 105
        {"lat":-23.934802,"lng":-46.327848}Volta AV. JOÃO PESSOA, 97
        {"lat":-23.931345,"lng":-46.356332}Ida AV. NOSSA SENHORA DE FÁTIMA, (ASSAI)
            {"lat":-23.93447,"lng":-46.329982}Volta AV. JOÃO PESSOA, 9
        {"lat":-23.930333,"lng":-46.35365}Ida AV. MARTINS FONTES, 1557
        {"lat":-23.935766,"lng":-46.33349}Volta TERMINAL VALONGO (PLATAFORMA E)
        {"lat":-23.930616,"lng":-46.351616}Ida AV. MARTINS FONTES, 1277
        {"lat":-23.934074,"lng":-46.333521}Volta RUA ALEXANDRE RODRIGUES, 20
        {"lat":-23.930966,"lng":-46.34915}Ida AV. MARTINS FONTES, 1075
        {"lat":-23.93275,"lng":-46.335116}Volta AV. VISCONDE DE SÃO LEOPOLDO, 438
        {"lat":-23.930608,"lng":-46.346808}Ida AV. MARTINS FONTES (SABOO IDA)
        {"lat":-23.9322,"lng":-46.336216}Volta AV. VISCONDE DE SÃO LEOPOLDO, 584
        {"lat":-23.929911,"lng":-46.341222}Ida AV. MARTINS FONTES, 197 (RADAR - I)
        {"lat":-23.93135,"lng":-46.3379}Volta AV. VISCONDE DE SÃO LEOPOLDO PRAÇA LIONS
        {"lat":-23.932311,"lng":-46.337616}Ida AV. GETÚLIO DORNELLES VARGAS (POSTO)
        {"lat":-23.92975,"lng":-46.34105}Volta AV. MARTINS FONTES, 197
        {"lat":-23.9338,"lng":-46.336033}Ida PÇA MANUEL DE ALMEIDA - TERMINAL VALONGO
        {"lat":-23.9301,"lng":-46.346583}Volta AV. MARTINS FONTES (SABOÓ VOLTA)
        {"lat":-23.934867,"lng":-46.333625}Ida TERMINAL VALONGO (PLATAFORMA C)
        {"lat":-23.930033,"lng":-46.353783}Volta AV. MARTINS FONTES, (QUATRO PISTAS)
        {"lat":-23.936727,"lng":-46.329611}Ida AV. SÃO FRANCISCO, 128
        {"lat":-23.931374,"lng":-46.356543}Volta AV. N. SENHORA DE FÁTIMA, 54 (ASSAI)
            {"lat":-23.937333,"lng":-46.326703}Ida AV. SÃO FRANCISCO, 164
        {"lat":-23.933056,"lng":-46.358366}Volta AV. NOSSA SENHORA DE FÁTIMA, 16
        {"lat":-23.93941,"lng":-46.325874}Ida AV. SENADOR FEIJÓ, 214
        {"lat":-23.934501,"lng":-46.361046}Volta AV. NOSSA SENHORA DE FÁTIMA, 254
        {"lat":-23.943116,"lng":-46.326283}Ida AV. SENADOR FEIJÓ, 353
        {"lat":-23.936365,"lng":-46.362869}Volta AV. NOSSA SENHORA DE FÁTIMA, 353(SESI)
            {"lat":-23.943266,"lng":-46.328316}Ida AV. RANGEL PESTANA, 94 LO
        {"lat":-23.93985,"lng":-46.364473}Volta AV. NOSSA SENHORA DE FÁTIMA, 460
        {"lat":-23.943647,"lng":-46.330045}Ida AV. ANA COSTA (PRAÇA BELMIRO RIBEIRO)
        {"lat":-23.942148,"lng":-46.36616}Volta AV. NOSSA SENHORA DE FÁTIMA, 554
        {"lat":-23.946467,"lng":-46.330409}Ida AV. ANA COSTA, 64
        {"lat":-23.943311,"lng":-46.367071}Volta AV. NOSSA SENHORA DE FÁTIMA, 592
        {"lat":-23.949038,"lng":-46.33074}Ida AV. ANA COSTA, 134
        {"lat":-23.94581,"lng":-46.369071}Volta AV. NOSSA SENHORA DE FÁTIMA, 826
        {"lat":-23.952682,"lng":-46.331176}Ida AV. ANA COSTA, 198
        {"lat":-23.944733,"lng":-46.370933}Volta RUA PROFESSOR FRANCISCO DI DOMENICO, 230
        {"lat":-23.954542,"lng":-46.33141}Ida AV. ANA COSTA, 246
        {"lat":-23.943716,"lng":-46.3724}Volta RUA PROFESSOR FRANCISCO DI DOMENICO, 400
        {"lat":-23.958597,"lng":-46.331887}Ida AV. ANA COSTA (HIPERMERCADO EXTRA)
        {"lat":-23.942616,"lng":-46.374016}Volta RUA PROFESSOR FRANCISCO DI DOMENICO, 610
        {"lat":-23.962276,"lng":-46.332338}Ida AV. ANA COSTA, 410
        {"lat":-23.942066,"lng":-46.37485}Volta RUA PROFESSOR FRANCISCO DI DOMENICO, 711
        {"lat":-23.964221,"lng":-46.332552}Ida AV. ANA COSTA, 454
        {"lat":-23.940883,"lng":-46.3766}Volta RUA PROFESSOR FRANCISCO DI DOMENICO, 942
        {"lat":-23.966604,"lng":-46.332806}Ida AV. ANA COSTA, 530
        {"lat":-23.941466,"lng":-46.377333}Volta AV. DOM JAIME DE BARROS CÂMARA, 91
        {"lat":-23.969924,"lng":-46.332182}Ida AV. VICENTE DE CARVALHO, 92 LO
        {"lat":-23.969924,"lng":-46.332182}Ida AV. VICENTE DE CARVALHO, 92 LO
        {"lat":-23.942814,"lng":-46.377713}Volta PRAÇA DR. BRUNO BARBOSA
        {"lat":-23.97057,"lng":-46.329917}Ida AV. VICENTE DE CARVALHO, 57 LO
        {"lat":-23.943616,"lng":-46.380333}Volta AV. VEREADOR ÁLVARO GUIMARÃES, 49 (01)
        {"lat":-23.971768,"lng":-46.326464}Ida AV. VICENTE DE CARVALHO, 24 LO
        {"lat":-23.942616,"lng":-46.381783}Volta AV. VEREADOR ÁLVARO GUIMARÃES, 113
        {"lat":-23.971536,"lng":-46.324143}Ida AV. CONSELHEIRO NÉBIAS, 833 (A)
            {"lat":-23.941922,"lng":-46.382828}Volta AV. VEREADOR ÁLVARO GUIMARÃES, 230
        {"lat":-23.9408,"lng":-46.3845}Volta AV. VEREADOR ÁLVARO GUIMARÃES, 436
        {"lat":-23.939893,"lng":-46.385281}Volta PRAÇA JERÔNIMO LA TERZA
        {"lat":-23.939315,"lng":-46.385053}Volta AV. GOVERNADOR ROBERTO DA SILVEIRA LO130
        {"lat":-23.938046,"lng":-46.384523}Volta RÁDIO CLUBE FAZENDINHA - B
        {"lat":-23.9438,"lng":-46.380266}Volta AV. VEREADOR ÁLVARO GUIMARÃES, 49 (09)
        {"lat":-23.951252,"lng":-46.322161}Volta
        {"lat":-23.939416,"lng":-46.325886}Ida
        {"lat":-23.969985,"lng":-46.332157}Ida
        {"lat":-23.962286133549,"lng":-46.3323497772217}Ida
        {"lat":-23.966639,"lng":-46.332916}Ida
        {"lat":-23.932814,"lng":-46.335118}Volta
        {"lat":-23.92989,"lng":-46.341205}Ida
        {"lat":-23.942129,"lng":-46.36591}Ida
        {"lat":-23.94206666,"lng":-46.37236666}Ida
        {"lat":-23.943743,"lng":-46.380402}Ida
        */

    public void linha37()
    {
        /*{"lat":-23.932647,"lng":-46.326836}Ida PRAÇA BARÃO
{"lat":-23.968559,"lng":-46.353087}Volta AV. PRESIDENTE WILSON, 2015
{"lat":-23.933087,"lng":-46.325579}Ida PRAÇA DA REPÚBLICA, 63
{"lat":-23.968227,"lng":-46.349595}Volta AV. PRESIDENTE WILSON, 163
{"lat":-23.934916,"lng":-46.325466}Ida AV. SENADOR FEIJÓ, 90
{"lat":-23.967934,"lng":-46.347411}Volta AV. PRESIDENTE WILSON, 143
{"lat":-23.937016,"lng":-46.32565}Ida PRAÇA JOSÉ BONIFÁCIO, 37
{"lat":-23.968077,"lng":-46.344755}Volta AV. PRESIDENTE WILSON, 114
{"lat":-23.93941,"lng":-46.325874} AV. SENADOR FEIJÓ, 214
{"lat":-23.968153,"lng":-46.341214}Volta AV. PRESIDENTE WILSON, 78
{"lat":-23.943116,"lng":-46.326283}Ida AV. SENADOR FEIJÓ, 353
{"lat":-23.969027,"lng":-46.336027}Volta AV. PRESIDENTE WILSON, 33
{"lat":-23.94325,"lng":-46.327366}Ida AV. RANGEL PESTANA, 68
{"lat":-23.966995,"lng":-46.332628}Volta PRAÇA DA INDEPENDÊNCIA, 530
{"lat":-23.9429,"lng":-46.329616}Ida AV. RANGEL PESTANA / COL. CESÁRIO BASTOS
{"lat":-23.964717,"lng":-46.332443}Volta AV. ANA COSTA, 453
{"lat":-23.942733,"lng":-46.332233}Ida AV. RANGEL PESTANA, 164
{"lat":-23.962061,"lng":-46.332148}Volta AV. ANA COSTA, 401
{"lat":-23.944466,"lng":-46.335166}Ida AV DR. CLAUDIO L. DA COSTA, 50(STA CASA)
{"lat":-23.959889,"lng":-46.331836}Volta AV. ANA COSTA, 363
{"lat":-23.948049,"lng":-46.337933}Ida AV. SENADOR PINHEIRO MACHADO, 334
{"lat":-23.95595,"lng":-46.331333}Volta AV. ANA COSTA, 299
{"lat":-23.949167,"lng":-46.339753}Ida AV. SENADOR PINHEIRO MACHADO, 376
{"lat":-23.954419,"lng":-46.331177}Volta AV. ANA COSTA, 251
{"lat":-23.950643,"lng":-46.341982}Ida AV. SENADOR PINHEIRO MACHADO, 468
{"lat":-23.95246,"lng":-46.330944}Volta AV. ANA COSTA, 199
{"lat":-23.951679,"lng":-46.343761}Ida AV. SENADOR PINHEIRO MACHADO, 520
{"lat":-23.95031,"lng":-46.330711}Volta AV. ANA COSTA, 151
{"lat":-23.954717,"lng":-46.344475}Ida AV. SENADOR PINHEIRO MACHADO , 618
{"lat":-23.947495,"lng":-46.33029}Volta AV. ANA COSTA, 89
{"lat":-23.95704,"lng":-46.344741}Ida AV. SENADOR PINHEIRO MACHADO, 678
{"lat":-23.945332,"lng":-46.329149}Volta RUA LUCAS FORTUNATO, 107
{"lat":-23.958418,"lng":-46.344908}Ida AV. SENADOR PINHEIRO MACHADO, 724
{"lat":-23.945583,"lng":-46.327186}Volta- RUA LUCAS FORTUNATO, 55
{"lat":-23.959858,"lng":-46.345103}Ida AV. SENADOR PINHEIRO MACHADO, 786
{"lat":-23.944834,"lng":-46.325107}Volta RUA BRAZ CUBAS, 340
{"lat":-23.96121,"lng":-46.345257}Ida AV. SENADOR PINHEIRO MACHADO, 842
{"lat":-23.9428,"lng":-46.32505}Volta RUA BRÁS CUBAS, 289
{"lat":-23.963506,"lng":-46.345519}Ida- AV. SENADOR PINHEIRO MACHADO, 950
{"lat":-23.940183,"lng":-46.324933}Volta RUA BRÁZ CUBAS, 196
{"lat":-23.965447,"lng":-46.345764}Ida AV. SENADOR PINHEIRO MACHADO, 998
{"lat":-23.938,"lng":-46.324616}Volta RUA BRÁZ CUBAS, 119
{"lat":-23.967675,"lng":-46.347669}Ida AV. PRESIDENTE WILSON, 143
{"lat":-23.934733,"lng":-46.324466}Volta RUA BRÁZ CUBAS, 54
{"lat":-23.967818,"lng":-46.349071}Ida AV. PRESIDENTE WILSON, 156
{"lat":-23.934133,"lng":-46.326483}Volta RUA GENERAL CÂMARA, 118
{"lat":-23.968165,"lng":-46.351746}Ida AV. PRESIDENTE WILSON, 182
{"lat":-23.934066,"lng":-46.327283}Volta RUA GENERAL CÂMARA, 73
{"lat":-23.968451,"lng":-46.354052}Ida AV. PRESIDENTE WILSON, 200
{"lat":-23.932328,"lng":-46.326977}Volta PRAÇA BARÃO DO RIO BRANCO
{"lat":-23.96857,"lng":-46.353431}Ida AV. PRESIDENTE WILSON, 2015
{"lat":-23.937016,"lng":-46.32565}Volta PRAÇA JOSÉ BONIFÁCIO, 37
{"lat":-23.932328,"lng":-46.326977}Volta
{"lat":-23.934067,"lng":-46.327283}Volta*/
    }
    public void linha40()
    {
        /*{"lat":-23.932647,"lng":-46.326836}Ida PRAÇA BARÃO
        {"lat":-23.968559,"lng":-46.353087}
        Volta AV. PRESIDENTE WILSON, 2015
        {"lat":-23.933087,"lng":-46.325579}Ida PRAÇA DA REPÚBLICA, 63
        {"lat":-23.96755,"lng":-46.350466}Volta RUA NEWTON PRADO, 4
        {"lat":-23.934916,"lng":-46.325466}Ida AV. SENADOR FEIJÓ, 90
        {"lat":-23.966321,"lng":-46.349033}Volta PRAÇA WASHNGTON, 79
        {"lat":-23.937016,"lng":-46.32565}Ida PRAÇA JOSÉ BONIFÁCIO, 37
        {"lat":-23.965295,"lng":-46.348558}Volta AV. FRANCISCO GLICÉRIO, 670
        {"lat":-23.939883,"lng":-46.325083}Ida RUA SETE DE SETEMBRO, 19
        {"lat":-23.964433,"lng":-46.34613}Volta AV. FRANCISCO GLICÉRIO, 617
        {"lat":-23.939946,"lng":-46.324311}Ida RUA SETE DE SETEMBRO, 34
        {"lat":-23.964266,"lng":-46.34425}Volta
        {"lat":-23.940513,"lng":-46.321398}Ida RUA SETE SETEMBRO, 62
        {"lat":-23.966266,"lng":-46.343172}Volta RUA FLORIANO PEIXOTO, 265
        {"lat":-23.945364,"lng":-46.321731}Ida AV. CONSELHEIRO NÉBIAS, 271
        {"lat":-23.96674,"lng":-46.339811}Volta RUA FLORIANO PEIXOTO, 211
        {"lat":-23.947011,"lng":-46.321875}Ida AV. CONSELHEIRO NÉBIAS, 300
        {"lat":-23.96693,"lng":-46.337292},Volta AV. MARECHAL FLORIANO PEIXOTO, 119
        {"lat":-23.950431,"lng":-46.322206}Ida AV. CONSELHEIRO NÉBIAS, 388
        {"lat":-23.967283,"lng":-46.333733}Volta RUA FLORIANO PEIXOTO, 27
        {"lat":-23.954497,"lng":-46.322605}Ida AV. CONSELHEIRO NÉBIAS, 474
        {"lat":-23.967566,"lng":-46.331433}Volta RUA GALEÃO CARVALHAL, 42
        {"lat":-23.956769,"lng":-46.322821}Ida AV. CONSELHEIRO NÉBIAS, 524
        {"lat":-23.967694,"lng":-46.330103}Volta RUA GALEÃO CARVALHAL, 15
        {"lat":-23.960097,"lng":-46.323143}Ida AV. CONSELHEIRO NÉBIAS, 592
        {"lat":-23.968333,"lng":-46.324166}Volta RUA MINAS GERAIS, 1
        {"lat":-23.963472,"lng":-46.323454}Ida AV. CONSELHEIRO NÉBIAS (668)
        {"lat":-23.965267,"lng":-46.323552}Volta AV. CONSELHEIRO NÉBIAS, 699
        {"lat":-23.9663,"lng":-46.327466}Ida RUA AZEVEDO SODRÉ, 82
        {"lat":-23.962031,"lng":-46.323182}Volta AV. CONSELHEIRO NÉBIAS, 640
        {"lat":-23.966169,"lng":-46.330036}Ida RUA AZEVEDO SODRÉ, 112
        {"lat":-23.95997,"lng":-46.323022}Volta AV. CONSELHEIRO NÉBIAS, 588
        {"lat":-23.965783,"lng":-46.332983}Ida RUA CLAUDIO DONEAUX, S/N
        {"lat":-23.958096,"lng":-46.322832}Volta AV. CONSELHEIRO NÉBIAS, 549
        {"lat":-23.965733,"lng":-46.335966}Ida RUA EUCLIDES DA CUNHA, 71
        {"lat":-23.954978,"lng":-46.322517}Volta AV. CONSELHEIRO NÉBIAS, 473
        {"lat":-23.965408,"lng":-46.338168}Ida RUA EUCLIDES DA CUNHA, 137
        {"lat":-23.95117,"lng":-46.322159}Volta AV. CONSELHEIRO NÉBIAS, 390
        {"lat":-23.96515,"lng":-46.34075}Ida RUA EUCLIDES DA CUNHA, 206
        {"lat":-23.948139,"lng":-46.321887}Volta AV. CONSELHEIRO NÉBIAS, 327
        {"lat":-23.96485,"lng":-46.3442}Ida RUA EUCLIDES DA CUNHA, 280
        {"lat":-23.946775,"lng":-46.321739}Volta AV. CONSELHEIRO NÉBIAS, 300
        {"lat":-23.965447,"lng":-46.345764}Ida AV. SENADOR PINHEIRO MACHADO, 998
        {"lat":-23.944394,"lng":-46.321501}Volta AV. CONSELHEIRO NÉBIAS, 251
        {"lat":-23.965889,"lng":-46.348432}Ida RUA BARÃO DE PENEDO, 46
        {"lat":-23.942527,"lng":-46.321331}Volta AV. CONSELHEIRO NÉBIAS, 227
        {"lat":-23.965516,"lng":-46.351633}Ida PRAÇA WASHINGTON, 38
        {"lat":-23.940643,"lng":-46.321193}Volta AV. CONSELHEIRO NÉBIAS, 187
        {"lat":-23.96795,"lng":-46.35285}Ida RUA SANTA CATARINA, 202
        {"lat":-23.937789,"lng":-46.32087}Volta AV. CONSELHEIRO NÉBIAS, 107
        {"lat":-23.968451,"lng":-46.354052}Ida AV. PRESIDENTE WILSON, 200
        {"lat":-23.935143,"lng":-46.320624}Volta AV. CONSELHEIRO NEBIAS, 42
        {"lat":-23.96857,"lng":-46.353431}Ida AV. PRESIDENTE WILSON, 2015
        {"lat":-23.934416,"lng":-46.322716}Volta RUA GENERAL CÂMARA, 274
        {"lat":-23.934449999999998,"lng":-46.324216}Volta RUA GENERALCAMARA, 209
        {"lat":-23.934133,"lng":-46.326483}Volta RUA GENERAL CÂMARA, 118
        {"lat":-23.934066,"lng":-46.327283}Volta RUA GENERAL CÂMARA, 73
        {"lat":-23.932328,"lng":-46.326977}Volta PRAÇA BARÃO DO RIO BRANCO
        "lat":-23.937016,"lng":-46.32565}Volta PRAÇA JOSÉ BONIFÁCIO, 37
    {"lat":-23.934067,"lng":-46.327283}Volta
    {"lat":-23.96551666,"lng":-46.35163333}Ida*/
    }
    public void linha19()
    {
        /*
        {"lat":-23.93287,"lng":-46.325447}Ida PRAÇA DA REPUBLICA, S/N
{"lat":-23.986915,"lng":-46.295073}Volta PRAÇA ALMIRANTE GAGO COUTINHO, 7 (B)
{"lat":-23.934916,"lng":-46.325466}Ida AV. SENADOR FEIJÓ, 90
{"lat":-23.989046,"lng":-46.297984}Volta AV. ALMIRANTE SALDANHA DA GAMA, 145
{"lat":-23.937016,"lng":-46.32565}IdaPRAÇA JOSÉ BONIFÁCIO, 37
{"lat":-23.9906,"lng":-46.30091}Volta AV. ALMIRANTE SALDANHA DA GAMA, 89
{"lat":-23.939883,"lng":-46.325083}Ida RUA SETE DE SETEMBRO, 19
{"lat":-23.99132,"lng":-46.303658}Volta AV. ALMIRANTE SALDANHA DA GAMA, 194
{"lat":-23.939946,"lng":-46.324311}Ida RUA SETE DE SETEMBRO, 34
{"lat":-23.990724,"lng":-46.30599}Volta AV. BARTOLOMEU DE GUSMÃO, 174
{"lat":-23.940513,"lng":-46.321398}da RUA SETE SETEMBRO, 62
{"lat":-23.988284,"lng":-46.307743}Volta AV. BARTOLOMEU DE GUSMÃO, 155
{"lat":-23.945364,"lng":-46.321731}Ida AV. CONSELHEIRO NÉBIAS, 271
{"lat":-23.986543,"lng":-46.307809}Volta AV. BARTOLOMEU DE GUSMÃO, 15
{"lat":-23.947011,"lng":-46.321875}Ida AV. CONSELHEIRO NÉBIAS, 300 (04)
{"lat":-23.984901,"lng":-46.308572}Volta AV. BARTOLOMEU DE GUSMÃO, 138
{"lat":-23.950431,"lng":-46.322206}Ida AV. CONSELHEIRO NÉBIAS, 388
{"lat":-23.983208,"lng":-46.309752}Volta AV. BARTOLOMEU DE GUSMÃO, 127
{"lat":-23.954497,"lng":-46.322605}Ida AV. CONSELHEIRO NÉBIAS, 474
{"lat":-23.981583,"lng":-46.311349}Volta AV. BARTOLOMEU DE GUSMÃO, 111
{"lat":-23.95585,"lng":-46.321883}Ida AV. CONSELHEIRO RODRIGUES ALVES, 403
{"lat":-23.979626,"lng":-46.313302}Volta AV. BARTOLOMEU DE GUSMÃO, 93
{"lat":-23.95605,"lng":-46.320133}Ida AV. CONSELHEIRO RODRIGUES ALVES, 344
{"lat":-23.978058,"lng":-46.315317}Volta AV. BARTOLOMEU DE GUSMÃO, 74
{"lat":-23.95928,"lng":-46.319674}Ida AV.AFONSO PENA, 88
{"lat":-23.975917,"lng":-46.318205}Volta AV. BARTOLOMEU DE GUSMÃO, 49
{"lat":-23.96096,"lng":-46.317163}Ida AV. AFONSO PENA, 167
{"lat":-23.974408,"lng":-46.320652}Volta AV. BARTOLOMEU DE GUSMÃO, 33 - A
{"lat":-23.961879,"lng":-46.31579}Ida AV. AFONSO PENA, 182
{"lat":-23.973472,"lng":-46.3223}Volta AV. BARTOLOMEU DE GUSMÃO, 15 - A
{"lat":-23.962941,"lng":-46.31423}Ida AV. AFONSO PENA, 232
{"lat":-23.972234,"lng":-46.324896}Volta AV. VICENTE DE CARVALHO, 6 (A)
{"lat":-23.965053,"lng":-46.311629}Ida AV. AFONSO PENA PRAÇA CORONEL FERNANDES
{"lat":-23.970775,"lng":-46.32867}Volta AV. VICENTE DE CARVALHO, 46
{"lat":-23.966518,"lng":-46.308947}Ida AV. AFONSO PENA, 360
{"lat":-23.969765,"lng":-46.332056}Volta AV. VICENTE DE CARVALHO, 92
{"lat":-23.968104,"lng":-46.306594}Ida AV. AFONSO PENA, 446
{"lat":-23.968658,"lng":-46.336223}Volta AV. PRESIDENTE WILSON, 36
{"lat":-23.969802,"lng":-46.304062}Ida AV. AFONSO PENA, 508
{"lat":-23.968335,"lng":-46.337989}Volta AV. PRESIDENTE WILSON, 52
{"lat":-23.971641,"lng":-46.302228}Ida AV. AFONSO PENA, 586
{"lat":-23.968057,"lng":-46.340261}Volta AV. PRESIDENTE WILSON, 72
{"lat":-23.973306,"lng":-46.301922}Ida AV. AFONSO PENA, 611
{"lat":-23.967824,"lng":-46.344145}Volta AV. PRESIDENTE WILSON, 108
{"lat":-23.975983,"lng":-46.302116}Ida AV. PEDRO LESSA, 937
{"lat":-23.966978,"lng":-46.345505}Volta AV. SENADOR PINHEIRO MACHADO, 1023
{"lat":-23.976935,"lng":-46.300722}Ida AV. PEDRO LESSA, 755
{"lat":-23.964474,"lng":-46.345353}Volta AV. SENADOR PINHEIRO MACHADO, 941
{"lat":-23.978433,"lng":-46.30025}Ida AV. PROFESSOR ARISTOTELES DE MENEZES, 18
{"lat":-23.961807,"lng":-46.345064}Volta AV. SENADOR PINHEIRO MACHADO, 813
{"lat":-23.980183,"lng":-46.300166}Ida AV. PROFESSOR ARISTOTELES DE MENEZES 41
{"lat":-23.959758,"lng":-46.344825}Volta AV. SENADOR PINHEIRO MACHADO, 759
{"lat":-23.981892,"lng":-46.300806}Ida PRAÇA ENG. JOSÉ REBOUÇAS, 22
{"lat":-23.957412,"lng":-46.344498}Volta AV. SENADOR PINHEIRO MACHADO, 693
{"lat":-23.9845,"lng":-46.3019}Ida AV. DINO BUENO, 59
{"lat":-23.95555,"lng":-46.34427}Volta AV. SENADOR PINHEIRO MACHADO, 631
"lat":-23.986566,"lng":-46.303116}Ida AV. DINO BUENO, 9
{"lat":-23.953474,"lng":-46.34406}Volta AV. SENADOR PINHEIRO MACHADO, 569
{"lat":-23.988416,"lng":-46.301433}Ida AV. BANCÁRIOS, 106
{"lat":-23.951592,"lng":-46.343175}Volta AV. SENADOR PINHEIRO MACHADO, 509
{"lat":-23.98896,"lng":-46.299574}Ida AV. REI ALBERTO I, 278
{"lat":-23.950747,"lng":-46.34176}Volta AV. SENADOR PINHEIRO MACHADO, 468 LO
{"lat":-23.987601,"lng":-46.297067}Ida AV. REI ALBERTO, 364LO
{"lat":-23.949838,"lng":-46.340399}Volta AV. PINHEIRO MACHADO / PRAÇA DA BIBLIA
{"lat":-23.986915,"lng":-46.295073}Ida PÇ. ALM. GAGO COUTINHO, (POSTO IPIRANGA)
{"lat":-23.948562,"lng":-46.338295}Volta AV. SENADOR PINHEIRO MACHADO, 325
{"lat":-23.945,"lng":-46.335166}Volta AV. DR. CLAUDIO LUIZ DA COSTA, 50 LO
{"lat":-23.9428,"lng":-46.334616}Volta AV. WALDEMAR LEÃO CT DO SANTOS
{"lat":-23.936727,"lng":-46.329611}Volta AV. SÃO FRANCISCO, 128
{"lat":-23.936317,"lng":-46.326967}Volta RUA MARTIN AFONSO, 136
{"lat":-23.93287,"lng":-46.325447}Volta PRAÇA DA REPUBLICA, S/N - B
{"lat":-23.937016,"lng":-46.32565}Volta PRAÇA JOSÉ BONIFÁCIO, 37
{"lat":-23.98896097,"lng":-46.29957476}Ida
{"lat":-23.940533,"lng":-46.321581}Ida
{"lat":-23.97225,"lng":-46.3249}Volta
{"lat":-23.932883,"lng":-46.325548}Volta
{"lat":-23.932855,"lng":-46.325633}Ida
{"lat":-23.95347406,"lng":-46.34406032}Volta*/

    }
    public void linha20()
    {
        /*{"lat":-23.933837,"lng":-46.329266}Ida PRAÇA MAUA - A
{"lat":-23.966995,"lng":-46.332628}Volta PRAÇA DA INDEPENDÊNCIA, 530 (B)
{"lat":-23.935625,"lng":-46.329196}Ida RUA AMADOR BUENO, 96
{"lat":-23.964717,"lng":-46.332443}Volta AV. ANA COSTA, 453
{"lat":-23.937016,"lng":-46.32565}Ida PRAÇA JOSÉ BONIFÁCIO, 37
{"lat":-23.962061,"lng":-46.332148} AV. ANA COSTA, 401
{"lat":-23.93941,"lng":-46.325874}Ida AV. SENADOR FEIJÓ, 214
{"lat":-23.959889,"lng":-46.331836}Volta AV. ANA COSTA, 363
{"lat":-23.943116,"lng":-46.326283}Ida AV. SENADOR FEIJÓ, 353
{"lat":-23.95595,"lng":-46.331333}Volta AV. ANA COSTA, 299
{"lat":-23.943266,"lng":-46.328316}Ida AV. RANGEL PESTANA, 94 LO
{"lat":-23.954419,"lng":-46.331177}Volta AV. ANA COSTA, 251
{"lat":-23.943647,"lng":-46.330045}Ida AV. ANA COSTA (PRAÇA BELMIRO RIBEIRO)
{"lat":-23.95246,"lng":-46.330944}Volta AV. ANA COSTA, 199
{"lat":-23.946467,"lng":-46.330409}Ida AV. ANA COSTA, 64
{"lat":-23.95031,"lng":-46.330711}Volta AV. ANA COSTA, 151
{"lat":-23.949038,"lng":-46.33074}Ida AV. ANA COSTA, 134
{"lat":-23.947495,"lng":-46.33029}Volta AV. ANA COSTA, 89
{"lat":-23.952682,"lng":-46.331176}Ida AV. ANA COSTA, 198
{"lat":-23.94457,"lng":-46.32999}Volta AV. ANA COSTA, 31
{"lat":-23.954542,"lng":-46.33141}Ida AV. ANA COSTA, 246
{"lat":-23.944266,"lng":-46.328233}Volta RUA JÚLIO MESQUITA, 195
{"lat":-23.958597,"lng":-46.331887}Ida AV. ANA COSTA (HIPERMERCADO EXTRA)
{"lat":-23.944605,"lng":-46.325613}Volta RUA JÚLIO MESQUITA, 124
{"lat":-23.962276,"lng":-46.332338}Ida AV. ANA COSTA, 410
{"lat":-23.9428,"lng":-46.32505},Volta RUA BRÁS CUBAS, 289
{"lat":-23.964221,"lng":-46.332552}Ida AV. ANA COSTA, 454
{"lat":-23.940183,"lng":-46.324933}Volta RUA BRÁZ CUBAS, 196
{"lat":-23.966604,"lng":-46.332806}Ida AV. ANA COSTA, 530
{"lat":-23.938,"lng":-46.324616}Volta RUA BRÁZ CUBAS, 119
{"lat":-23.966995,"lng":-46.332628}Ida PRAÇA DA INDEPENDÊNCIA, 530 (B)
{"lat":-23.934733,"lng":-46.324466}Volta RUA BRÁZ CUBAS, 54
{"lat":-23.934133,"lng":-46.326483}Volta RUA GENERAL CÂMARA, 118
{"lat":-23.933913,"lng":-46.328516}Volta PRAÇA MAUA - B
{"lat":-23.933878,"lng":-46.328667}Volta
{"lat":-23.94364,"lng":-46.330105}Ida
{"lat":-23.958622,"lng":-46.331894}Ida*/
    }
    public void linha23()
    {
        /*
        {"lat":-23.93287,"lng":-46.325447}ida - PRAÇA DA REPUBLICA
        {"lat":-23.986244,"lng":-46.294702}volta - PRAÇA ALM. GAGO COUTINHO, MERC. PEIXE- B
        {"lat":-23.934334,"lng":-46.32539}ida - PONTO DE CALCULO PAINEL L23
        {"lat":-23.987784,"lng":-46.297811}volta  - AV. REI ALBERTO I, 364
        {"lat":-23.934066,"lng":-46.327283}ida - RUA GENERAL CÂMARA, 73
        {"lat":-23.988333,"lng":-46.3011}volta - AV. BANCÁRIOS, 85
        {"lat":-23.933913,"lng":-46.328516}ida - PRAÇA MAUA - B
        {"lat":-23.98745,"lng":-46.3023}volta - AV. BANCÁRIOS, 53
        {"lat":-23.933837,"lng":-46.330643}ida - PRAÇA RUI BARBOSA
        {"lat":-23.986366,"lng":-46.30265}volta - AV. DINO BUENO, 12
        {"lat":-23.934297,"lng":-46.332505}ida - PRAÇA DOS ANDRADAS
        {"lat":-23.983966,"lng":-46.301499}volta - AV. DINO BUENO
        {"lat":-23.940666,"lng":-46.334766}ida - AV. WALDEMAR LEÃO
        {"lat":-23.982183,"lng":-46.3004}volta - AV. DINO BUENO, 120
        {"lat":-23.944466,"lng":-46.335166}ida - AV DR. CLAUDIO L. DA COSTA, 50(STA CASA)
        {"lat":-23.9816,"lng":-46.299083}volta - PRAÇA ENG. JOSÉ REBOUÇAS
        {"lat":-23.948049,"lng":-46.337933}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.979866,"lng":-46.299866}volta - AV. PROFESSOR ARISTOTELES DE MENEZES
        {"lat":-23.949167,"lng":-46.339753}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.97856,"lng":-46.299759}volta - PRAÇA WINSTON CHURCHIL
        {"lat":-23.950643,"lng":-46.341982}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.977235,"lng":-46.299886}volta - AV. PEDRO LESSA, 666
        {"lat":-23.951679,"lng":-46.343761}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.976314,"lng":-46.299217}volta - AV. CORONEL JOAQUIM MONTENEGRO
        {"lat":-23.954717,"lng":-46.344475}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.975239,"lng":-46.299538}volta - AV. AFONSO PENA, 689
        {"lat":-23.95704,"lng":-46.344741}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.974047,"lng":-46.301296}volta - AV. AFONSO PENA, 627
        {"lat":-23.958418,"lng":-46.344908}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.971849,"lng":-46.301982}volta - AV. AFONSO PENA P.S. MACUCO
        {"lat":-23.959858,"lng":-46.345103}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.970195,"lng":-46.303061}volta - AV. AFONSO PENA, 544
        {"lat":-23.96121,"lng":-46.345257}ida - AV. SENADOR PINHEIRO MACHADO, 842
        {"lat":-23.969209,"lng":-46.304499}volta - AV. AFONSO PENA, 465
        {"lat":-23.963506,"lng":-46.345519}ida - AV. SENADOR PINHEIRO MACHADO
        {"lat":-23.967357,"lng":-46.307326}volta - AV. AFONSO PENA, 393
        {"lat":-23.965447,"lng":-46.345764}ida - AV. SENADOR PINHEIRO MACHADO, 998
        {"lat":-23.966711,"lng":-46.308275}volta - AV. AFONSO PENA, 363
        {"lat":-23.967675,"lng":-46.347669}ida - AV. PRESIDENTE WILSON, 143
        {"lat":-23.965573,"lng":-46.309943}volta - AV. AFONSO PENA, 317
        {"lat":-23.967818,"lng":-46.349071}ida - AV. PRESIDENTE WILSON, 156
        {"lat":-23.964351,"lng":-46.311312}volta - AV. AFONSO PENA, 18
        {"lat":-23.968227,"lng":-46.349595}ida - AV. PRESIDENTE WILSON, 163 LO
        {"lat":-23.963147,"lng":-46.313513}volta - AV. AFONSO PENA, 253
        {"lat":-23.967934,"lng":-46.347411}ida - AV. PRESIDENTE WILSON, 143LO
        {"lat":-23.961575,"lng":-46.31587}volta - AV. AFONSO PENA, 183
        {"lat":-23.968077,"lng":-46.344755}ida - AV. PRESIDENTE WILSON, 114 LO
        {"lat":-23.960503,"lng":-46.317533}volta - AV. AFONSO PENA, 157
        {"lat":-23.968153,"lng":-46.341214}ida - AV. PRESIDENTE WILSON, 78 LO
        {"lat":-23.958835,"lng":-46.320002}volta - AV. AFONSO PENAN, 71
        {"lat":-23.969027,"lng":-46.336027}ida - AV. PRESIDENTE WILSON, 33 LO
        {"lat":-23.957663,"lng":-46.322564}volta - AV.AFONSO PENA, 8
        {"lat":-23.969924,"lng":-46.332182}ida - AV. VICENTE DE CARVALHO, 92 LO
        {"lat":-23.969924,"lng":-46.332182}ida - AV. VICENTE DE CARVALHO, 92 LO
        {"lat":-23.954978,"lng":-46.322517}volta - AV. CONSELHEIRO NÉBIAS, 473
        {"lat":-23.97057,"lng":-46.329917}ida - AV. VICENTE DE CARVALHO, 57 LO
        {"lat":-23.95117,"lng":-46.322159}volta - AV. CONSELHEIRO NÉBIAS, 390
        {"lat":-23.971768,"lng":-46.326464}ida - AV. VICENTE DE CARVALHO, 24 LO
        {"lat":-23.948139,"lng":-46.321887}volta - AV. CONSELHEIRO NÉBIAS, 327
        {"lat":-23.973476,"lng":-46.322566}ida - AV. BARTOLOMEU DE GUSMÃO, 15 LO
        {"lat":-23.946775,"lng":-46.321739}volta - AV. CONSELHEIRO NÉBIAS, 300 (02)
        {"lat":-23.975363,"lng":-46.319595}ida - AV. BARTOLOMEU DE GUSMÃO, 39 LO
        {"lat":-23.944394,"lng":-46.321501}volta - AV. CONSELHEIRO NÉBIAS, 251
        {"lat":-23.976221,"lng":-46.317974}ida - AV. BARTOLOMEU DE GUSMÃO, 53 LO
        {"lat":-23.942527,"lng":-46.321331}volta - AV. CONSELHEIRO NÉBIAS, 227
        {"lat":-23.978449,"lng":-46.315092}ida - AV. BARTOLOMEU DE GUSMÃO, 74
        {"lat":-23.940643,"lng":-46.321193}volta - AV. CONSELHEIRO NÉBIAS, 187
        {"lat":-23.980127,"lng":-46.313082}ida - AV. BARTOLOMEU DE GUSMÃO, 97 LO
        {"lat":-23.937789,"lng":-46.32087}volta - AV. CONSELHEIRO NÉBIAS, 107
        {"lat":-23.981761,"lng":-46.311458}ida - AV. BARTOLOMEU DE GUSMÃO, 111 LO
        {"lat":-23.935143,"lng":-46.320624}volta - AV. CONSELHEIRO NEBIAS, 42
        {"lat":-23.983446,"lng":-46.309767}ida - AV. BARTOLOMEU DE GUSMÃO
        {"lat":-23.934416,"lng":-46.322716}volta - RUA GENERAL CÂMARA, 274
        {"lat":-23.987268,"lng":-46.30848}ida - AV. BARTOLOMEU DE GUSMÃO, 159 LO
        {"lat":-23.934449999999998,"lng":-46.324216}volta - RUA GENERALCAMARA, 209
        {"lat":-23.991031,"lng":-46.305776}ida - AV. ALMIRANTE SALDANHA DA GAMA L S/N
        {"lat":-23.933685,"lng":-46.326436}volta - RUA MARTIN AFONSO, 30
        {"lat":-23.991514,"lng":-46.303209}ida - AV. ALMIRANTE SALDANHA DA GAMA, 63
        {"lat":-23.93287,"lng":-46.325447}volta - PRAÇA DA REPUBLICA, S/N - B
        {"lat":-23.990432,"lng":-46.300263}ida - AV. ALMIRANTE SALDANHA DA GAMA, 96
        {"lat":-23.933913,"lng":-46.328516}volta - PRAÇA MAUA - B
        {"lat":-23.98914,"lng":-46.297835}ida - AV. ALMIRANTE SALDANHA DA GAMA, 145
        {"lat":-23.986244,"lng":-46.294702}volta - PRAÇA ALM. GAGO COUTINHO, MERC. PEIXE- A
        {"lat":-23.991514,"lng":-46.303209}ida
        {"lat":-23.965573,"lng":-46.309943}volta
        {"lat":-23.93322,"lng":-46.3253}ida
        {"lat":-23.93368521,"lng":-46.32643607}volta
        {"lat":-23.949167,"lng":-46.33975399}ida
        {"lat":-23.96121,"lng":-46.345257}volta

*/
    }
/*
            Polyline linhadeTesteIda = googleMap.addPolyline(new PolylineOptions()
                    .addAll(listadePontos)
                    .width(4)
                    .color(Color.BLUE));

*/



}
