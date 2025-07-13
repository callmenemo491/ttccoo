package p276pd;

/* renamed from: pd.z1 */
/* loaded from: classes.dex */
public class C5478z1 {
    private final p276pd.C5385a abiBinaryGen;

    public C5478z1(p276pd.C5385a r1) {
            r0 = this;
            r0.<init>()
            r0.abiBinaryGen = r1
            return
    }

    public /* bridge */ /* synthetic */ void squish(java.lang.Object r1, bd.InterfaceC0733a r2) {
            r0 = this;
            pd.y1 r1 = (p276pd.C5475y1) r1
            r0.squish(r1, r2)
            return
    }

    public void squish(p276pd.C5475y1 r2, bd.InterfaceC0733a r3) {
            r1 = this;
            java.lang.String r0 = r2.getGetFrom()
            r3.mo2339b(r0)
            java.lang.String r0 = r2.getGetReceiver()
            r3.mo2339b(r0)
            java.lang.String r0 = r2.getGetStakeNetQuantity()
            r3.mo2345h(r0)
            java.lang.String r0 = r2.getGetStakeCpuQuantity()
            r3.mo2345h(r0)
            byte[] r2 = r2.getGetTransfer()
            r3.mo2338a(r2)
            return
    }
}
