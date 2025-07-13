package p276pd;

/* renamed from: pd.p2 */
/* loaded from: classes.dex */
public class C5448p2 {
    private final p276pd.C5385a abiBinaryGen;

    public C5448p2(p276pd.C5385a r1) {
            r0 = this;
            r0.<init>()
            r0.abiBinaryGen = r1
            return
    }

    public /* bridge */ /* synthetic */ void squish(java.lang.Object r1, bd.InterfaceC0733a r2) {
            r0 = this;
            pd.o2 r1 = (p276pd.C5444o2) r1
            r0.squish(r1, r2)
            return
    }

    public void squish(p276pd.C5444o2 r2, bd.InterfaceC0733a r3) {
            r1 = this;
            java.lang.String r0 = r2.getGetOwner()
            r3.mo2339b(r0)
            pd.a r3 = r1.abiBinaryGen
            pd.x0 r2 = r2.getGetAmount()
            r3.squishExtendedAssetArgs(r2)
            return
    }
}
