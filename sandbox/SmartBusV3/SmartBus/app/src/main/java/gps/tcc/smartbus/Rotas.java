package gps.tcc.smartbus;

import android.content.Context;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Rafael Magalhães on 12/08/2015 Agosto.
 */
public class Rotas
{
    /********VARIAVEIS LOCAIS********/
    Context context;

    /********VARIAVEIS GLOBAIS********/
    public Rotas (Context context)
    {
        this.context = context;
    }

    public static ArrayList<LatLng> linha04()
    {
        ArrayList<LatLng> ponto = new ArrayList<LatLng>();

        ponto.add(new LatLng(-23.986711, -46.295485));//Ida AV REI ALBERTO I  A
        ponto.add(new LatLng(-23.986915,-46.295073));//Ida Pc ALM GAGO COUTINHO POSTO IPIRANGA
        ponto.add(new LatLng(-23.989046,-46.297984));//Ida AV. ALMIRANTE SALDANHA DA GAMA 145
        ponto.add(new LatLng(-23.9906,-46.30091));//Ida AV ALMIRANTE SALDANHA DA GAMA 89
        ponto.add(new LatLng(-23.9897,-46.301683));//Ida RUA CAPITAO JOAO SALERMO 34
        ponto.add(new LatLng(-23.989647,-46.302842));//Ida AV REI ALBERTO 187
        ponto.add(new LatLng(-23.989449,-46.304486));//Ida AV REI ALBERTO 127
        ponto.add(new LatLng(-23.988633,-46.305412));//Ida AV DR. EPITACIO PESSOA 737
        ponto.add(new LatLng(-23.986274,-46.305913));//Ida AV DR EPITaCIO PESSOA 685
        ponto.add(new LatLng(-23.984272,-46.306411));//AV DR EPITACIO PESSOA 656
        ponto.add(new LatLng(-23.98295,-46.307266));//AV DR. EPITACIO PESSOA, 583
        ponto.add(new LatLng(-23.983208,-46.309752));//Ida AV BARTOLOMEU DE GUSMAO, 127
        ponto.add(new LatLng(-23.981583,-46.311349));//Ida AV. BARTOLOMEU DE GUSMaO, 111
        ponto.add(new LatLng(-23.979626,-46.313302));//Ida AV BARTOLOMEU DE GUSMaO 93
        ponto.add(new LatLng(-23.978058,-46.315317));//Ida AV BARTOLOMEU DE GUSMAO, 74
        ponto.add(new LatLng(-23.975917,-46.318205));//Ida AV. BARTOLOMEU DE GUSMaO, 49
        ponto.add(new LatLng(-23.974408,-46.320652));//Ida AV. BARTOLOMEU DE GUSMaO, 33 - A
        ponto.add(new LatLng(-23.973472,-46.3223));//Ida AV. BARTOLOMEU DE GUSMAO, 15 - A
        ponto.add(new LatLng(-23.971536,-46.324143));//Ida AV. CONSELHEIRO NeBIAS, 833 (A)
        /**
         * ******PONTOS SEM NECESSIDADE******
        ponto.add(new LatLng(-23.968689,-46.323829));//Ida AV. CONSELHEIRO NeBIAS, 786
        ponto.add(new LatLng(-23.965267,-46.323552));//Ida AV. CONSELHEIRO NeBIAS, 699
        ponto.add(new LatLng(-23.962031,46.323182));//Ida AV. CONSELHEIRO NEBIAS, 640
        ponto.add(new LatLng(-23.95997,-46.323022));//Ida AV. CONSELHEIRO NeBIAS, 588
        ponto.add(new LatLng(-23.958096,-46.322832));//Ida AV. CONSELHEIRO NeBIAS, 549
        ponto.add(new LatLng(-23.954978,-46.322517));//Ida AV. CONSELHEIRO NeBIAS, 473
        ponto.add(new LatLng(-23.95117,-46.322159));//Ida AV. CONSELHEIRO NeBIAS, 390
        ponto.add(new LatLng(-23.948139,-46.321887));//Ida AV. CONSELHEIRO NeBIAS, 327
        ponto.add(new LatLng(-23.946775,-46.321739));//Ida AV. CONSELHEIRO NeBIAS, 300 (02)
        ponto.add(new LatLng(-23.944394,-46.321501));//Ida AV. CONSELHEIRO NeBIAS, 251
        ponto.add(new LatLng(-23.942527,-46.321331));//Ida AV. CONSELHEIRO NeBIAS, 227
        ponto.add(new LatLng(-23.940643,-46.321193));//Ida AV. CONSELHEIRO NeBIAS, 187
        ponto.add(new LatLng(-23.937789,-46.32087));//Ida AV. CONSELHEIRO NeBIAS, 107
         ******FIM******
         */
        ponto.add(new LatLng(-23.935143,-46.320624));//Ida AV. CONSELHEIRO NEBIAS, 42
        ponto.add(new LatLng(-23.934416,-46.322716));//Ida RUA GENERAL CaMARA, 274

        /*ponto.add(new LatLng(-23.934449999999998,-46.324216));//Ida RUA GENERAL CAMARA, 209 ponto sem necessidade*/

        ponto.add(new LatLng(-23.934133,-46.326483));//Ida RUA GENERAL CaMARA, 118
        ponto.add(new LatLng(-23.933913,-46.328516));//Ida PRAcA MAUA - B

        /*ponto.add(new LatLng(-23.9906,-46.30091));//sem enderco
        ponto.add(new LatLng(-23.937491,-46.320899));//sem endereco
        ponto.add(new LatLng(-23.951252,-46.322161));//sem endereco
        ponto.add(new LatLng(-23.959972,-46.322978));//sem rencereco*/

        ponto.add(new LatLng(-23.933837,-46.329266));//Volta PRAÇA MAUA - A
        ponto.add(new LatLng(-23.935625,-46.329196));//Volta RUA AMADOR BUENO, 96
        ponto.add(new LatLng(-23.937016,-46.32565));//Volta PRAÇA JOSE BONIFaCIO, 37
        ponto.add(new LatLng(-23.939883,-46.325083));//Volta RUA SETE DE SETEMBRO, 19
        ponto.add(new LatLng(-23.939946,-46.324311));//Volta RUA SETE DE SETEMBRO, 34
        ponto.add(new LatLng(-23.940513,-46.321398));//Volta RUA SETE SETEMBRO, 62
        ponto.add(new LatLng(-23.945364,-46.321731));//Volta AV. CONSELHEIRO NEBIAS, 271
        /**ponto.add(new LatLng(-23.947011,-46.321875));//Volta AV. CONSELHEIRO NEBIAS, 300 (04)
        ponto.add(new LatLng(-23.950431,-46.322206));//Volta AV. CONSELHEIRO NEBIAS, 388
        ponto.add(new LatLng(-23.954497,-46.322605));//Volta AV. CONSELHEIRO NEBIAS, 474
        ponto.add(new LatLng(-23.956769,-46.322821));//Volta AV. CONSELHEIRO NEBIAS, 524
        ponto.add(new LatLng(-23.960097,-46.323143));//Volta AV. CONSELHEIRO NeBIAS, 592
        ponto.add(new LatLng(-23.963472,-46.323454));//Volta AV. CONSELHEIRO NEBIAS (668)*/
        ponto.add(new LatLng(-23.967969,-46.323933));// VoltaAV. CONSELHEIRO NeBIAS, 764
        ponto.add(new LatLng(-23.969743,-46.3248));//Volta RUA DR. HEITOR DE MORAES, 29
        ponto.add(new LatLng(-23.970285,-46.324824));//Volta RUA GOVERNADOR PEDRO DE TOLEDO, 12
        ponto.add(new LatLng(-23.971256,-46.322916));//Volta AV. DR. EPITACIO PESSOA, 44
        /*ponto.add(new LatLng(-23.973,-46.319649));//Volta AV. DR. EPITaCIO PESSOA, 144
        ponto.add(new LatLng(-23.974383,-46.316999));//Volta AV. DR. EPITaCIO PESSOA, 230
        ponto.add(new LatLng(-23.975716,-46.3146));//Volta AV. DR. EPITaCIO PESSOA, 297
        ponto.add(new LatLng(-23.978083,-46.311533));//Volta AV. DR. EPITaCIO PESSOA, 382
        ponto.add(new LatLng(-23.979633,-46.309516));//Volta AV. DR. EPITACIO PESSOA, 481
        ponto.add(new LatLng(-23.982249,-46.307733));//olta AV. DR. EPITÁCIO PESSOA, 574
        ponto.add(new LatLng(-23.987899,-46.305633));//Volta AV. DR. EPITÁCIO PESSOA, 662*/
        ponto.add(new LatLng(-23.987764,-46.305697));//Volta AV. DR EPITÁCIO PESSOA S/N
        ponto.add(new LatLng(-23.989479,-46.304705));//Volta AV. REI ALBERTO I, 117
        ponto.add(new LatLng(-23.989683,-46.302565));//Volta AV. REI ALBERTO I, 193
        ponto.add(new LatLng(-23.98896,-46.299574));//Volta AV. REI ALBERTO I, 278
        ponto.add(new LatLng(-23.987601,-46.297067));//Volta AV. REI ALBERTO, 364LO
        ponto.add(new LatLng(-23.987046,-46.296064));//Volta AV. REI ALBERTO I - B
        ponto.add(new LatLng(-23.986711, -46.295485));//Ida AV REI ALBERTO I  A
        return  ponto;

    }

}
