package ad;

/* renamed from: ad.m */
/* loaded from: classes.dex */
public class C0070m implements java.util.Comparator<p454zc.C7294r> {

    /* renamed from: Y */
    public final /* synthetic */ p454zc.C7294r f205Y;

    /* renamed from: Z */
    public final /* synthetic */ ad.AbstractC0071n f206Z;

    public C0070m(ad.AbstractC0071n r1, p454zc.C7294r r2) {
            r0 = this;
            r0.f206Z = r1
            r0.f205Y = r2
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public int compare(p454zc.C7294r r3, p454zc.C7294r r4) {
            r2 = this;
            zc.r r3 = (p454zc.C7294r) r3
            zc.r r4 = (p454zc.C7294r) r4
            ad.n r0 = r2.f206Z
            zc.r r1 = r2.f205Y
            float r3 = r0.mo104a(r3, r1)
            ad.n r0 = r2.f206Z
            zc.r r1 = r2.f205Y
            float r4 = r0.mo104a(r4, r1)
            int r3 = java.lang.Float.compare(r4, r3)
            return r3
    }
}
