package Ex5PlataformaStreaming;

public interface Baixavel {

    void realizarDownload(boolean conexaoEstavel)
            throws FalhaNoDownloadException;

}
