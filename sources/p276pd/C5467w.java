package p276pd;

/* renamed from: pd.w */
/* loaded from: classes.dex */
public class C5467w {
    private final p276pd.C5385a abiBinaryGen;

    public C5467w(p276pd.C5385a r1) {
            r0 = this;
            r0.<init>()
            r0.abiBinaryGen = r1
            return
    }

    public /* bridge */ /* synthetic */ void squish(java.lang.Object r1, bd.InterfaceC0733a r2) {
            r0 = this;
            pd.v r1 = (p276pd.C5464v) r1
            r0.squish(r1, r2)
            return
    }

    public void squish(p276pd.C5464v r2, bd.InterfaceC0733a r3) {
            r1 = this;
            java.lang.String r0 = r2.getGetPayer()
            r3.mo2339b(r0)
            java.lang.String r0 = r2.getGetReceiver()
            r3.mo2339b(r0)
            java.lang.String r2 = r2.getGetQuant()
            r3.mo2345h(r2)
            return
    }
}
