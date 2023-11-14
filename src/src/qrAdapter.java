
public class qrAdapter implements QRPayment{
    private QR qr;

    public qrAdapter(QR qr){
        this.qr = qr;
    }

    @Override
    public void processQR(String qrCode) {
        qr.processqr(qrCode);
    }
}
