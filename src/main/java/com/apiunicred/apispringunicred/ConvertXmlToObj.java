package com.apiunicred.apispringunicred;

import com.apiunicred.apispringunicred.banco.*;
import com.apiunicred.apispringunicred.modelo.Root;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertXmlToObj {
    public DocResponse returnObj() {
        String caminho = "src/arquivoXML/modelo.xml";
        Path path = Paths.get(caminho);
        try {
            String content = Files.readString(path);
            JSONObject xmlJson = XML.toJSONObject(content);
            String stringJson = xmlJson.toString();

            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            Root root = mapper.readValue(stringJson, Root.class);

            LiquidResponse liqRes = LiquidResponse.builder()
                    .Grupo_SLC0001_Prodt(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getGrupo_SLC0001_Liquid()
                            .getGrupo_SLC0001_Prodt())
                    .NumSeqCicloLiquid(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getGrupo_SLC0001_Liquid()
                            .getNumSeqCicloLiquid())
                    .DtLiquid(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getGrupo_SLC0001_Liquid()
                            .getDtLiquid()).build();


            SLC0001Response slc001Res = SLC0001Response.builder()
                    .DtHrSLC(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getDtHrSLC())
                    .NumCtrlSLC(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getNumCtrlSLC())
                    .DtMovto(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getDtMovto())
                    .TpInf(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getTpInf())
                    .CodMsg(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getCodMsg())
                    .ISPBIF(root.getDOC()
                            .getSISMSG()
                            .getSLC0001()
                            .getISPBIF())
                    .Grupo_SLC0001_Liquid(liqRes).build();

            SismsgResponse sismsgResponse = SismsgResponse.builder()
                    .SLC0001(slc001Res).build();

            Grupo_SeqResponse grupo_seqResponse = Grupo_SeqResponse.builder()
                    .NumSeq(root.getDOC()
                            .getBCMSG()
                            .getGrupo_Seq()
                            .getNumSeq())
                    .IndrCont(root.getDOC()
                            .getBCMSG()
                            .getGrupo_Seq()
                            .getIndrCont()).build();

            BcmsgResponse bcmsgResponse = BcmsgResponse.builder()
                    .NUOp(root.getDOC()
                            .getBCMSG()
                            .getNUOp())
                    .DomSist(root.getDOC()
                            .getBCMSG()
                            .getDomSist())
                    .IdentdDestinatario(root.getDOC()
                            .getBCMSG()
                            .getIdentdDestinatario())
                    .IdentdEmissor(root.getDOC()
                            .getBCMSG()
                            .getIdentdEmissor())
                    .Grupo_Seq(grupo_seqResponse).build();

            DocResponse docResponse = DocResponse.builder()
                    .xmlns(root.getDOC().getXmlns())
                    .BCMSG(bcmsgResponse)
                    .SISMSG(sismsgResponse).build();

            return docResponse;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    };
}
