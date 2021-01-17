package br.dev.diego.mvc.mudi.controller;

import br.dev.diego.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido p1 = new Pedido();
        p1.setNomeProduto("Xiaomi Note 8 64GB");
        p1.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
        p1.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=49RSF96I5FGQ&dchild=1&keywords=xiamo+redmi+note+8&qid=1610913544&sprefix=xiam%2Caps%2C310&sr=8-1");
        p1.setDescricao("Sistema operacional: MIUI 10 (Base no sistema operacional Android 9) CPU: Qualcomm Snapdragon 665 Octa-core 2.0GHz, 64bit, GPU Adreno 610 RAM: 4GB ROM: 64GB Armazenamento estendido: 256GB ExibiçãoTipo de tela: tela capacitiva Tamanho da tela: 6,3 polegadas Resolução da tela: 2340 x 1080 Pixel FHD + telaRedeConectividade sem fio: GSM, 3G, 4G, GPS, WiFi, Bluetooth Frequência: 2G: GSM B2 / B3 / B5 / B8, CDMA: BC0 3G: WCDMA B1 / B2 / B5 / B8, TD-SCDMA B34 / B39, CDMA EVDO : BC0 4G: FDD-LTE B1 / B3 / B5 / B8, TDD-LTE B34 / B38 / B39 / B40 / B41 Bluetooth: Sim, 4.2 WiFi: Sim, 802.11a / b / g / n / ac GPS: Sim, GPS / AGPS / Glonass / BEIDONCâmeraTipo de câmera: uma frontal Quatro traseira Câmera traseira dupla: 48.0MP + 8.0MP + 2.0MP + 2.0MP Câmera frontal: 13.0MP Gravação de vídeo: SimConectividade Slot para cartão SIM: Dual Nano Cartão SIM em espera dupla (o cartão SD usará o slot 2 do SIM) Slot para cartão TF: Sim Slot USB: Tipo-C Saída de áudio: Sim (interoperabilidade na boca de carregamento) Microfone: Suportado Alto-falante: Suportado meios de comunicação Formato de vídeo: 3GP, MP4, RMVB Formato de áudio: WAV, AMR, MP3 Formato de imagem: GIF, JPEG, BMP, PNG Rádio FM: N / A SimplificadoSensorGiroscópios, Sensores de aceleração, Sensores de distância, Sensores de luz ambiente, Bússola eletrônicaCaracterísticas adicionais4G, WIFI, GPS, Bluetooth, Ebook, E-mail, Mensagens, papéis de parede, calendário, calculadora, relógio, câmera, tethering e ponto de acesso portátil, Touch ID, carregamento rápido, Type-C, etcBateria Tipo de bateria: Lítio Capacidade: Built-in 4000mAh (típico) Dimensão e peso (produto principal) Dimensão: 158.3 * 75.3 * 8.35mm Peso: 190g *ITENS INCLUSOS NA CAIXA:* 1 Smartphone Xiaomi Redmi Note 8 1 Carregador 1 Cabo USB Tipo C 1 Ferramenta de Remoção do Chip 1 Manual do Usuário 1 Capa Silicone");

        List<Pedido> pedidos = Arrays.asList(p1);

        model.addAttribute("pedidos", pedidos);

        return "home";
    }

}
