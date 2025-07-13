package p276pd;

/* renamed from: pd.m */
/* loaded from: classes.dex */
public class C5433m {
    private final p276pd.C5385a abiBinaryGen;

    public C5433m(p276pd.C5385a r1) {
            r0 = this;
            r0.<init>()
            r0.abiBinaryGen = r1
            return
    }

    public /* bridge */ /* synthetic */ void squish(java.lang.Object r1, bd.InterfaceC0733a r2) {
            r0 = this;
            pd.l r1 = (p276pd.C5429l) r1
            r0.squish(r1, r2)
            return
    }

    public void squish(p276pd.C5429l r2, bd.InterfaceC0733a r3) {
            r1 = this;
            java.lang.String r0 = r2.getGetSender()
            r3.mo2339b(r0)
            java.lang.String r0 = r2.getGetRecipient()
            r3.mo2339b(r0)
            byte[] r0 = r2.getGetSenderAssetIds()
            r3.mo2338a(r0)
            byte[] r0 = r2.getGetRecipientAssetIds()
            r3.mo2338a(r0)
            java.lang.String r2 = r2.getGetMemo()
            r3.mo2346i(r2)
            return
    }
}
