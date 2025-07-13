package p276pd;

/* renamed from: pd.i */
/* loaded from: classes.dex */
public class C5417i {
    private final p276pd.C5385a abiBinaryGen;

    public C5417i(p276pd.C5385a r1) {
            r0 = this;
            r0.<init>()
            r0.abiBinaryGen = r1
            return
    }

    public /* bridge */ /* synthetic */ void squish(java.lang.Object r1, bd.InterfaceC0733a r2) {
            r0 = this;
            pd.h r1 = (p276pd.C5413h) r1
            r0.squish(r1, r2)
            return
    }

    public void squish(p276pd.C5413h r2, bd.InterfaceC0733a r3) {
            r1 = this;
            java.lang.String r0 = r2.getGetSeller()
            r3.mo2339b(r0)
            byte[] r0 = r2.getGetAssetIds()
            r3.mo2338a(r0)
            java.lang.String r0 = r2.getGetListingPrice()
            r3.mo2345h(r0)
            byte[] r0 = r2.getGetSettlementSymbol()
            r3.mo2338a(r0)
            java.lang.String r2 = r2.getGetMakerMarketplace()
            r3.mo2339b(r2)
            return
    }
}
